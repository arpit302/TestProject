package org.function;

import java.util.Scanner;

public class Area {
	public static float TArea(float l1,Scanner sc) throws Exception
	{ 	
		
		float Area,Semiperimeter,l2;
		l2 = Unit.convert(l1, sc);
	 	Semiperimeter = (l2+l2+l2)/2;
	 	Area = ((float)Math.sqrt((Semiperimeter)*(Semiperimeter - l2)*(Semiperimeter - l2)*(Semiperimeter - l2)));
	 	return (float) Math.ceil(Area);
	}
	 
	public static float RArea(float l1,Scanner sc) throws Exception
	{
		float Area,l2;	
		l2 = Unit.convert(l1, sc);
		Area = l2 * l2;
		return Area;
	}
}


