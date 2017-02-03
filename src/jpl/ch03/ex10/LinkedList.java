/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex10;

/**
 *
 * @author mariko.madono
 */
/*
問題：(第2章の問題からの)LinkedListクラスをCloneableにして、値の複製ではなく、
元のリストと同じ値を参照している新たなリストを返すcloneメソッドを書きなさい。
つまり、1つのリストのに対する変更は他方のリストに影響しないが、
リストが参照しているオブジェクトに対する変更は、他方のリストから見えます。
*/
public class LinkedList implements Cloneable{
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
    @Override
    
    public Object clone() throws CloneNotSupportedException{
        
        LinkedList list = (LinkedList)super.clone();
        // 1つのリストに対する変更は他方のリストには影響しないという問題の部分に対応するとこうなる。
        if(next != null){
            //再帰呼び出しで注意することは、stackオーバーフローに注意しないといけない。
            //ループで書いたほうが良い。
            list.next = (LinkedList)next.clone();
        }
       return list;
    }
       public static void main(String[] args) {
            Vehicle carVolvo940 = new Vehicle("Assar Gabrielsson");
            carVolvo940.setAngleOfDirection(90);
            LinkedList list1 = new LinkedList(carVolvo940, null);
            
            Vehicle truckVolvoFl = new Vehicle("Erik Gustav Larson");
            truckVolvoFl.setAngleOfDirection(45);
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
