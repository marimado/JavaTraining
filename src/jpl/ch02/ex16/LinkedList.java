/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex16;

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
    public Object setValue(Object v){
        value = v;
        return value;
    }

    public LinkedList setList(LinkedList l){
        next = l;
        return next;
    }
    //リスト内の要素の数を返すメソッド
    public static int countList(LinkedList list){
        int length = 1;
        while (list.next !=null){
            int i = 1;
            list = list.next;
            i++;
            length = i;
        }
        return length;            
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
            String length = String.valueOf(countList(list1));
            System.out.println("リストの要素は" + (String)length);
        }
        public static String toString(LinkedList list){
            String separator = System.getProperty("line.separator");
            String linkedListData = "オブジェクト" + list.value + separator;
            linkedListData = linkedListData + "次のオブジェクト" + list.next + separator;
            return linkedListData;
    }    
}
/*
問題：リスト内の要素の数を返すメソッドをLinkedListに追加しなさい。
*/
