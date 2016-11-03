/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.ex07;

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
        Vehicle carVolvo940 = new Vehicle("Assar Gabrielsson");    
        carVolvo940.angleOfDirection = 90;
       
        System.out.println("Vehicle名　： car");
        System.out.println("進行方向　：" + carVolvo940.angleOfDirection + "度");
        System.out.println("車種ID　：" + carVolvo940.vehicleId);
        System.out.println("所有者　：" + carVolvo940.owner);
        
        Vehicle truckVolvoFl = new Vehicle("Erik Gustav Larson");
        truckVolvoFl.angleOfDirection = 45;
        
        System.out.println("Vehicle名　： truck");
        System.out.println("進行方向　：" + truckVolvoFl.angleOfDirection + "度");
        System.out.println("車種ID　：" + truckVolvoFl.vehicleId);
        System.out.println("所有者　：" + truckVolvoFl.owner);
    }
    Vehicle(){
        vehicleId = Vehicle.nextVehicleId++;
    }
    Vehicle(String vehicleOwner){
        this();
        owner = vehicleOwner;
    }
}
/*
問題：Vehicleに2つのコンストラクタを追加しなさい。
1つは引数なしコンストラクタで、もう1つは最初の所有者の名前を引数にとります。
mainプログラムを修正して、前と同じ出力が生成されるようにしなさい。
*/