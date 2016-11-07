/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex13;

/**
 *
 * @author mariko.madono
 */
public class Vehicle {
    private long speed;
    private long angleOfDirection;
    private String owner;
    private static int nextVehicleId = 000;
    private int vehicleId;
    private String vehicleType;
    
    public long getSpeed(){
        return speed;
    }
    public long getAngleOfDirection(long x, long y){
        return angleOfDirection;
    }
    public String getOwner(String name){
        owner = name;
        return owner;
    }
    public int getVehicleId(){
        return vehicleId;
    }
    public String getVehicleType(String type){
        vehicleType = type;
        return vehicleType;
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
    public static String toString(Vehicle vehicle){
        //改行いれるように改善したい。
        String vehicleData = "Vehicle種別　：" + vehicle.vehicleType;
        vehicleData = vehicleData + "進行方向　：" + vehicle.angleOfDirection + "度";
        vehicleData = vehicleData + "車種ID　：" + vehicle.vehicleId;
        vehicleData = vehicleData + "所有者　：" + vehicle.owner;
      
        return vehicleData;
    }
}
/*
Vehicleクラスのフィールドを privateにして、フィールドに対するアクセッサーメソッドを追加しなさい。
どのフィールが変更を許すメソッドを持ち、どのフィールドがどのようなメソッドを持つべきではないですか。
*/