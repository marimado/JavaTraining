/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch09.ex01;

/**
 *
 * @author mariko.madono
 */
public class CalculateInfinity {
    
    public static void main(String[] args){
        float pInfi = Float.POSITIVE_INFINITY;
        float pInfi2 = Float.POSITIVE_INFINITY;
        float nInfi = Float.NEGATIVE_INFINITY;
        
        System.out.println("同じ符号の無限大の計算結果");
        System.out.println("正の無限大と正の無限大を足す" + add(pInfi, pInfi2));
        System.out.println("正の無限大から正の無限大を引く" + substract(pInfi, pInfi2));
        System.out.println("正の無限大と正の無限大を掛ける" + multiply(pInfi, pInfi2));
        System.out.println("正の無限大を正の無限大で割る：" + divide(pInfi, pInfi2));
        
        System.out.println("【異なる符合の無限大の計算結果】");
        System.out.println("正の無限大と負の無限大を足す：" + add(pInfi, nInfi));
        System.out.println("正の無限大から負の無限大を引く：" + substract(pInfi, nInfi));
        System.out.println("正の無限大と負の無限大を掛ける：" + multiply(pInfi, nInfi));
        System.out.println("正の無限大を負の無限大で割る：" + divide(pInfi, nInfi));
    }
    
    public static float add(float f1, float f2){
        return f1 + f2;
    }
    
    public static float substract(float f1, float f2){
        return f1 - f2;
    }
    
    public static float multiply(float f1, float f2){
        return f1 * f2;
    }
    
    public static float divide(float f1, float f2){
        return f1 / f2;
    }
}
