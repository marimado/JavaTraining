/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex11;

/**
 *
 * @author mariko.madono
 */
/*
セキュリティフォールがどこにあるのか不明。。。
*/

public class TestSort {
    static double[] testData = {
        0.3, 1.3e-2, 7.9, 3.17
    };
    
    public static void main(String[] args){
        SortDouble bsort = new SimpleSortDouble();
        SortMetrics metrics = bsort.sort(testData);
        System.out.println("Metrics:" + metrics);
        for (int i = 0; i < testData.length; i++){
            System.out.println("line.separator" + testData[i]);
        }
    }
}
