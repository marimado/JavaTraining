/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch01.ex14;

/**
 *
 * @author mariko.madono
 */
public class FirstBaseWalkman {
    private final int terminal = 1;
    private Object tape;
    private Object music;
    public Object listenMusic(int terminal, Object tape){
        music = "音楽";
        return music;   
    //ウォークマンがするのは、playとstop。
    //その2つのメソッドが必要。
    //端子を差すというメソッドがある。
    }
}
/*
ソニーウォークマン製品ファミリーのクラス構造を反映しているクラスを設計してみてください。
すべてのデータをprivate
メソッドをpublicとすることで、データを隠すためにメソッドを使用してみてください。
Walkmanクラスはどのようなメソッドが必要ですか。
そのメソッドが拡張されたクラスに追加されますか。

最初のモデル
1人がテープを聴くために1個の端子

メソッド
音楽を聴く

次のモデル
2人が同じテープを聴くために2個の端子
メソッド
音楽聴く

次のモデルのサブクラス
2人が同じテープを聴くために2個の端子
音楽を聴くと同時に話ができる　
*/