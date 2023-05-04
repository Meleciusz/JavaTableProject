/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pl.polsl.model.Calculate;
/**
 *<b>ParametrizedNameTest </b>make parametrized tests
 * @author Mikolaj Krasucki
 * @version 2.0
 */
public class AmountParametrizedTest {
    
    private Calculate model = new Calculate();
    
   
    @ParameterizedTest
    @ValueSource(ints = {0, 60, 1170})
    public void testamount1(int input){
         /**
     * Test that checks if amount is correct
     */
       
        ArrayList<Integer> amount = new ArrayList<Integer>();
        amount.add(input);
        amount = model.if_amount_correct(amount);
        
        for(int x: amount)
        {
            assertTrue(x>0);
        }
    }
    
    
    @ParameterizedTest
    @ValueSource(ints = {0, 60, 1170})
    public void testamount2(int input){
        /**
     * Test that checks if amount is correct 
     */
        
        ArrayList<Integer> amount = new ArrayList<Integer>();
        amount.add(input);
        amount = model.if_amount_correct(amount);
        
        for(int x: amount)
        {
            assertTrue(x<1000);
        }
    }
}
