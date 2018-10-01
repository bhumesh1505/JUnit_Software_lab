package ques;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Test {
	public static void main(String[] arg)
	{
		/*Executing test cases using JunitCore.runclasses, 
		it will take the test class name as a parameter
		*/
		Result result = JUnitCore.runClasses(ArithmaticTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
