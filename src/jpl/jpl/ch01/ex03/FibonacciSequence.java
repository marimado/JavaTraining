/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch01.ex03;
/**
 *
 * @author mariko.madono
 */
public class FibonacciSequence {
   //値が50未満のフィボナッチ数列を表示します。
    public static void main(String[] args){
        System.out.println("＊＊値が50未満のフィボナッチ数列の数字リスト＊＊");
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
