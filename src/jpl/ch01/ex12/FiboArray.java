/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package jpl.ch01.ex12;

/**
 *
 * @author mariko.madono
 */
public class FiboArray {
    static final int MAX_INDEX = 9;
    
    public static void main(String[] args){
    //Stringオブジェクトの宣言
    //Stringオブジェクトを格納する配列の宣言
    String fibo;
    String[] fiboSeq = new String[MAX_INDEX];
    //フィボナッチ数列の生成
        int lo = 1;
        int hi = 1;
        int n = 1;
        String mark;
        fibo = (n +":" + lo);
        fiboSeq[0] = fibo;
         for (int i = 1; i < MAX_INDEX; i++){
            if(hi% 2 == 0)
                mark = "*";
            else
                mark = "";
            n++;
            fibo = (n + ":" + hi + mark);
            fiboSeq[i] = fibo;
            
            hi = lo + hi;
            lo = hi - lo;
        }        //格納したStringオブジェクトを表示
         for(int i = 0; i <MAX_INDEX; i++){
            System.out.println(fiboSeq[i]);    
        }
    }
}
/*
問題：ImprovedFibonacciを修正してprintlnで文字列を直接表示するのではなく、
Stringオブジェクトを作成して、配列に入れるようにしてみてください。
ImprovedFibonacci
static final int MAX_INDEX = 9;
    public static void main(String[] args){
        int lo = 1;
        int hi = 1;
        String mark;
         System.out.println("1:" + lo);
         for (int i = 2; i <=MAX_INDEX; i++){
             if(hi% 2 == 0)
                 mark = "*";
             else
                 mark = "";
             System.out.println(i + ":" + hi + mark);
             hi = lo + hi;
             lo = hi - lo;
         }
    }
*/