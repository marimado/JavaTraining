/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ex11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

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
public class DigitalClock extends Frame {

    static Button showClock = new Button("今何時？？");

    public static void main(String[] args) {
        DigitalClock f = new DigitalClock();
        f.setSize(300, 300);
        f.addWindowListener(new MyWindowListener());
        f.setLayout(null);

        showClock.addActionListener(new ActionListener() {
            boolean threadStarted = false;

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (threadStarted) {
                    return;
                }

                new Thread(new Runnable() {
                    public void run() {
                        while (true) {
                            f.repaint();
                            try {
                                Thread.sleep(1000);  //スリープ１秒
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                }).start();

                threadStarted = true;
            }
        });

        showClock.setBounds(100, 220, 100, 50);
        f.add(showClock);
        f.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, 
                        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        Font font = new Font("ＭＳ 明朝", Font.BOLD|Font.ITALIC, 32);
        g2.setFont(font);
        g2.drawString(new Date().toString(), 70, 70);
        g2.dispose();
    }
}

/*
次回の課題は、ちらつきをなくす。
何かのメソッドで、全画面クリアしているところがあるのでそのメソッドをオーバーライドする。
そのメソッドで、doublebufferingで全画面を裏で描画しておいて、
それを表示させるようにする。
*/