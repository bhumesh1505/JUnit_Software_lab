package Test;

import org.junit.Test;

public class ArithmaticTest {
	
	Junit junitMessage = new Junit();
	@Test(expected = Exception.class)
	public void testJUnitMessage(){
		System.out.println("Junit Message is printing ");
		junitMessage.printMessage();
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testJUnitMessage2(){

		System.out.println("Junit Message is printing ");
		junitMessage.printMessage2();
	}
}
