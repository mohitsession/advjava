package com.learn.session5;

public class InventorySyncDemo {

    static class CustomerTask implements Runnable {
        private final UnsafeInventory unsafeInv;
        private final SynchronizedInventory safeInv;
        private final boolean useSafe;

        public CustomerTask(UnsafeInventory inv) {
            this.unsafeInv = inv;
            this.safeInv = null;
            this.useSafe = false;
        }
        public CustomerTask(SynchronizedInventory inv) {
            this.safeInv = inv;
            this.unsafeInv = null;
            this.useSafe = true;
        }

        @Override
        public void run() {
            if (useSafe) {
                safeInv.withdraw();
            } else {
                unsafeInv.withdraw();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("--- Unsafe Inventory Demo (Starting Stock: 1) ---");
        UnsafeInventory unsafeInv = new UnsafeInventory();
        
        Thread t1 = new Thread(new CustomerTask(unsafeInv), "Customer-A");
        Thread t2 = new Thread(new CustomerTask(unsafeInv), "Customer-B");

        t1.start();
        t2.start();
        t1.join();
        t2.join(); 

        System.out.println("Final Unsafe Stock: " + unsafeInv.getStock());
        System.out.println("**Result:** Stock is negative (-1), violating the 'stock > 0' check!");
        
        System.out.println("\n-------------------------------------------------");
        
        System.out.println("--- Synchronized Inventory Demo (Starting Stock: 1) ---");
        SynchronizedInventory safeInv = new SynchronizedInventory();

        Thread t3 = new Thread(new CustomerTask(safeInv), "Customer-C");
        Thread t4 = new Thread(new CustomerTask(safeInv), "Customer-D");

        t3.start();
        t4.start();
        t3.join();
        t4.join(); 
        
        System.out.println("Final Synchronized Stock: " + safeInv.getStock());
        System.out.println("**Result:** Stock is 0, indicating only one successful withdrawal.");
    }
}
