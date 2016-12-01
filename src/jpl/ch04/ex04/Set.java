/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch04.ex04;

import java.util.Iterator;

/**
 *
 * @author mariko.madono
 */
interface Set<E> extends Collection<E>{
    boolean add(E e); 
          //指定された要素がセット内になかった場合、セットに追加します (任意のオペレーション)。
    boolean addAll(Collection<? extends E> c); 
              //指定されたコレクションのすべての要素について、その要素がこのセット内にない場合、セットに追加します (任意のオペレーション)。
    void clear(); 
              //セットからすべての要素を削除します (任意のオペレーション)。
    boolean contains(Object o); 
              //セットが、指定された要素を保持している場合に true を返します。
    boolean containsAll(Collection<?> c); 
              //指定されたコレクションのすべての要素がセット内にある場合に true を返します。
    boolean equals(Object o); 
              //指定されたオブジェクトがセットと同じかどうかを比較します。
    int hashCode(); 
              //セットのハッシュコード値を返します。
    boolean isEmpty(); 
              //セットが要素を 1 つも保持していない場合に true を返します。
    Iterator<E> iterator(); 
              //セット内の各要素についての反復子を返します。
    boolean remove(Object o); 
              //指定された要素がセット内にあった場合、セットから削除します (任意のオペレーション)。
    boolean removeAll(Collection<?> c); 
              //このセットから、指定されたコレクションに含まれる要素をすべて削除します (任意のオペレーション)。
    boolean retainAll(Collection<?> c); 
              //セット内の要素のうち、指定されたコレクション内にある要素だけを保持します (任意のオペレーション)。
    int size(); 
              //セット内の要素数 (そのカーディナリティ) を返します。
    Object[] toArray(); 
              //セット内のすべての要素が格納されている配列を返します。
    <T> T[] toArray(T[] a); 
              //セット内のすべての要素を格納している配列を返します。
}
