package org.paralleltest;

import org.testng.annotations.Test;

public class A {
	@Test
	private void testA1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testA1");
	}
@Test
private void testA2() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testA2");
}
@Test
private void testA3() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testA3");
}
@Test
private void testA4() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testA4");
}
@Test
private void testA5() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testA5");
}


}
