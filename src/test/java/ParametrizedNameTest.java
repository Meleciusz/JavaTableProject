
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.platform.commons.util.StringUtils;
import pl.polsl.model.Calculate;


/**
 *<b>ParametrizedNameTest </b>make parametrized tests
 * @author Mikolaj Krasucki
 * @version 2.0
 */
public class ParametrizedNameTest {
    
   private Calculate model = new Calculate();
    
   
    @ParameterizedTest
    @ValueSource(strings = {"Meleciusz", "m", "blablablabla"})
    public void testString1(String input){
        /**
         * Test that checks if username is correct 
        */
        String username = model.if_name_correct(input);
        assertTrue(username.length() > 2);
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = {"Meleciusz", "m", ""})
    public void testString2(String input){
        /**
        * Test that checks if username is correct 
        */
        String username = model.if_name_correct(input);
        assertTrue(username.length() < 10);
    }
    
 
}
