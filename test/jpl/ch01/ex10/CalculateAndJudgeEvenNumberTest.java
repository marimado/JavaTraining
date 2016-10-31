/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package jpl.ch01.ex10;

import ch01.ex10.CalculateAndJudgeEvenNumber;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

/**
 *
 * @author mariko.madono
 */
public class CalculateAndJudgeEvenNumberTest {
    @Test
    public void testMain(){
    //フィボナッチ数列をつくる。
    //期待する配列の値、1,1,2,3,5,8,13,21,34を検証する。
    //期待する配列の値、false,false,true,false,false,true,false,false,trueを検証する。
    //Prepare
        int MAX_INDEX = 9;
        int hi = 1;
        int lo = 1;
        int[] intExpected = new int[]{1,1,2,3,5,8,13,21,34};
        CalculateAndJudgeEvenNumber cal = new CalculateAndJudgeEvenNumber();
        boolean[] boolExpected = new boolean[]{false,false,true,false,false,true,false,false,true};
        
    //Action
    int[] intActual = cal.storeData(lo, hi, MAX_INDEX);
    boolean[] boolActual = cal.judgeEven(intActual, MAX_INDEX);
    
//Check
    assertThat(intActual, is(intExpected));
    assertThat(boolActual, is(boolExpected));
    } 
}
