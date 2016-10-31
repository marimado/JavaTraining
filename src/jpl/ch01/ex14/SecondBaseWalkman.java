/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01.ex14;

/**
 *
 * @author mariko.madono
 */
public class SecondBaseWalkman extends FirstBaseWalkman{
    private final int terminal = 2;
    private Object tape;
    private Object music;
    
    public Object ListenMusci(int terminal, Object tape){
        return music = super.listenMusic(terminal, tape);
    }
}
