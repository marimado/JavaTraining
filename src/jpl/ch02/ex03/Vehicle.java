/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.ex03;

/**
 *
 * @author mariko.madono
 */
public class Vehicle {
    public long speed;
    public double angleOfDirection;
    public String owner;
    public static int nextVehicleId;
    public int vehicleId;
}
/*
問題：次の乗り物の識別番号を保持するstaticフィールドと、
車単位でID番号を保持するための非staticフィールをVehicleクラスに追加しなさい。
*/
