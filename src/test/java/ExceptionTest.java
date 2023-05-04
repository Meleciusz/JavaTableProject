/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import pl.polsl.model.Calculate;
import pl.polsl.model.NoZero;
/**
 *<b>ExceptionTest </b>make exceptions tests
 * @author Mikolaj Krasucki
 * @version 2.0
 */
public class ExceptionTest {
    
    private Calculate model = new Calculate();
    
    
    @Test
    public void testnutritients(){
        /**
     * This test make sure, that exception was catched whenever number is 0 or less 
     */
        try{
            model.number(0);
            fail("An exception should be thrown when the amount is zero");
        }catch(NoZero e){
            System.err.println(e.getMessage());
        }
    }
    
    
    @Test
    public void testnutritients2(){
        /**
     * This test make sure, that exception was catched whenever number is 0 or less 
     */
        try{
            model.number(-1);
            fail("An exception should be thrown when the amount is non-positive");
        }catch(NoZero e){  
            System.err.println(e.getMessage());
                        }
    }
    
    
}

