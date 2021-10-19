package org.paralleltest;

import org.testng.annotations.Test;

public class B {
	@Test
	private void testB1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testB1");
	}
@Test
private void testB2() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testB2");
}
@Test
private void testB3() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testB3");
}
@Test
private void testB4() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testB4");
}
@Test
private void testB5() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testB5");
}
}
