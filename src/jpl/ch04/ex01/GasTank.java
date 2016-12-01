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
public class GasTank implements EnergySource{
    private int gasTank;
    
    public void fillGas(int fill){
        gasTank = fill;
    }
    @Override
    public boolean isEmpty() {
        if(gasTank == 0){
            return true;
        }
        else 
            return false;
    }
    
}
