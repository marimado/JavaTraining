/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex02;

/**
 *
 * @author mariko.madono
 */
abstract class X {
    {print("Xのフィールド初期化前");}
    protected int xMask = 0x00ff;
    protected int fullMask;
    {print("Xのフィールドが初期化");}
     
    public X(){
        fullMask = xMask;
        print("Xのコンストラクタが実行");
    }
    public int mask(int orig){
        return(orig & fullMask); //origとfullMaskのビットごとのAND演算
    }
    abstract void print(String msg);
    
}
