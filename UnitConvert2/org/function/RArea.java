package org.function;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class RArea {

	@Test
	public void RAreatest() throws Exception {
		float result = Area.RArea(10,new Scanner(System.in));
		assertEquals(1000000,result);
		assertEquals(10000,result);
	}

}
