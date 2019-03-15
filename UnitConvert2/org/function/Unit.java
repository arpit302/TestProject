package org.function;


import java.util.Scanner;

public class Unit {
	 
	public static float convert(float value,Scanner sc) throws Exception
	{
		System.out.println("Enter the number of unit you want to convert \n 1. Centimeter 2. Meter 3. Kilometer");
		int unit = sc.nextInt();
		System.out.println("Enter the number of unit you want convertion to\n 1. Centimeter 2. Meter 3. Kilometer");
		int tunit = sc.nextInt();
		if(unit==1)
			return convertcm(value,tunit);
		else if(unit==2)
			return convertm(value,tunit);
		else if(unit==3)
			return convertkm(value,tunit);
		else
			throw new Exception();

	}
	
	public static float convertcm(float value,int tunit)
	{
		if(tunit==2)
			return value/100;
		else if(tunit==3)
			return value/100000;
		else
			return value;
	}
	
	public static float convertm(float value,int tunit)
	{
		if(tunit==1)
			return value*100;
		else if(tunit==3)
			return value/1000;
		else
			return value;
	}
	
	public static float convertkm(float value,int tunit)
	{
		if(tunit==1)
			return value*100000;
		else if(tunit==2)
			return value*1000;
		else
			return value;
	}
	

}
