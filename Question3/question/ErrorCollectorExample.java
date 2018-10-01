package question;

import org.junit.Assert;		
import org.junit.Rule;		
import org.junit.Test;		
import org.junit.rules.ErrorCollector;		
/*
JUnit uses @Rule annotation which is used to create an object of
error collector. Once the object for error collector is created,
you can easily add all the errors into the object using method 
addError (Throwable error). 

if the script fails in the middle, it can still continue executing it
verify all the errors at once. 
*/
public class ErrorCollectorExample {				
    @Rule		
    public ErrorCollector collector = new ErrorCollector();							

    @Test		
    public void example() {					
    collector.addError(new Throwable("There is an error in first line"));							
    collector.addError(new Throwable("There is an error in second line"));							

        System.out.println("Hello");					
        try {			
            Assert.assertTrue("A " == "B");					
        } catch (Throwable t) {					
            collector.addError(t);					
        }		
        System.out.println("World!!!!");					
    }		
}