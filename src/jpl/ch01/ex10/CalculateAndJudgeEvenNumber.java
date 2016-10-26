/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package ch01.ex10;

/**
 *
 * @author mariko.madono
 */
public class CalculateAndJudgeEvenNumber {
    private int arrayLength;
    public int[] storeData(int lo, int hi, int arrayLength){
        this.arrayLength = arrayLength;
        int[] fiboSeq = new int[this.arrayLength];
        fiboSeq[0] = lo;
        for(int i = 1; i < fiboSeq.length; i++){
                fiboSeq[i] = hi;
                hi = lo + hi;
                lo = hi -lo;
                }
        return fiboSeq;
    }
    public boolean[] judgeEven(int[] fibo, int arrayLength){
        boolean[] judgeEven = new boolean[this.arrayLength];
        for(int i = 0; i < fibo.length; i++){
            if(fibo[i] % 2 == 0)
                    judgeEven[i] = true;
                else
                    judgeEven[i] = false;
        }
        return judgeEven;
    }
}
