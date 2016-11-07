/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ex11;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author mariko.madono
 */
public class MyButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae){  //イベント処理を実行するメソッド
    //System.out.println("時計を表示します。");
        int h;
        int m;
        int s;
        //boolean threadBool = true;
        DigitalClock clock = new DigitalClock();
        String timeString;
        Calendar now = Calendar.getInstance(Locale.JAPAN);
        
        h = now.get(Calendar.HOUR_OF_DAY);
        m = now.get(Calendar.MINUTE);      //分を代入
        s = now.get(Calendar.SECOND);       //秒を代入
        timeString = h + "時" + m + "分" + s + "秒";
        System.out.println(timeString);
  }
}
