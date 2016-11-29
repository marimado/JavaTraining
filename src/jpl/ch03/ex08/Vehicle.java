/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex08;

/**
 *
 * @author mariko.madono
 */
/*
問題：VehicleとPassengerVehicleをCloneable型にしなさい。
複製に関して、4つの選択肢のどれを選択すべきでしょうか。
Object.cloneによる単純なコピーは、それらのクラスのcloneメソッドとしては正しいですか。
*/
public class Vehicle implements Cloneable{
    private long speed;
    private long angleOfDirection;
    private String owner;
    private static int nextVehicleId = 000;
    private int vehicleId;
    private String vehicleType;
    private enum Turn{TURN_LEFT, TURN_RIGHT};

    public Vehicle(){
            vehicleId = nextVehicleId+ 1;
            nextVehicleId = vehicleId;
        }
    public Vehicle(String vehicleOwner){
            this();
            owner = vehicleOwner;
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
        Vehicle carVolvo940 = new Vehicle("Assar Gabrielsson");    
        carVolvo940.angleOfDirection = 90;
        carVolvo940.vehicleType = "car";
       System.out.println(carVolvo940.toString(carVolvo940));

        Vehicle truckVolvoFl = new Vehicle("Erik Gustav Larson");
        truckVolvoFl.angleOfDirection = 45;
        truckVolvoFl.vehicleType = "truck";
        System.out.println(truckVolvoFl.toString(truckVolvoFl));
        
        int maxNumID = maxNumID();
        System.out.println("識別番号の最大値：" + maxNumID);
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
    /*
    同じ車種の車を同一オーナーが複数所有することを想定してCloneメソッドを定義する。
    Cloneではいけないフィールドがある
    ・vehicleId（車種ID）
    ・angleOfDirection（進行方向）
    ・speed（スピード）
    */    
    @Override
    public Vehicle clone() throws CloneNotSupportedException{
        //vehicleIdやangleOfDirectionが同一になってしまうので、super.clone();は呼べない。
        Vehicle cloneV = new Vehicle(getOwner());
        cloneV.angleOfDirection = 180;
        cloneV.speed = 100;
        cloneV.vehicleType = vehicleType;
        
        return cloneV;
    }
}
