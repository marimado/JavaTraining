/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch06.ex05;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mariko.madono
 */
public class TrafficLightTest {
    
    public TrafficLightTest() {
    }

    /**
     * Test of values method, of class TrafficLight.
     */
    @Test
    public void testValues() {
         TrafficLight light = TrafficLight.BLUE;
         assertEquals(light.getColor().colorName, "青"); 
    }    
    

    
}
