/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex08;
/**
 *
 * @author mariko.madono
問題：VehicleとPassengerVehicleをCloneable型にしなさい。
* 複製に関して、4つの選択肢のどれを選択すべきでしょうか。
* Object.cloneによる単純なコピーは、されらのクラスのcloneメソッドとしては正しいでしょうか。
 */

public class PassengerVehicle extends Vehicle implements Cloneable{
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
    /*
    同じ車種の車を同一オーナーが複数所有することを想定してCloneメソッドを定義する。
    Cloneしてはいけないフィールド
    ・車種ID
    ・angleOfDirection（進行方向）
    ・passengerNum(現在座っている人）
    ・vehicleId（車種ID）
    */
    @Override
    public PassengerVehicle clone() throws CloneNotSupportedException{
        try {
            PassengerVehicle clonePV = (PassengerVehicle)super.clone();
            clonePV.seatNum = seatNum;
            clonePV.passengerNum = 5;
            return clonePV;
        } catch (CloneNotSupportedException ex) {
            throw new InternalError(ex.toString());
        }
    }
}
