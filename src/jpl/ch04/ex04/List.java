/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch04.ex04;
import java.util.Iterator;
import java.util.ListIterator;
/**
 *
 * @author mariko.madono
 */
interface List<E> extends Collection<E>{
     boolean add(E e); 
          //指定された要素をリストの最後に追加します (任意のオペレーション)。
void add(int index, E element); 
          //リスト内の指定された位置に、指定された要素を挿入します (任意のオペレーション)。
boolean addAll(Collection<? extends E> c); 
          //指定されたコレクション内のすべての要素を、指定されたコレクションの反復子によって返される順序でリストの最後に追加します (任意のオペレーション)。
boolean addAll(int index, Collection<? extends E> c); 
          //指定されたコレクション内のすべての要素を、リストの指定された位置に挿入します (任意のオペレーション)。
void clear(); 
          //すべての要素をリストから削除します (任意のオペレーション)。
 boolean contains(Object o); 
          //リストに指定の要素がある場合に true を返します。
 boolean containsAll(Collection<?> c); 
          //指定されたコレクションのすべての要素がリストに含まれている場合に true を返します。
 boolean equals(Object o); 
          //指定されたオブジェクトがリストと等しいかどうかを比較します。
 E get(int index); 
          //リスト内の指定された位置にある要素を返します。
 int hashCode(); 
          //このリストのハッシュコード値を返します。
 int indexOf(Object o); 
          //指定された要素がリスト内で最初に検出された位置のインデックスを返します。
 boolean isEmpty(); 
          //リストに要素がない場合に true を返します。
 Iterator<E> iterator(); 
          //このリスト内の要素を適切な順序で繰り返し処理する反復子を返します。
 int lastIndexOf(Object o); 
          //指定された要素がリスト内で最後に検出された位置のインデックスを返します。
 ListIterator<E> listIterator(); 
          //このリスト内の要素を適切な順序で繰り返し処理するリスト反復子を返します。
 ListIterator<E> listIterator(int index); 
          //リスト内の要素を適切な順序で繰り返し処理する、リスト内の指定された位置から開始する反復子を返します。
 E remove(int index); 
          //リスト内の指定された位置にある要素を削除します (任意のオペレーション)。
 boolean remove(Object o); 
          //指定された要素がこのリストにあれば、その最初のものをリストから削除します (任意のオペレーション)。
 boolean removeAll(Collection<?> c); 
          //このリストから、指定されたコレクションに含まれる要素をすべて削除します (任意のオペレーション)。
 boolean retainAll(Collection<?> c); 
          //指定されたコレクションに格納されている要素だけがリスト内に含まれるようにします (任意のオペレーション)。
 E set(int index, E element); 
          //リスト内の指定された位置にある要素を、指定された要素に置き換えます (任意のオペレーション)。
 int size(); 
          //リスト内にある要素の数を返します。
 List<E> subList(int fromIndex, int toIndex); 
          //このリストの、fromIndex (これを含む) から toIndex (これを含まない) の範囲の部分のビューを返します。
 Object[] toArray(); 
          //リスト内のすべての要素を適切な順序で (最初の要素から最後の要素へ) 格納している配列を返します。
<T> T[]toArray(T[] a); 
          //リスト内のすべての要素を適切な順序で (最初の要素から最後の要素へ) 格納している配列を返します。
}
