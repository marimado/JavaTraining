/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01.ex12;

/**
 *
 * @author mariko.madono
 */
public class FiboArray {
    
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