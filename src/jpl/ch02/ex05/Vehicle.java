/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex05;

/**
 *
 * @author mariko.madono
 */
public class Vehicle {
    public long speed;
    public long angleOfDirection;
    public String owner;
    public static int nextVehicleId = 000;
    public int vehicleId;
    
    public static void main(String[] args){
        Vehicle carVolvo940 = new Vehicle();    
        carVolvo940.angleOfDirection = 90;
        carVolvo940.owner = "Assar Gabrielsson";
        carVolvo940.vehicleId = nextVehicleId + 1;
        
        System.out.println("Vehicle名　： car");
        System.out.println("進行方向　：" + carVolvo940.angleOfDirection + "度");
        System.out.println("車種ID　：" + carVolvo940.vehicleId);
        System.out.println("所有者　：" + carVolvo940.owner);
        
        Vehicle truckVolvoFl = new Vehicle();
        truckVolvoFl.angleOfDirection = 45;
        truckVolvoFl.owner = "Erik Gustav Larson";
        truckVolvoFl.vehicleId = nextVehicleId + 2;
        
        System.out.println("Vehicle名　： truck");
        System.out.println("進行方向　：" + truckVolvoFl.angleOfDirection + "度");
        System.out.println("車種ID　：" + truckVolvoFl.vehicleId);
        System.out.println("所有者　：" + truckVolvoFl.owner);
    }
    public String toString(){
        String vehicleInfo = "車種ID" + vehicleId + "所有者" + owner;
        return vehicleInfo;
    }
}
/*
問題：Vehicleクラスにmainメソッドを書いて、
数個の乗り物を作成し、それらのオブジェクトのフィールドの値を表示するようにしなさい。

疑問点
angleを算出するメソッドを作りたかった。
すべてを手書きでprintlnしたが、設定したオブジェクトのフィールドを出力するようなループにできないのか。
*/
