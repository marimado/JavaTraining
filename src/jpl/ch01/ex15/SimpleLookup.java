/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01.ex15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mariko.madono
 */
public class SimpleLookup implements AddRemoveLookup {
    private String[] girlsName = new String[]{"Akari", "Himari", "Hana", "Ichika", "Yukina", "Yui", "Sara", "Kannna", "Hikari", "Sora"};
    private final Object findResult = "2016年度の人気名前ランキングに入っている名前です";
    private final Object addResult = "人気名前ランキングに追加されました";
    private final Object removeSuccessResult = "人気名前ランキングから削除されました";
    private final Object removeNothingResult = "人気名前ランキングには該当する名前がありませんでした";
    
    @Override
    public Object find(String name){
        for(int i = 0; i < girlsName.length; i++){
            if(girlsName[i].equals(name))
                return findResult;
        }
        return null;
    }
    @Override
        public Object add(String addName) {
        String[] girlsNamePlus = new String[girlsName.length +1];
        for(int i = 0; i <girlsName.length; i++){
            girlsNamePlus[i] = girlsName[i];
        }
        girlsNamePlus[girlsName.length] = addName;
        girlsName = girlsNamePlus;
        return addResult;
    }
    @Override
    public Object remove(String removeName) {
        // 渡された名前と同じ名前が配列にあるかさがす。
        String[] removeGirlsName = new String[girlsName.length];  
        for(int i = 0; i < girlsName.length; i++){
            if(girlsName[i].equals(removeName)){
                
                for(int n = i; 1 > girlsName.length - n; n++)
                {
                    removeGirlsName[n] = girlsName[n+1];
                }
                return removeSuccessResult;        
            }
            else{
                removeGirlsName[i] = girlsName[i];  
            }
        }
        return removeNothingResult;
    }
}
