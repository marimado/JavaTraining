/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex10;

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
    public String vehicleType;

   Vehicle(){
        vehicleId = nextVehicleId+ 1;
        nextVehicleId = vehicleId;
    }
    
    Vehicle(String vehicleOwner){
        this();
        owner = vehicleOwner;
    }
    
    public static void main(String[] args){
        Vehicle carVolvo940 = new Vehicle("Assar Gabrielsson");    
        carVolvo940.angleOfDirection = 90;
        carVolvo940.vehicleType = "car";
       System.out.println(toString(carVolvo940));

        Vehicle truckVolvoFl = new Vehicle("Erik Gustav Larson");
        truckVolvoFl.angleOfDirection = 45;
        truckVolvoFl.vehicleType = "truck";
        System.out.println(toString(truckVolvoFl));
        
        int maxNumID = maxNumID();
        System.out.println("識別番号の最大値：" + maxNumID);
    }
    
    public static int maxNumID(){
        return nextVehicleId;
    }
    public static String toString(Vehicle vehicle){
       
        String separator = System.getProperty("line.separator");
        String vehicleData = "Vehicle種別　：" + vehicle.vehicleType + separator;
        vehicleData = vehicleData + "進行方向　：" + vehicle.angleOfDirection + "度" + separator;
        vehicleData = vehicleData + "車種ID　：" + vehicle.vehicleId + separator;
        vehicleData = vehicleData + "所有者　：" + vehicle.owner + separator;
      
        return vehicleData;
    }
}
/*
問題：VehicleにToStringメソッドを追加しなさい。
*/
