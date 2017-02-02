/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch07.ex02;

import java.util.ArrayList;

/**
 *
 * @author mariko.madono
 */
public class Number {
    
    public static void main(String[] args)
    {
        //16ビットUTF-16コードユニット
        char char_min;
        char char_max;

        //8ビット符号付き整数   
        byte b_min;
        byte b_max;

        //16ビット符号付き整数
        short s_min;
        short s_max;

        //32ビット符号付き整数
        int i_min;
        int i_max;

        //64ビット符号付き整数
        long l_min;
        long l_max;

        //32ビット浮動小数点数
        float f_min;
        float f_max;
        
        //64ビット浮動少数点数
        double d_min;
        double d_max;
        
        char_min = Character.MIN_VALUE;
        char_max = Character.MAX_VALUE;
        b_min = Byte.MIN_VALUE;
        b_max = Byte.MAX_VALUE;
        s_min = Short.MIN_VALUE;
        s_max = Short.MAX_VALUE;
        i_min = Integer.MIN_VALUE;
        i_max = Integer.MAX_VALUE;
        l_min = Long.MIN_VALUE;
        l_max = Long.MAX_VALUE;
        f_min = Float.MIN_VALUE;
        f_max = Float.MAX_VALUE;
        d_min = Double.MIN_VALUE;
        d_max = Double.MAX_VALUE;
        
        //shortにbyteを代入
        s_min = b_max;
        //intにshortを代入
        i_min = s_max;
        //doubleをfloatに代入すると注意される
        //f_min = d_min;
        
        ArrayList list = new ArrayList();
        list.add(char_min);
        list.add(char_max);
        list.add(b_min);
        list.add(b_max);
        list.add(s_min);
        list.add(s_max);
        list.add(i_min);
        list.add(i_max);
        list.add(l_min);
        list.add(l_max);
        list.add(f_min);
        list.add(f_max);
        list.add(d_min);
        list.add(d_max);
       
        
        /*
        System.out.println("基本型の最小値と最大値を出力します");
        for(int i = 0; i < list.size(); i++){    
            System.out.println(list.get(i));
        }        
        */
        System.out.println("byteを代入する前のshortの値" + s_max);
        //shortにbyteを代入
        s_max = b_max;
        //doubleをfloatに代入すると注意される
        //f_min = d_min;
        
        System.out.println("byteを代入した後のshortの値" + s_max);
        }
}
