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
public class SortMetrics implements Cloneable{
    public long probeCnt,
            compareCnt,
            swapCnt;
    
    public void init(){
        probeCnt = swapCnt = swapCnt = 0;
    }
    
    public String toString(){
        return probeCnt + "probes " + compareCnt + "compares " + swapCnt + "swaps ";
    }
    public SortMetrics clone(){
        try {
            return (SortMetrics)super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new InternalError(ex.toString());
        }
    }
}
