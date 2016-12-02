/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex14;

import jpl.ch02.ex07.Vehicle;

/**
 *
 * @author mariko.madono
 */
public class LinkedList {
        private Object value;
        private LinkedList next;

//次の要素IDをコンストラクタで設定させる。    

        LinkedList(Object vehicle, LinkedList list){
            value = vehicle;
            next = list;
        }
        //アクセッサーメソッド
        public void setValue(Object v){
            value = v;
        }
        public void setList(LinkedList l){
            next = l;
        }
        public Object getValue(){
            return value;
        }
        public LinkedList getNext(){
            return next;
        }
        public static void main(String[] args) {
            Vehicle carVolvo940 = new Vehicle("Assar Gabrielsson");
            carVolvo940.angleOfDirection = 90;
            LinkedList list1 = new LinkedList(carVolvo940, null);
            
            Vehicle truckVolvoFl = new Vehicle("Erik Gustav Larson");
            truckVolvoFl.angleOfDirection = 45;
            LinkedList list2 = new LinkedList(truckVolvoFl, null);

            list1.next = list2;

            for (LinkedList list = list1; list != null; list = list.next) {
                System.out.println(toString(list));
            }
        }
        public static String toString(LinkedList list){
            String separator = System.getProperty("line.separator");
            String linkedListData = "オブジェクト" + list.value + separator;
            linkedListData = linkedListData + "次のオブジェクト" + list.next + separator;
            return linkedListData;
    }
}
/*
問題：LinkedListクラスのフィールドをprivateにして、フィールドに対するアクセッサーメソッドを追加しなさい。
どのフィールが変更を許すメソッドを持ち、どのフィールがそのようなメソッドを持つべきではないですか。
*/