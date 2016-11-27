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
public class MethodBenchmark extends Benchmark{
    @Override
    void benchmark1() {
     }
   
    public static void main(String[] args){
        int count = 100;
        long time = new MethodBenchmark().repeat(count);
        System.out.println(count + "methods in" + time + "nanoseconds");
    }

    
   
}
