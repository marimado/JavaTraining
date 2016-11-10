/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch01.ex07;

/**
 *
 * @author mariko.madono
 */

//値が50未満のフィボナッチ数列を表示します。
public class DescendingOrderFibo {
    static final int MAX_INDEX = 8;
    static final String TITLE = "＊＊値が50未満のフィボナッチ数列の数字リスト＊＊";
    
    public static void main(String[] args){
        int lo = 1;
        int hi = 1;
        int n = 2;
        String mark;

        System.out.println(TITLE);
        System.out.println("1:" + lo);
        
        for (int i = MAX_INDEX; i >= 1; i--){    
            if (hi % 2 == 0)
                mark = "*";
            else
                mark = "";
            System.out.println(n + ":" + hi + mark);
            hi = lo + hi;
            lo = hi - lo;
            n++;  
        }
        
    }    
}
