package org.function;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void testConvertcm()
	{
		assertEquals(100, Unit.convertcm(100, 1));
		assertEquals(1, Unit.convertcm(100, 2));
		assertEquals(1, Unit.convertcm(100000, 3));
	}

	
	@Test void testConvertm() 
	{ 
		assertEquals(100,Unit.convertm(1, 1));
		assertEquals(1,Unit.convertm(1, 2));
		assertEquals(1,Unit.convertm(1000, 3));
	}
	
	@Test void testConvertkm() 
	{ 
		assertEquals(100000,Unit.convertkm(1, 1));
		assertEquals(1000,Unit.convertkm(1, 2));
		assertEquals(1,Unit.convertkm(1, 3));
	}

}
