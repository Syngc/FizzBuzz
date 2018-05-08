package fizzbuzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *@author cyn
 */

public class FizzBuzzTest {

    @Test
    public void FizzTest(){
        String[] y = FizzBuzz.fizzBuzz().split(" ");
        for(int i=2 ; i<=100; i+=3){
            if((i+1) %15 != 0)
                assertEquals("Fizz", y[i]);         
        }
    }
    
    @Test 
     public void BuzzTest(){
        String[] y = FizzBuzz.fizzBuzz().split(" ");
        for(int i=4 ; i<=100; i+=5){
            if((i+1) %15 != 0)
                assertEquals("Buzz", y[i]);         
        }
    }
     
     @Test 
     public void FizzBuzzTest(){
        String[] y = FizzBuzz.fizzBuzz().split(" ");
        for(int i=14 ; i<=100; i+=15){  
            assertEquals("FizzBuzz", y[i]);         
        }
    }
     @Test
     public void numberTest(){
        String[] y = FizzBuzz.fizzBuzz().split(" ");
        for(int i=1 ; i<=100; i+=15){  
            if(i%3 != 0 || i%5 != 0)
                assertEquals(String.valueOf(i), y[i-1]);         
        }
     }
     
     @Test 
     public void FizzBuzzLengthTest(){
        String[] y = FizzBuzz.fizzBuzz().split(" ");
        assertEquals(100, y.length);
    }
     
    
    
}
