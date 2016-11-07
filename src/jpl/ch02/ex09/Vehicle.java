/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex09;

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
        
        int maxNumID = maxNumID();
        maxNumID = maxNumID - 1;
        System.out.println("識別番号の最大値：" + maxNumID);
    }
    Vehicle(){
        vehicleId = Vehicle.nextVehicleId++;
    }
    Vehicle(String vehicleOwner){
        this();
        owner = vehicleOwner;
    }
    public static int maxNumID(){
        // 順番に識別番号を割り振っているので、最後のvehicleIdをゲットしたい。
        return nextVehicleId;
    }
}
/*
問題：Vehicleクラスに今まで使われた識別番号の最大値を返すstaticメソッドを追加しなさい。
*/