package DhruvPrograms;

import java.util.Scanner;

interface Calci
{
	int addition(int a,int b);
	int subtraction(int a,int b);
	int divide(int a,int b);
	int multiplication(int a,int b);
}
public class Calculator implements Calci {
	
	
	public int addition(int a,int b)
	{
		return a+b;
	}

	public int subtraction(int a,int b)
	{
		return a-b;
	}

	public int divide(int a,int b)
	{
		return a/b;
	}

	public int multiplication(int a,int b)
	{
		return a*b;
	}

	public static void main(String[] args)
	{
		
		Calci c = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a >=1 && a<=100)
		{
			if(b >=1 && b<=100)
			{
		System.out.println(c.addition(a,b));
		System.out.println(c.subtraction(a,b));
		System.out.println(c.divide(a,b));
		System.out.println(c.multiplication(a,b));
			}
		}
		else 
		{
			System.out.println("a or b doesnt satify the condition");
		}
		
	}
	
}
