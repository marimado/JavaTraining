/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex01;
import jpl.ch02.ex17.Vehicle;
/**
 *
 * @author mariko.madono
問題：第2章の練習問題のVehicleクラスを拡張してPassengerVehicleクラスを作成し、
車が持っている座席数と現在座っている人数を帰す機能を追加しなさい。
PassengerVehicleに新たなmainメソッドを定義して、PassenngerVehicleオブジェクトを数個生成して表示するようにしなさい。
 */

public class PassengerVehicle extends Vehicle {
    private int seatNum;
    private int passengerNum;
    
    PassengerVehicle(){
        super();
    }
    
    PassengerVehicle(String vehicleOwner, int seat){
        super(vehicleOwner);
        seatNum = seat;
    }
    
    public int getPassengerNum(){
        return passengerNum;
    }
    public int getSeatNum(){
        return seatNum;
    }
    public static void main(String[] args){
        PassengerVehicle carVolvo940 = new PassengerVehicle("Assar Gabrielsson", 5);    
        carVolvo940.setAngleOfDirection(90);
        carVolvo940.setVehicleType("car");
        carVolvo940.passengerNum = 4;
        System.out.println(carVolvo940.toString(carVolvo940));

        PassengerVehicle truckVolvoFl = new PassengerVehicle ("Erik Gustav Larson", 3);
        truckVolvoFl.setAngleOfDirection(45);
        truckVolvoFl.setVehicleType("truck");
        truckVolvoFl.passengerNum = 1;
        System.out.println(truckVolvoFl.toString(truckVolvoFl));
        
        int maxNumID = maxNumID();
        System.out.println("識別番号の最大値：" + maxNumID);
    }
    
    public String toString(PassengerVehicle pVehicle){
        String sep = System.getProperty("line.separator");
        String vehicleData = super.toString(pVehicle);
        vehicleData = vehicleData + "定員（座席数）　：" + pVehicle.seatNum +  "シート" + sep;
        vehicleData = vehicleData + "現在の乗員　：" + pVehicle.passengerNum +  "人" + sep;
        
        return vehicleData;
    }
}
