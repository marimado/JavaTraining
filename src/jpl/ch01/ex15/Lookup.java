/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch01.ex15;

/**
 *
 * @author mariko.madono
 */
interface Lookup{
    //nameと関連付けされた値を返す。
    //そのような値がなければnullを返す   
    Object find(String name);
}

