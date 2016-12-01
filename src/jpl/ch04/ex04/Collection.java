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
interface Collection<E> extends Iterable<E>{
    boolean contains(Object o); 
              //コレクションに指定された要素がある場合に true を返します。
    boolean containsAll(Collection<?> c);
              //このコレクション内に、指定されたコレクションのすべての要素がある場合に true を返します。
    boolean equals(Object o); 
              //指定されたオブジェクトとこのコレクションが等しいかどうかを比較します。
    int hashCode(); 
              //コレクションのハッシュコード値を返します。
    boolean isEmpty(); 
              //コレクションに要素がない場合に true を返します。
    Iterator<E> iterator(); 
              //コレクションの要素の反復子を返します。
    boolean remove(Object o); 
              //指定された要素のインスタンスがこのコレクションにあれば、そのインスタンスをコレクションから 1 つ削除します (任意のオペレーション)。
    boolean removeAll(Collection<?> c); 
              //指定されたコレクションにも格納されているこのコレクションのすべての要素を削除します (任意のオペレーション)。
    boolean retainAll(Collection<?> c); 
              //このコレクションにおいて、指定されたコレクションに格納されている要素だけを保持します (任意のオペレーション)。
    int size(); 
              //このコレクション中の要素の数を返します。
    Object[] toArray(); 
              //このコレクションの要素がすべて格納されている配列を返します。
    <T> T[] toArray(T[] a); 
              //このコレクション内のすべての要素を保持する配列を返します。
}
