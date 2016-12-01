/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch04.ex04;

/**
 *
 * @author mariko.madono
 */
interface Queue<E> extends Collection<E> {
    boolean add(E e);
    E element();
    boolean offer(E e);
    E peek();
    E poll();
    E remove();
}
