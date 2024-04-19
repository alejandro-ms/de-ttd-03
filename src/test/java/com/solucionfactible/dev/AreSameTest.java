package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreSameTest {

	@Test
	public void validTest() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(true, AreSame.comp(a, b));
		assertTrue(AreSame.comp(new int[]{30, 1364, 0, 1, 1, 3476, 77, 48}, new int[]{12082576, 900, 1, 1, 0, 1860496, 5929, 2304}));
		assertTrue(AreSame.comp(new int[]{101, 199, 233}, new int[]{54289, 10201, 39601}));
	}

	@Test
	public void invalidTest() {
		int[] a = new int[]{21, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(false, AreSame.comp(a, b));
		assertFalse(AreSame.comp(new int[]{0, 32, 10, 2, 1, 3476, 77, 48}, new int[]{4, 900, 1, 1, 0, 1860496, 5929, 2304}));
		assertFalse(AreSame.comp(new int[]{102, 215, 333}, new int[]{54289, 10201, 39601}));
	}

	@Test(expected = RuntimeException.class)
	public void errorTests() {
		int[] a = new int[]{21, 144, 19, 161, 19, 144};
		int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
		AreSame.comp(a, b);
		AreSame.comp(null, null);
	}

}
