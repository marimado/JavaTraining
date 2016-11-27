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
public class GasTank extends EnergySource{
    private int gasTank;
    
    public void fillGas(int fill){
        gasTank = fill;
    }
    @Override
    boolean isEmpty() {
        if(gasTank == 0){
            return true;
        }
        else 
            return false;
    }
    
}
