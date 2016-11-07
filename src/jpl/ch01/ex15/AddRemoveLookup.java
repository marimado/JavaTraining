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
interface AddRemoveLookup extends Lookup{
    Object add(String addName);
    Object remove(String removeName);
}
/*
問題：addとremoveメソッドを宣言したインターフェースを、Lookupを拡張して定義しなさい。
その拡張したインターフェースを新たなクラスに実装しなさい。
interface Lookup{
    //nameと関連付けされた値を返す。
    //そのような値がなければnullを返す   
    Object find(String name);
}
*/