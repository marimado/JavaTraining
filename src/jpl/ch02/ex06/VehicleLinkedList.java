/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.ex06;

import ch02.ex05.Vehicle;
import java.util.ArrayList;



/**
 *
 * @author mariko.madono
 */
//Vehicleオブジェクトを作る
//VehicleオブジェクトをLinkedListに格納する
//nextListIDを格納する
//
public class VehicleLinkedList {
    public Object objField;
    public int nextListID = 0;
    
    public static void main(String[] args){
        VehicleLinkedList vehicleList = new VehicleLinkedList();
        Vehicle carVolvo940 = new Vehicle();
        Vehicle truckVolvoFl = new Vehicle();
        ArrayList<VehicleLinkedList> list = new ArrayList();

        vehicleList.objField = carVolvo940;
        vehicleList.nextListID = 1;
        list.add(vehicleList);

        vehicleList.objField = truckVolvoFl;
        vehicleList.nextListID = 2;
        list.add(vehicleList);
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).objField);
            System.out.println(list.get(i).nextListID);
            //同じオブジェクトが2つ入っている...
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