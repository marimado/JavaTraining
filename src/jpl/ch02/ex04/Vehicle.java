/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch02.ex04;

/**
 *
 * @author mariko.madono
 */
public class Vehicle {
    public long speed;
    public double angleOfDirection;
    public String owner;
    public static int nextVehicleId;
    
    /*
    以下の観点で検討して、オブジェクトが生成されたときに設定できないのでfinalにしない。
        ・そのフィールドは、オブジェクトの不変な属性を表しているか。
        ・そのフィールドの値は、オブジェクトが生成されたときに決まっているか。
        ・オブジェクトが生成された時に、そのフィールドの値を設定するのは、常に実用的で適切か。
    */
    final int vehicleId = Vehicle.nextVehicleId++;
}
/*
問題：練習問題2.3に対する答えについて考えてください。
識別番号フィールドはfinalとすべきですか。
*/
