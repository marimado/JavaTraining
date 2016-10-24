/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package jpl.ch01.ex10;

/**
 *
 * @author mariko.madono
 */
public class CalculateAndJudgeEvenNumber {
    private int arrayLength;
    public void setArrayLength(int i){
        arrayLength = i;
    }
    public final int[] NUMBER = new int[arrayLength];
    public final boolean[] BOOL = new boolean[arrayLength];
  
    public void storeData(int lo, int hi){
        for(int i = 0; i < NUMBER.length; i++){
                NUMBER[i] = hi;
                if(hi % 2 ==0)
                    BOOL[i] = true;
                else
                    BOOL[i] = false;
                hi = lo + hi;
                lo = hi -lo;
                }
    }    
}
/*
*/