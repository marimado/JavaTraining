/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex03;
/**
 *
 * @author mariko.madono
 */
public class X {
    protected int xMask = 0x00ff;
    protected int fullMask;
    {print("Xのフィールドが初期化");}
     
    public X(){
        fullMask = xMask;
        print("Xのコンストラクタが実行");
    }
    protected X(int mask){//外部から呼ばれないようにprotectedにする
        fullMask = mask | xMask; //自分の値と比較して輪達す
        print("Xのコンストラクタが実行");
    }
    private int mask(int orig){ //他のクラスから触れられないメソッド
        return(orig & fullMask); //origとfullMaskのビットごとのAND演算
    }
    public void print(String msg){
    }
    
}
