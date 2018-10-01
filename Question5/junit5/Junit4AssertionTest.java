package junit5;

import static org.junit.Assert.*;				
import org.junit.Test;		


public class Junit4AssertionTest {				
	
    //Variable declaration		
    String string1="Junit";					
    String string2="Junit";					
    String string3="test";					
    String string4="test";					
    String string5=null;					
    int variable1=1;					
    int	variable2=2;
							
    @Test		
    public void test1(){
    	assertSame(string3, string4);
    }	
	
    @Test		
    public void test2(){
    	assertNotSame(string1, string3);					
    }		
    @Test		
    public void test3(){
    	assertNotNull(string1);			
    }		
    @Test		
    public void test4(){
    	assertNull(string5);			
    }	
    @Test		
    public void test5(){
    	assertTrue(variable1<variable2);					
    }	
    @Test		
    public void test6(){
    	 assertFalse(variable1 > variable2);
    }	
    
}