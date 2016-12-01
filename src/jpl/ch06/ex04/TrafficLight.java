/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch06.ex04;

import jpl.ch06.ex01.*;

/**
 *
 * @author mariko.madono
 */
public enum TrafficLight {
    BLUE(new Color("青")), 
    YELLOW(new Color("黄色")), 
    RED(new Color("赤"));

    Color color;
    private TrafficLight(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }

}

