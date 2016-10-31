/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch01.ex15;

import ch01.ex15.SimpleLookup;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mariko.madono
 */
public class SimpleLookupTest {
    
    public SimpleLookupTest() {
    }
    SimpleLookup instance = new SimpleLookup();
    /**
     * Test of find method, of class SimpleLookup.
     */
    @Test
    public void testFind() {
        String name = "Sara";
        Object expFindResult = "2016年度の人気名前ランキングに入っている名前です";
        Object result = instance.find(name);
        assertEquals(expFindResult, result);
    }
    @Test
    public void testAdd() {
        String addName = "Honoka";
        Object expAddResult = "人気名前ランキングに追加されました";
        Object result = instance.add(addName);
        assertEquals(expAddResult, result);
    }
   @Test
    public void testRemoveSuccess() {
        String removeName = "Sara";
        Object expRemoveResult = "人気名前ランキングから削除されました";
        Object result = instance.remove(removeName);
        assertEquals(expRemoveResult, result);
    }
   @Test
    public void testRemoveNoResult() {
        String removeName = "Test";
        Object expRemoveResult = "人気名前ランキングには該当する名前がありませんでした";
        Object result = instance.remove(removeName);
        assertEquals(expRemoveResult, result);
    }
   
}
