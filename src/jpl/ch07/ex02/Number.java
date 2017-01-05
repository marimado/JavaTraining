/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch07.ex02;

/**
 *
 * @author mariko.madono
 */
public class Number {
    
    public static void main(String[] args)
    {
        //コードユニット
        char char_min;
        char char_max;

        //整数リテラル   
        byte b_min;
        byte b_max;

        short s_min;
        short s_max;

        int i_min;
        int i_max;

        long l_min;
        long l_max;

        //浮動少数点リテラル
        float f_min;
        float f_max;
        double d_min;
        double d_max;
        
        char_min = Character.MIN_VALUE;
        char_max = Character.MAX_VALUE;
        b_min = Byte.MIN_VALUE;
        b_max = Byte.MAX_VALUE;
        s_min = Short.MIN_VALUE;
        s_max = Short.MAX_VALUE;
        i_min = Integer.MIN_VALUE;
        i_min = Integer.MAX_VALUE;
        l_min = Long.MIN_VALUE;
        l_min = Long.MAX_VALUE;
        f_min = Float.MIN_VALUE;
        f_max = Float.MAX_VALUE;
        d_min = Double.MIN_VALUE;
        d_max = Double.MAX_VALUE;
        
        System.out.println("Char最小値" + char_min);
        }
}
