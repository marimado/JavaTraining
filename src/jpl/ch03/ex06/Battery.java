/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex06;

/**
 *
 * @author mariko.madono
 */
public class Battery extends EnergySource{
    private int battery;
    
    public void chargeBattery(int charge){
        battery = charge;
    }
    @Override
    boolean isEmpty() {
        if(battery == 0){
            return true;
        }
        else 
            return false;
    }
}
