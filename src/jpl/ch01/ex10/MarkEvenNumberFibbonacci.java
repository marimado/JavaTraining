/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package jpl.ch01.ex10;

/**
 *
 * @author mariko.madono
 */
public class MarkEvenNumberFibbonacci {
    public static final int MAX_INDEX = 9;
    
    
    public static void main(String[] args){  
        int lo = 1;
        int hi = 1;
        int[] fiboNum = new int[MAX_INDEX];
        boolean[] evenNum = new boolean[MAX_INDEX];
        CalculateAndJudgeEvenNumber cal = new CalculateAndJudgeEvenNumber();
        fiboNum = cal.storeData(lo, hi, MAX_INDEX);
        evenNum = cal.judgeEven(fiboNum, MAX_INDEX);
        
        for(int i = 0; i < MAX_INDEX; i++){
          System.out.print(fiboNum[i]);
            if(evenNum[i] == true)
                System.out.println("*");
            else
                System.out.println("");
        }
            
    }
}
/*
ImprovedFibonacciアプリケーションを修正して、
数列を配列に保存するようにしなさい。
その際に、数列の値とその値が偶数かを示すブール値を保持するクラスを作成して、
そのクラスのオブジェクトへの参照を配列として持つようにしなさい。

数列の値を保持する。計算する。
その値が偶数かを示すブールを保持するクラス


メインクラス1つで実現する場合
    public static final int MAX_INDEX = 9;
    static boolean[] evenNumber = new boolean[MAX_INDEX];
    static :int[] array = new int[MAX_INDEX];
        
    public static void main(String[] args){  
        int lo = 1;
        int hi = 1;
        int n = 0;
        array[n] = lo;
        while(hi <50){
           n++;
           array[n] = hi;
           hi = lo + hi;
           lo = hi - lo;
           
           for(int i = 0; i < MAX_INDEX; i++){
                if( array[i] % 2 == 0)
                    evenNumber[i] = true;
                else
                    evenNumber[i] = false;
            }
        }
        for(int i = 0; i < MAX_INDEX; i++){
            System.out.print(array[i]);
            if(evenNumber[i] == true)
                System.out.println("*");
            else
                System.out.println("");
            }
    }
ImprovedFibonacci
static final int MAX_INDEX = 9;
    public static void main(String[] args){
        int lo = 1;
        int hi = 1;
        String mark;
         Ssytem.out.println("1:" + lo);
         for (int i = 0; i <=MAX_INDEX; i++){
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
