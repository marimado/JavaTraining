/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch04.ex03;

import jpl.ch02.ex07.Vehicle;

/**
 *
 * @author mariko.madono
 */
public class LinkedListImpl implements LinkedList {
    private Object value;
    private LinkedListImpl next;

//次の要素IDをコンストラクタで設定させる。    

    LinkedListImpl(Object vehicle, LinkedListImpl list){
        value = vehicle;
        next = list;
    }
        
            //アクセッサーメソッド
    public void setValue(Object v){
        value = v;
    }

    public LinkedListImpl setList(LinkedListImpl l){
        next = l;
        return next;
    }
    //リスト内の要素の数を返すメソッド
    @Override
    public int countList(){
        int count =1;
        if(next == null)
            return count;
        else
            count = count + next.countList();
            return count;
        }
    
       public static void main(String[] args) {
            Vehicle carVolvo940 = new Vehicle("Assar Gabrielsson");
            carVolvo940.angleOfDirection = 90;
            LinkedListImpl list1 = new LinkedListImpl(carVolvo940, null);
            
            Vehicle truckVolvoFl = new Vehicle("Erik Gustav Larson");
            truckVolvoFl.angleOfDirection = 45;
            LinkedListImpl list2 = new LinkedListImpl(truckVolvoFl, null);

            list1.next = list2;

            for (LinkedListImpl list = list1; list != null; list = list.next) {
                System.out.println(toString(list));
            }
            String length = String.valueOf(list1.countList());
            System.out.println("リストの要素は" + (String)length);
        }
        public static String toString(LinkedListImpl list){
            String separator = System.getProperty("line.separator");
            String linkedListData = "オブジェクト" + list.value + separator;
            linkedListData = linkedListData + "次のオブジェクト" + list.next + separator;
            return linkedListData;
    }    

}

