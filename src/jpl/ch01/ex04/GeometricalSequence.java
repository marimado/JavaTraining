/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package jpl.ch01.ex04;

/**
 *
 * @author mariko.madono
 */
public class GeometricalSequence {
    //数列 a1 ，a2 ，a3 ，…，an ，…において，各数 an が，
    //そのすぐ前の数 an-1 に一定数 r を掛けること (an＝an-1×r) によって得られるとき，この数列を等比数列という。
    /*
    タイトルを表示"100未満の等比数列を表示"
    for文
    anを表現するint iを宣言する。
    aが50になるまで繰り返す。
    定数を表現するint fixedNumberを宣言する。
    an-1 に一定数 fixedNumberを乗算する(an＝an-1×r) こと繰り返す。
    乗算した結果を出力する    */
    static final int maximum = 100;
    static final int fixedNumber = 3;
    public static void main(String[] args){
        System.out.println("100未満の等比数列");
        for(int i = 1; i <= maximum; i = i * fixedNumber){
            System.out.println(i);
        }
    }
}
