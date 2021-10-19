package org.paralleltest;

import org.testng.annotations.Test;

public class C {
	@Test
	private void testC1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testC1");
	}
@Test
private void testC2() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testC2");
}
@Test
private void testC3() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testC3");
}
@Test
private void testC4() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testC4");
}
@Test
private void testC5() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testC5");
}

}
