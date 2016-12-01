/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex12;

/**
 *
 * @author mariko.madono
 */
/*
問題：どのようなオブジェクト型もソートできる一般的なSortHarnessクラスを作成しなさい。
オブジェクトの順序を比較するのに<は仕様できないとして、オブジェクトの順序を表す方法をどのように提供しますか。
*/
abstract class SortHarness {
    private Object[] values;
    private final SortMetrics curMetrics = new SortMetrics();
    
    /*
    全ソートをするために呼び出される
    */
    public final SortMetrics sort(Object[] data){
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
    protected final Object probe(int i){
        curMetrics.probeCnt++;
        return values[i];
    }
    
    /*
    拡張したクラスが要素を比較するため
    */
    protected final int compare(int i, int j){
	curMetrics.compareCnt++;
	Comparable d1 = (Comparable)values[i];
	Comparable d2 = (Comparable)values[j];
	if(d1.compareTo(d2)==0)
            return 0;
	else
            return (d1.compareTo(d2)<0 ? -1 : 1);
	}
    protected final void swap(int i, int j){
        curMetrics.swapCnt++;
        Object tmp = values[i];
        values[i] = values[j];
        values[j] =tmp;
    }
    
    protected abstract void doSort();
 
}
