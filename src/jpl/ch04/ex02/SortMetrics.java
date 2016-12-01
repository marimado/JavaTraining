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
public class SortMetrics implements Cloneable{
    public long probeCnt,
            compareCnt,
            swapCnt;
    
    public void init(){
        probeCnt = swapCnt = swapCnt = 0;
    }
    
    @Override
    public String toString(){
        return probeCnt + "probes " + compareCnt + "compares " + swapCnt + "swaps ";
    }
    @Override
    public SortMetrics clone(){
        try {
            return (SortMetrics)super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new InternalError(ex.toString());
        }
    }
}
