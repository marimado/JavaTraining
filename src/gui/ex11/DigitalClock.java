/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ex11;
import java.awt.*;
/**
 *
 * @author mariko.madono
 */
/*
課題1-1	AWTのFrameを使用して、時間を表示するデジタル時計（アナログ時計は不可）を作成してください。 
	java.awt.Frameを使用する。
	Windowsの普通のアプリケーションと同様にタイトルバーの「×」ボタンをクリックすると終了する。
	デジタル時計の描画は、paintメソッド内でGraphicsを使用して行う。テキストラベルによる単なる表示は、不可。

*/
public class DigitalClock {
    public static void main(String[] args){
        Frame f = new Frame();
        f.setSize(300,300);
        Button showClock = new Button("今何時？？");
               
        showClock.addActionListener(new MyButtonListener());
        showClock.setBounds(100,220,100,50);
        f.add(showClock);
        f.addWindowListener(new MyWindowListener());
        f.setLayout(null);
        f.setVisible(true);
    }
}
