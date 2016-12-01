/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch04.ex02;

/**
 *
 * @author mariko.madono
 */
public class TestSort {
    static Object [] testData = {
        0.3, 1.3e-2, 7.9, 3.17        
    };
    
    public static void main(String[] args){
        SortHarness bsort = new SimpleSortHarness();
        SortMetrics metrics = bsort.sort(testData);
        System.out.println("Metrics:" + metrics);
        for (Object testData1 : testData) {
            System.out.println("\n" + testData1);
        }
    }
}
