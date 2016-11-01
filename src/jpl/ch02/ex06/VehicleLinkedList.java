/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.ex06;

import ch02.ex05.Vehicle;
import java.util.LinkedList;


/**
 *
 * @author mariko.madono
 */
public class VehicleLinkedList {
    public Object obj;
    public static int nextList;
    public static void main(String[] args){
       LinkedList vehicleList = new LinkedList();
        Vehicle carVolvo940 = new Vehicle();
        Vehicle truckVolvoFl = new Vehicle();
        vehicleList.add(carVolvo940);
        vehicleList.add(truckVolvoFl);

        for (int i = 0 ; i < vehicleList.size() ; i++){
            Object vehicle = vehicleList.get(i);
            System.out.println(vehicle);
            
    }
    }
}
/*
問題：LinkedListクラスにmainメソッドを書いて、
Vehicle型のオブジェクトを数個作成して、リストの連続したノードに入れなさい。

疑問点：オブジェクトを出力してでてきた値は何か？
*/