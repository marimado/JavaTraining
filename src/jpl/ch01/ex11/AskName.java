/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package ch01.ex11;

/**
 *
 * @author mariko.madono
 */
public class AskName {
    public static void main(String[] args){
        String qAndA = "What's your name?";
        qAndA = qAndA +  "\r\nMy name is XXX.";
        System.out.println(qAndA);
    }
}
/*
問題：StringDemoアプリケーションを修正して、他の文字列を使用してみてください。
class StringDemo{
    public static void main(String[] args){
        String myName = "Petronius";
        myName = myName + "Arbiter";
        System.out.println("Name = " + myName);
    }
*/