/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch04.ex02;

/**
 *
 * @author mariko.madono
 */
public class SimpleSortHarness extends SortHarness{
    
    
    @Override
    protected void doSort() {
        for (int i = 0; i < getDataLength(); i++){
            for (int j = i +1; j < getDataLength(); j++){
                if (compare(i, j) > 0)
                    swap(i, j);
            }
        }
    }    
}

