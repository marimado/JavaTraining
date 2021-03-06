/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */

package jpl.ch01.ex06;

/**
 *
 * @author mariko.madono
 */
public class FibonacciSequenceNamedConstant {
    static final String title = "＊＊値が50未満のフィボナッチ数列の数字リスト＊＊";
    //値が50未満のフィボナッチ数列を表示します。
    public static void main(String[] args){
        System.out.println(title);
        //フィボナッチ数列の前数項がlo,フィボナッチ数列の現在の項は、hi
        int lo =1;
        int hi =1;
        System.out.println(lo);
        while(hi < 50 ){
            System.out.println(hi);
            hi = hi + lo;
            lo = hi - lo;
        }
    }
    
}
