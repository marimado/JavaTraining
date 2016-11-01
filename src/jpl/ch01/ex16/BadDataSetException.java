/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01.ex16;

/**
 *
 * @author mariko.madono
 */
public class BadDataSetException extends Exception {
    String erroredFile;
    String exceptionType; 
}

/*
問題：BadDataSetExceptionにフィールドを追加してデータの集まりの名前と、
問題を通知しているI/O例外を保持できるようにしなさい。
それにより、その例外をキャッチしてエラーの詳細を知ることができるようになります。
*/
