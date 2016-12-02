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

// 問題：テキストのクラスXとYを入力して、各マスクの値の変化を表示するための出力分を追加しなさい。
// mainメソッドを追加し、実行して結果を見てください。
// ？？？以下の変化の表示はどのようにするのか
// フィールドにデフォルト値が設定される
// Yのコンストラクタが呼び出される、Xのコンストラクタが呼び出される（コンストラクタの実行はできても呼び出しのところができていない）
// Objectのコンストラクタが呼び出される
public class Y extends X{
    {print("Yのフィールドが初期化前");}
    protected int yMask = 0xff00;
    {print("Yのフィールドが初期化");}
    
    public Y(){
        super();
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
