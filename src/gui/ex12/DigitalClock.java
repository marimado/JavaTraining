/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ex12;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
/**
 *
 * @author mariko.madono
 */
/*
課題1-1 	AWTのFrameを使用して、時間を表示するデジタル時計（アナログ時計は不可）を作成してください。 
	java.awt.Frameを使用する。
	Windowsの普通のアプリケーションと同様にタイトルバーの「×」ボタンをクリックすると終了する。
	デジタル時計の描画は、paintメソッド内でGraphicsを使用して行う。テキストラベルによる単なる表示は、不可。
課題1-2	デジタル時計に次の機能追加を行ってください。
            メニューを付けて、プロパティダイアログを開ける。
            プロパティダイアログでは、以下の項目を設定できる。
                1.	フォントの指定
                2.	フォントサイズの指定
                3.	文字色の指定
                4.	時計の背景色の指定
            描画に際して、ちらつきをなくすようにダブルバッファリングする。
            フォントとフォントサイズを変更すると、時計を表示すべきフレームの大きさを適切に自動変更して、正しく表示されるようにする。
*/
public class DigitalClock extends Frame implements ActionListener{
        static int h;
        static int m;
        static int s;
        static String ampm;
        
        static DigitalClock clock = new DigitalClock();
        static MenuBar mb = new MenuBar();
        static Menu menu = new Menu("プロパティ");
        static MenuItem font = new MenuItem("フォントの変更");
        static MenuItem size = new MenuItem("フォントサイズ変更");
        static MenuItem fColor = new MenuItem("フォントカラー変更");
        static MenuItem bColor = new MenuItem("背景色変更");
        
        public static void main(String[] args){
            clock.setSize(300,300);
            clock.setLayout(null);
            clock.setTitle("課題1-2：AWTデジタル時計♪");
            clock.addWindowListener(new MyWindowListener());
            Calendar now = Calendar.getInstance();
            clock.setMenuBar(mb);
            mb.add(menu);
            menu.add(font);
            menu.add(size);
            menu.add(fColor);
            menu.add(bColor);
            font.addActionListener(clock);
            size.addActionListener(clock);
            fColor.addActionListener(clock);
            bColor.addActionListener(clock);
            
            clock.setVisible(true);
            new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (true) {
                                h = now.get(Calendar.HOUR_OF_DAY);
                                m = now.get(Calendar.MINUTE);
                                s = now.get(Calendar.SECOND);
                                if(now.getInstance().get(now.AM_PM) == 0)
                                    { 
                                        ampm = "AM";
                                    }       
                                else
                                    ampm = "PM";
                                clock.repaint();
                                try {
                                    Thread.sleep(1000);  //スリープ１秒
                                } catch (InterruptedException e) {
                                }
                            }
                        }
            }).start();
        }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, 
                        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        Font font = new Font("ＭＳ 明朝", Font.BOLD|Font.ITALIC, 32);
        g2.setFont(font);
        g2.drawString(h+":"+m+":"+s + ampm, 120, 120);
        g2.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object type = ae.getSource();
        if(type.equals(font)){
            //
        }
        if(type.equals(size)){
            //
        }
        if(type.equals(fColor)){
            //
        }
        if(type.equals(bColor)){
            //
        }
    }
}

