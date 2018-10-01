package Test;

public class Junit {
	public void printMessage()
	{
		int divide=1/0;
		System.out.println(divide); //ArithmaticException
	}
	public void printMessage2()
	{
		int[] a = new int[2]; 
		a[0] = 0;
		a[1] = 0;
		System.out.println(a[2]);	// ArrayIndexOutOFBoundsException
	}
	
}
