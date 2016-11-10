/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ex11;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author mariko.madono
 */
public class MyWindowListener implements WindowListener{

    @Override
    //ウィンドウがオープンされた時の処理
    public void windowOpened(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    //ウィンドウの×ボタンがクリックされた時の処理
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    @Override
    //ウィンドウがクローズした後の処理
    public void windowClosed(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    //ウィンドウが最小化された時の処理
    public void windowIconified(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    //ウィンドウが最小化から元に戻された時の処理
    public void windowDeiconified(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    //ウィンドウがアクティブになった時の処理
    public void windowActivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    //ウィンドウがアクティブでなくなった時の処理
    public void windowDeactivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
