/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.ex08;

import ch02.ex05.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author mariko.madono
 */
public class LinkedList {
    public Object objField;
    public int nextListID;
    public int currentListID = 0;
    
//次の要素IDをコンストラクタで設定させる。
    LinkedList(){
         nextListID = currentListID++;
    }
    
    public static void main(String[] args){
        LinkedList vehicleList = new LinkedList();
        Vehicle carVolvo940 = new Vehicle();
        Vehicle truckVolvoFl = new Vehicle();
        ArrayList<LinkedList> list = new ArrayList();

        vehicleList.objField = carVolvo940;
        list.add(vehicleList);

        vehicleList.objField = truckVolvoFl;
        list.add(vehicleList);
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).objField);
            System.out.println(list.get(i).nextListID);
            //同じオブジェクトが2つ入っている...
        }
    }
}
    
    
    
/*
問題：LinkedListにはどのようなコンストラクタを追加すべきですか。
*/
