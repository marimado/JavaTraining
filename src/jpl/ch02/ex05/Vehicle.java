/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.ex05;

/**
 *
 * @author mariko.madono
 */
public class Vehicle {public long speed;
    public long angleOfDirection;
    public String owner;
    public static int nextVehicleId = 001;
    public int vehicleId = Vehicle.nextVehicleId++;
    
    public static void main(String[] args){
        Vehicle carVolvo940 = new Vehicle();    
        carVolvo940.angleOfDirection = 90;
        carVolvo940.owner = "Assar Gabrielsson";
        carVolvo940.vehicleId = Vehicle.nextVehicleId++;
        
        System.out.println("Vehicle名　： car");
        System.out.println("進行方向　：" + carVolvo940.angleOfDirection + "度");
        System.out.println("車種ID　：" + carVolvo940.vehicleId);
        
        Vehicle truckVolvoFl = new Vehicle();
        truckVolvoFl.angleOfDirection = 45;
        truckVolvoFl.owner = "Erik Gustav Larson";
        truckVolvoFl.vehicleId = Vehicle.nextVehicleId++;
        
        System.out.println("Vehicle名　： truck");
        System.out.println("進行方向　：" + truckVolvoFl.angleOfDirection + "度");
        System.out.println("車種ID　：" + truckVolvoFl.vehicleId);
    }
}
/*
問題：Vehicleクラスにmainメソッドを書いて、
数個の乗り物を作成し、それらのオブジェクトのフィールドの値を表示するようにしなさい。

疑問点
angleを算出するメソッドを作りたかった。
すべてを手書きでprintlnしたが、設定したオブジェクトのフィールドを出力するようなループにできないのか。
*/
