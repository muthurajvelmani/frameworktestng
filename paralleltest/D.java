package org.paralleltest;

import org.testng.annotations.Test;

public class D {
	@Test
	private void testD1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testD1");
	}
@Test
private void testD2() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testD2");
}
@Test
private void testD3() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testD3");
}
@Test
private void testD4() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testD4");
}
@Test
private void testD5() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("testD5");
}

}
