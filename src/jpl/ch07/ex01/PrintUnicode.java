/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch07.ex01;

/**
 *
 * @author mariko.madono
 */
public class PrintUnicode {

    
    public static void main(String[] args) {
        printEachCode("class HelloWorld {\n" +
                "public static void main(String[] args) {\n"+
                "System.out.println(\"Hello World\");\n" +
                "}\n}\n");
    }
    
    static void printEachCode(String s) {
        char[] chars = s.toCharArray();
        
        for (char ch: chars) {
            System.out.printf("\\u%04x", (int)ch);
            if (ch == '\n') {
                System.out.println();
            }
        }
        System.out.println();
    }
    
}
