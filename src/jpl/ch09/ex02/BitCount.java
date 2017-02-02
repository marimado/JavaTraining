/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch09.ex02;

/**
 *
 * @author mariko.madono
 */
public class BitCount {
    public static void main(String[] args){
        System.out.println(bitCount(100));
    }
    
   public static int bitCount(int i){
       //どのように解いたらよいのか分からず、Integer.bitCountの仕様を見て書きました。。。
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        return i & 0x3f;
   }
}
