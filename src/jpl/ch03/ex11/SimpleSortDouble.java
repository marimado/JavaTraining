/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex11;

/**
 *
 * @author mariko.madono
 */
class SimpleSortDouble extends SortDouble{

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
