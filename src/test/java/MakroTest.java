/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import pl.polsl.model.Calculate;
/**
 *<b>MakroTest </b>make tests
 * @author Mikolaj Krasucki
 * @version 2.0
 */


public class MakroTest {
    
    private Calculate model = new Calculate();
    
    
    @Test
    public void testmakro1(){
        /**
     * Test, that checks if user gave correct informations about yourself
     */
        ArrayList<Integer> hlp = new ArrayList<Integer>();
        hlp.add(1);
        hlp.add(1);
        hlp.add(1);
        hlp.add(1);
      
        ArrayList<Double> results = new ArrayList<Double>();
        results.add(-149.75);
        results.add(5.0);
        results.add(50.0);
        results.add(1.2);
        results.add(0.3);
        
        ArrayList<Double> f1 = new ArrayList<Double>();
        f1 = model.needed_nutrients(hlp);
        assertEquals(results, f1, "Bad");
            
        }
    
    
    @Test
    public void testmakro2(){ 
        /**
     * Test, that checks if user gave correct informations about yourself
     */
        ArrayList<Integer> hlp = new ArrayList<Integer>();
        hlp.add(0);
        hlp.add(1);
        hlp.add(1);
        hlp.add(1);
      
        ArrayList<Double> results = new ArrayList<Double>();
        results.add(-149.75);
        results.add(5.0);
        results.add(50.0);
        results.add(1.2);
        results.add(0.3);
        
        ArrayList<Double> f1 = new ArrayList<Double>();
        f1 = model.needed_nutrients(hlp);
        assertEquals(results, f1, "Bad");
            
        }
    
    
    @Test
    public void testmakro3(){
        /**
     * Test, that checks if user gave correct informations about yourself
     */
        ArrayList<Integer> hlp = new ArrayList<Integer>();
        hlp.add(1);
        hlp.add(1);
        hlp.add(1);
        hlp.add(1);
      
        ArrayList<Double> results = new ArrayList<Double>();
        results.add(-149.75);
        results.add(5.0);
        results.add(50.0);
        results.add(1.2);
        results.add(0.3);
        
        ArrayList<Double> f1 = new ArrayList<Double>();
        f1 = model.needed_nutrients(hlp);
        assertEquals(results, f1, "Bad");
            
        }

}