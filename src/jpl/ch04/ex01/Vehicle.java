/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch04.ex01;

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
    private enum Turn{TURN_LEFT, TURN_RIGHT};
    private EnergySource energy;

    public Vehicle(){
            vehicleId = nextVehicleId+ 1;
            nextVehicleId = vehicleId;
        }
    public Vehicle(String vehicleOwner,EnergySource es){
            this();
            owner = vehicleOwner;
            if(es instanceof Battery){
                ((Battery) es).chargeBattery(90);
                energy = es;
            }
            else
                ((GasTank)es).fillGas(100);
                energy = es;
        }

    public long turn(long angle){
        angleOfDirection = angle;
        return angleOfDirection;
    }
    public long turn(Turn turn){
        if(turn == Turn.TURN_LEFT){
            angleOfDirection = 90;
        }
        else
            angleOfDirection = -90;
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
    public long getAngleOfDirection(){
        return angleOfDirection;
    }
    public void setAngleOfDirection(long l){
        angleOfDirection = l;
    }
    public String getOwner(){
        return owner;
    }
    public int getVehicleId(){
        return vehicleId;
    }
    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleType(String type){
        vehicleType = type;
    }
    
    public static void main(String[] args){
        Vehicle carVolvo940 = new Vehicle("Assar Gabrielsson", new Battery());    
        carVolvo940.angleOfDirection = 90;
        carVolvo940.vehicleType = "car";
       System.out.println(carVolvo940.toString(carVolvo940));

        Vehicle truckVolvoFl = new Vehicle("Erik Gustav Larson", new GasTank());
        truckVolvoFl.angleOfDirection = 45;
        truckVolvoFl.vehicleType = "truck";
        System.out.println(truckVolvoFl.toString(truckVolvoFl));
        
        int maxNumID = maxNumID();
        System.out.println("識別番号の最大値：" + maxNumID);
    }
    public void start(){
        if(energy.isEmpty()|| energy == null)
        {
            System.out.println("燃料がありません");
        }
    }
    public static int maxNumID(){
        // 順番に識別番号を割り振っているので、最後のvehicleIdをゲットしたい。
        return nextVehicleId;
    }
    public String toString(Vehicle vehicle){
        String sep = System.getProperty("line.separator");
        String vehicleData = "Vehicle種別　：" + vehicle.vehicleType + sep;
        vehicleData = vehicleData + "進行方向　：" + vehicle.angleOfDirection + "度" + sep;
        vehicleData = vehicleData + "車種ID　：" + vehicle.vehicleId + sep;
        vehicleData = vehicleData + "所有者　：" + vehicle.owner + sep;
      
        return vehicleData;
    }    
}
/*
問題：Vehicleに2つのturnメソッドを追加してください。
１つは、引数として回転する角度を受け取り、
もう1つは定数Vehicle.TURN_LEFTか、Vehicle.TURN_RIGHTを引数として受け取ります。
*/