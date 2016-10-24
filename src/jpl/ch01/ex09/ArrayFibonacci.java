/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch01.ex09;
/**
 *
 * @author mariko.madono
 */
public class ArrayFibonacci {
    public static int MAX_INDEX = 9;
    public static void main(String args[]){
        int[] array = new int[MAX_INDEX];
        int lo = 1;
        int hi = 1;
        int n = 0;
        array[n] = lo;
        while(hi <50){
           n++;
           array[n] = hi;
           hi = lo + hi;
           lo = hi - lo;
        }
        for(int i = 0; i < MAX_INDEX; i++){
            System.out.println(array[i]);
        }
    }
}
/*
Fibonacci
public static void main(String args[]){
        int lo = 1;
        int hi = 1;
        System.out.println(lo);
        while(hi < 50){
            System.out.println(hi);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
*/

