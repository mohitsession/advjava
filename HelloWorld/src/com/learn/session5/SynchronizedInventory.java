package com.learn.session5;

class SynchronizedInventory {
    private int stock = 1; 

    public synchronized void withdraw() { 
        String threadName = Thread.currentThread().getName();
        
        
        if (stock > 0) {
            try { Thread.sleep(1); } catch (InterruptedException e) {} 

            stock--; 
            System.out.println(threadName + " successfully withdrew 1 item. Remaining stock: " + stock);
        } else {
            System.out.println(threadName + " FAILED to withdraw. Stock was 0.");
        }
    }
    
    public int getStock() {
        return stock;
    }
}
