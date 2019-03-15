package org.function;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Supplier;

public class Tester
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x;
		Map<Integer,Supplier<Float>> typemap = new HashMap<Integer,Supplier<Float>>();
		typemap.put(1,()-> {
			try {
				System.out.println("Please select polygon");
				System.out.println("1. Triangle 2. Rectangle");
				return flowarea(sc.nextInt(),sc);
			} catch (Exception e2) {
				e2.printStackTrace();
				return (float) 0.0;
			}
		});
		
		typemap.put(2,()-> {
			try {
				return flowunit(sc);
			} catch (Exception e2) {
				e2.printStackTrace();
				return (float) 0.0;
			}
		});
		
		typemap.put(3,()-> {
			sc.close();
			System.exit(1);
			return (float) 0.0;
		});
		
		typemap.put(4,()-> {
			sc.nextLine();
			return (float) 0.0;
		});
		try
		{
			while(true)
			{
				try 
				{	
					System.out.println("Please enter number of option you want to perform");
					System.out.println("Select 1. Area Calculation 2. Unit Conversion 3.Exit");
					x = sc.nextInt();
					System.out.println(typemap.get(x).get());
				}
				catch(InputMismatchException e)
				{
					System.out.println("Please enter valid input");
				}
				catch(NoSuchElementException e)
				{
					e.printStackTrace();
				}
			}
		}
		finally
		{
			if(sc != null)
				sc.close();
		}
	}
	
	public static float flowunit(Scanner sc) throws Exception
	{
		System.out.println("Enter the value you want to convert");
			float x =sc.nextFloat();
			return Unit.convert(x,sc);
		
	}
	
	public static float flowarea(int l1,Scanner sc) throws Exception
	{
		System.out.println("Enter length of side");
		if(l1==1)
			return Area.TArea(sc.nextFloat(),sc);
		else if(l1==2)
			return Area.RArea(sc.nextFloat(),sc);
		else
			return (float) 0.000;
	}
}
