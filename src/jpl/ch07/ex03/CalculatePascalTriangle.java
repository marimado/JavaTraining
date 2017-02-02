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
/*
問題：深さが12のパスカルの三角形を計算するプログラムを作成しなさい。
三角形の各行を適切な長さの配列とし、各行の配列を長さ12のint配列の配列に格納しなさい。
定数12ではなく、各配列の長さを使用して配列の配列を表示するメソッドにより、
結果を表示するようにプログラムしなさい。
さらに、表示メソッドを変更することなく、12を他の定数に変更してみなさい。
*/

/*
配列の配列を使えていない。
*/
public class CalculatePascalTriangle {
    static final int DEPTH = 12;
    public static void main(String[] args){
        int[] intArray = new int[1];
        intArray[0] = 1;
        for(int i = 0; i < DEPTH; i++){
            print(intArray);
            intArray = makePascalTriangleArray(intArray);
        }    
    }
        
    private static int[] makePascalTriangleArray(int[] array){
        int[] pascalArray = new int[array.length +1];
        pascalArray[0] = array[0];
        
        for(int i = 1; i < array.length; i++){
            pascalArray[i] = array[i-1] + array[i];
        }
        pascalArray[pascalArray.length - 1] = 1;
        return pascalArray;
    }
    
    private static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
