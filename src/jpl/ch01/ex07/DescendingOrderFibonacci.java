/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package jpl.ch01.ex07;

/**
 *
 * @author mariko.madono
 */
public class DescendingOrderFibonacci {
    static final int MAX_INDEX = 9;
    /*
    偶数要素に'*'をつけて、フィボナッチ数列の要素に表示する
    */
    public static void main(String[] args){
        int lo = 34;
        int hi = 21;
        String mark;
        for (int i =1; i <=MAX_INDEX; i++){
            if(lo % 2 ==0){
                mark = "*";
            }
            else
                mark = "";
            System.out.println(i + ":" + lo + mark);
            int x = lo - hi;
            lo = hi;
            hi = x;
        }
            
    }
}
