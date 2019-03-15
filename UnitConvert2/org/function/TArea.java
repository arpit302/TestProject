package org.function;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TArea {

	@Test
	public void TAreatest() throws Exception {
		float result = Area.TArea(10,new Scanner(System.in));
		assertEquals(433013,result);
		
	}

}
