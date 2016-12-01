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
abstract class SortDouble {
    private double[] values;
    private final SortMetrics curMetrics = new SortMetrics();
    
    /*
    全ソートをするために呼び出される
    */
    public final SortMetrics sort(double[] data){
        values = data;
        curMetrics.init();
        doSort();
        return getMetrics();
    }
    
    public final SortMetrics getMetrics(){
        return curMetrics.clone();
    }
    
    /*
    拡張したクラスが要素の数を知るため
    */
    protected final int getDataLength(){
        return values.length;
    }
    
    /*
    拡張したクラスが要素を調べるため
    */
    protected final double probe(int i){
        curMetrics.probeCnt++;
        return values[i];
    }
    
    /*
    拡張したクラスが要素を比較するため
    */
    protected final int compare(int i, int j){
        curMetrics.compareCnt++;
        double d1 = values[i];
        double d2 = values[j];
        if (d1 == d2)
            return 0;
        else
            return (d1 < d2 ? -1 :1);
    }
    protected final void swap(int i, int j){
        curMetrics.swapCnt++;
        double tmp = values[i];
        values[i] = values[j];
        values[j] =tmp;
    }
    
    protected abstract void doSort();
    
}
