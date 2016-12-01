/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch06.ex05;

/**
 *
 * @author mariko.madono
 */
public enum TrafficLight {
    BLUE{
            @Override
            public Color getColor(){
                return new Color("青");
             }
    }, 
    YELLOW{
        public Color getColor(){
            return new Color("黄色");
        }
    },
    RED{
        public Color getColor(){
            return new Color("赤");
        }
    };
    abstract Color getColor();
}

