/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex08;

import jpl.ch02.ex07.Vehicle;

/**
 *
 * @author mariko.madono
 */
public class LinkedList {
        public Object value;
        public LinkedList next;

//次の要素IDをコンストラクタで設定させる。    

        LinkedList(Object vehicle, LinkedList list){
            value = vehicle;
            next = list;
        }

        public static void main(String[] args) {
            Vehicle carVolvo940 = new Vehicle("Assar Gabrielsson");
            LinkedList list1 = new LinkedList(carVolvo940, null);
            
            Vehicle truckVolvoFl = new Vehicle("Erik Gustav Larson");
            LinkedList list2 = new LinkedList(truckVolvoFl, null);

            list1.next = list2;

            for (LinkedList list = list1; list != null; list = list.next) {
                System.out.println(list.value);
            }
        }
}

/*
問題：LinkedListにはどのようなコンストラクタを追加すべきですか。
 */
