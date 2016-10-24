/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package jpl.ch01.ex02;
/**
 *
 * @author mariko.madono
 */
class ErrorHelloWorld {
    //mainメソッドをprivateにして実行すると、mainメソッドがないというエラーが発生する。
    //staticをはずして実行すると、mainメソッドがないというエラーが発生する。
    //voidをはずすと、コンパイルができない。
    //parameterをなくして実行すると、mainメソッドがないというエラーが発生する。
    public static void main(){
    System.out.println("Hello World!");
}
    }
