/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01.ex13;

/**
 *
 * @author mariko.madono
 */
public class PrintfFibo {
    static final int MAX_INDEX = 9;
    public static void main(String[] args){
        int lo = 1;
        int hi = 1;
        String mark;
        System.out.printf("1:" + lo + "%n");
        for (int i = 2; i <=MAX_INDEX; i++){
            if(hi% 2 == 0)
                mark = "*";
            else
                mark = "";
            System.out.printf(i + ":" + hi + mark + "%n");
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}
/*
問題：printlnではなく、 printfを使用して、ImprovedFibonacciを書き直しなさい。
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