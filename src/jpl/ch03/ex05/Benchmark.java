/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex05;

/**
 *
 * @author mariko.madono
 */
abstract class Benchmark {
    abstract void benchmark1();
    void benchmark2(int num){
            for(int i = 0; i < num; i++){   
        }
    }    
    public final long repeat(int count){
        long start = System.nanoTime();
        benchmark2(count);
        return (System.nanoTime() - start);
    } 
}
