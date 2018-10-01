package ques;


import org.junit.After;		
import org.junit.AfterClass;		
import org.junit.Before;		
import org.junit.BeforeClass;		
import org.junit.Ignore;		
import org.junit.Test;		

public class JunitAnnotationsExample {				

    @BeforeClass		
    public static void m1() {							
        System.out.println("          WELCOME !!! ");					
    }		

    @Before		
    public void m2() {					
       // list = new ArrayList<String>();					
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");					
    }		

    @AfterClass		
    public static void m3() {							
        System.out.println("          GOODBYE !!!  ");					
    }		

    @After		
    public void m4() {					
        //list.clear();			
        System.out.println("############################# ");					
    }		

    @Test		
    public void m5() {					
    	System.out.println("Repeatedly Doing The");
    }		

    @Ignore		
    public void m6() {					
        System.out.println("Using @Ignore , this execution is ignored");					
    }		

    @Test		
    public void m7() {					
        System.out.println("SAME");					
    }		

    @Test					
    public void m8() {					
        System.out.println("Thing And Expecting");					

    }
    
    @Test					
    public void m9() {					
        System.out.println("DIFFERENT");					

    }	
    @Test
    public void m10() {					
        System.out.println("RESULT");					

    }	

}
