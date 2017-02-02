/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch07.ex03;

/**
 *
 * @author mariko.madono
 */
public class NjigenArray {
    static final int DEPTH = 12;
    public static void main(String[] args){
        int[][] intArray = new int[1][1];
        intArray[0][0]= 1;
        
        //for(int i = 0; i < DEPTH; i++){
            print(intArray);
            intArray = makePascalTriangleArray(intArray);
            print(intArray);
        //}       
    }
    private static int[][] makePascalTriangleArray(int[][] array){
        int[][] pascalArray = new int[array.length +1][array.length +1];
        pascalArray[0][0]= array[0][0];
        
        for(int y = 1; y < array.length; y++){
            for(int x = 0; x < array.length; x++){
                pascalArray[y][x]= array[y-1][x] + array[y-1][x+1];
            }
            int num = array.length;
            pascalArray[num][num] = 1;
        }
        
        return pascalArray;
    }
    
    private static void print(int[][] array){
        for(int[] i : array){
            for(int n : i){
                System.out.print(n + " ");
            }
             System.out.println();
        }
       
    }
}
