/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex06;

import jpl.ch02.ex05.Vehicle;

/**
 *
 * @author mariko.madono
 */
//Vehicleオブジェクトを作る
//VehicleオブジェクトをLinkedListに格納する
//nextListIDを格納する
//
public class LinkedList {
    public Object value;
    public LinkedList next;
    
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        Vehicle carVolvo940 = new Vehicle();
        Vehicle truckVolvoFl = new Vehicle();
        LinkedList list2 = new LinkedList();

        list1.value = carVolvo940;
        list1.next = null;

        list2.value = truckVolvoFl;
        list2.next = null;
        list1.next = list2;
        
        for (LinkedList list = list1; list != null; list = list.next) {
            System.out.println(list.value);
        }
    }
}
/*
問題：LinkedListクラスにmainメソッドを書いて、
Vehicle型のオブジェクトを数個作成して、リストの連続したノードに入れなさい。

疑問点：オブジェクトを出力してでてきた値は何か？

リストの連続したノードにいれるとはどういうこと？リストに格納することとは違うの？
Nodeで追加するの？
Nodeはどのパッケージをimportすれば良いのか？
org.w3c.dom.Nodeをimportすると、Nodeは抽象クラスなのでNewできない。
Newする場合は、Nodeオブジェクトのフィールドやメソッドを実装するの？      

mainメソッドから、Staticではないメソッドは呼べない。
Staticではないフィールドは呼べない。
でも、Staticにしてしまうと
*/