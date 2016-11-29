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
public class VehicleTest {
    /**
     * Test of clone method, of class Vehicle.
     * @throws java.lang.Exception
     */
    @Test
    public void testClone() throws Exception {
        System.out.println("clone");
        Vehicle expResult = new Vehicle("mariko madono");
        Vehicle result = expResult.clone();
        VehicleTest vt = new VehicleTest();
        String expStr = vt.toString(expResult);
        System.out.println(expStr);
        String resStr = vt.toString(result);
        System.out.println(resStr);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public String toString(Vehicle vehicle){
        String sep = System.getProperty("line.separator");
        String vehicleData = "Vehicle種別　：" + vehicle.getVehicleType()+ sep;
        vehicleData = vehicleData + "進行方向　：" + vehicle.getAngleOfDirection() + "度" + sep;
        vehicleData = vehicleData + "車種ID　：" + vehicle.getVehicleId() + sep;
        vehicleData = vehicleData + "所有者　：" + vehicle.getOwner() + sep;
      
        return vehicleData;
    }
}
