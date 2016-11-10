/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex17;

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
    private final long TURN_LEFT = 90;
    private final long TURN_RIGHT = 90;
    private enum Turn{TURN_LEFT, TURN_RIGHT};
    
    public long turn(long angle){
        angleOfDirection = angle;
        return angleOfDirection;
    }
    public long turn(Turn turn){
        //angleOfDirection =(long)turn;
        return angleOfDirection;
    }
    
    public long getSpeed(){
        return speed;
    }
    public long changedSpeed(long currentSpeed){
        speed = currentSpeed;
        return speed;
    }
    public long stop(){
        speed = 0;
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
問題：Vehicleに2つのturnメソッドを追加してください。
１つは、引数として回転する角度を受け取り、
もう1つは定数Vehicle.TURN_LEFTか、Vehicle.TURN_RIGHTを引数として受け取ります。
*/