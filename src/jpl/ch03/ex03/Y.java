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

// 問題：オブジェクトの生成の間に、拡張したクラスからの値を使用して、
// マスクの値を設定するのが重要な場合には、
// どうすれば問題を回避できるのか？
// 対策：Xがもつmaskメソッドをprivateにして、他のクラスからの値を使用してマスクの値を設定できないようにする
// 　　　その上で、コンストラクタで値を設定する。
public class Y extends X{
    protected int yMask = 0xff00;
    {print("Yのフィールドが初期化");}
    
    public Y(){
        super(0xffff); //コンストラクタで拡張したクラスからマスクの値を設定
        fullMask |= yMask;
        this.print("Yのコンストラクタが実行");
    }
    public static void main(String[] args){
        new Y();
    }
    @Override
    public void print(String msg){
        String format = "%s%n %s %#06x%n %s %#06x%n %s %#06x%n";
        String x = "xMask:";
        String y = "yMask:";
        String f = "fullMask";
        System.out.printf(format, msg, x, xMask, y, yMask, f, fullMask);
    }
}
