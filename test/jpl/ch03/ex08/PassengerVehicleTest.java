/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex08;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mariko.madono
 */
public class PassengerVehicleTest {
    
    public PassengerVehicleTest() {
    }

    /**
     * Test of clone method, of class PassengerVehicle.
     */
    @Test
    public void testClone() throws CloneNotSupportedException {
        System.out.println("clone");
        PassengerVehicle expResult = new PassengerVehicle("mariko madono", 4);
        PassengerVehicle result = expResult.clone();
        
        PassengerVehicleTest pt = new PassengerVehicleTest();
        String expStr = pt.toString(expResult);
        System.out.println(expStr);
        
        String resStr = pt.toString(result);
        System.out.println(resStr);
        
    }
    public String toString(PassengerVehicle vehicle){
        String sep = System.getProperty("line.separator");
        String vehicleData = "Vehicle種別　：" + vehicle.getVehicleType()+ sep;
        vehicleData = vehicleData + "進行方向　：" + vehicle.getAngleOfDirection() + "度" + sep;
        vehicleData = vehicleData + "車種ID　：" + vehicle.getVehicleId() + sep;
        vehicleData = vehicleData + "所有者　：" + vehicle.getOwner() + sep;
        //vehicleData = vehicleData + "定員（座席数）　：" + vehicle.getPassengerNum +  "シート" + sep;
        vehicleData = vehicleData + "現在の乗員　：" + vehicle.getPassengerNum() +  "人" + sep;

        return vehicleData;
    }
    
}
