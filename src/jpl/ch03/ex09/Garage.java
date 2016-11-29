/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex09;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mariko.madono
 */
/*
問題：何個かのVehicleオブジェクトを配列に保持できるGarageクラスを作成しなさい。
GarageをCloneable型にして、適切なcloneメソッドを書きなさい。
cloneをテストするGarage.mainメソッドを書きなさい。
*/
public class Garage implements Cloneable{
    Vehicle[] vehicleList;
    
    @Override
    public Object clone() {
        try {
            Garage garage = (Garage)super.clone();
            garage.vehicleList = vehicleList.clone();
            return garage;
        } catch (CloneNotSupportedException ex) {
            throw new InternalError(ex.toString());
        }
    }
    public static void main(String[] args){
        Garage garageReal = new Garage();
        Vehicle v1 = new Vehicle("Assar Gabrielsson"); 
        Vehicle v2 = new Vehicle("Erik Gustav Larson"); 
        Vehicle v3 = new Vehicle("Ken Arnold");
        Vehicle v4 = new Vehicle ("変更した所有者");
        garageReal.vehicleList = new Vehicle[3];
        
        garageReal.vehicleList[0] = v1;
        garageReal.vehicleList[1] = v2;
        garageReal.vehicleList[2] = v3;
       
        String rInfo = garageReal.vehicleList[0].toString(garageReal.vehicleList[0]);
        rInfo = rInfo + garageReal.vehicleList[1].toString(garageReal.vehicleList[1]);
        rInfo = rInfo + garageReal.vehicleList[2].toString(garageReal.vehicleList[2]);
        System.out.println("原本のGarageです" + rInfo);

        Garage gClone = (Garage)garageReal.clone();
        String cInfo = gClone.vehicleList[0].toString(gClone.vehicleList[0]);
        cInfo = cInfo + gClone.vehicleList[1].toString(gClone.vehicleList[1]);
        cInfo = cInfo + gClone.vehicleList[2].toString(gClone.vehicleList[2]);
        System.out.println("CloneのGarageです" + cInfo);
        
        garageReal.vehicleList[2] = v4;
        rInfo = garageReal.vehicleList[0].toString(garageReal.vehicleList[0]);
        rInfo = rInfo + garageReal.vehicleList[1].toString(garageReal.vehicleList[1]);
        rInfo = rInfo + garageReal.vehicleList[2].toString(garageReal.vehicleList[2]);
        System.out.println("原本のGarageを変更しました" + rInfo);
        
        cInfo = gClone.vehicleList[0].toString(gClone.vehicleList[0]);
        cInfo = cInfo + gClone.vehicleList[1].toString(gClone.vehicleList[1]);
        cInfo = cInfo + gClone.vehicleList[2].toString(gClone.vehicleList[2]);
        System.out.println("クローンのGarageは変更されません" + cInfo);
        
    }
}
