package com.learn.session5;


// Can have two implementation 
// 1) It will check number is even
// 2) Number is > 0
@FunctionalInterface
public interface Condition {
	boolean test(int n);
}
