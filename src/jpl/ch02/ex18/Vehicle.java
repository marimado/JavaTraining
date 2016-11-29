/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex18;

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
    //private final long TURN_LEFT = 90;
    //private final long TURN_RIGHT = 90;

    Vehicle(){
            vehicleId = nextVehicleId+ 1;
            nextVehicleId = vehicleId;
        }
    Vehicle(String vehicleOwner){
            this();
            owner = vehicleOwner;
        }
    public long turn(long angle){
        angleOfDirection = angle;
        return angleOfDirection;
    }
    //2つの定数のどちらかを引数にするやり方がわからない。
    /*
    public boolean turn(){
        return (angleOfDirection == angle);
    }
    */
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
        Vehicle carVolvo940 = new Vehicle(args[0]);  
        carVolvo940.angleOfDirection = 90;
        carVolvo940.vehicleType = "car";
       System.out.println(toString(carVolvo940));

        Vehicle truckVolvoFl = new Vehicle(args[1]);
        truckVolvoFl.angleOfDirection = 45;
        truckVolvoFl.vehicleType = "truck";
        System.out.println(toString(truckVolvoFl));
        
        int maxNumID = maxNumID();
        System.out.println("識別番号の最大値：" + maxNumID);
    }
    public static int maxNumID(){
        // 順番に識別番号を割り振っているので、最後のvehicleIdをゲットしたい。
        return nextVehicleId;
    }
    public static String toString(Vehicle vehicle){
        String sep = System.getProperty("line.separator");
        String vehicleData = "Vehicle種別　：" + vehicle.vehicleType +sep;
        vehicleData = vehicleData + "進行方向　：" + vehicle.angleOfDirection + "度" +sep;
        vehicleData = vehicleData + "車種ID　：" + vehicle.vehicleId +sep;
        vehicleData = vehicleData + "所有者　：" + vehicle.owner +sep;
      
        return vehicleData;
    }    
}
/*
Vehicle.mainを変更して、コマンドラインで指定された名前を所有者として持つ車を作成し、
表示するようにしなさい。
"Assar Gabrielsson"
"Erik Gustav Larson"
*/