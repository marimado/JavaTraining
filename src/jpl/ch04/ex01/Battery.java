/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch04.ex01;

/**
 *
 * @author mariko.madono
 */
public class Battery implements EnergySource{
    private int battery;
    
    public void chargeBattery(int charge){
        battery = charge;
    }
    @Override
    public boolean isEmpty() {
        //1行で表現する方法を要確認
        if(battery == 0){
            return true;
        }
        else 
            return false;
    }
}
