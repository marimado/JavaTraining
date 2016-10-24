/*
 * Copyright (C) 2016 Mariko Madono. All rights reserved.
 */
package jpl.ch01.ex08;

/**
 *
 * @author mariko.madono
 */
public class Point {
    //フィールド変数
    private double x,y;
    public static void main(String[] args){
        Point point = new Point();
        point.set(0.0,1.2);
        point.print(point);
        point.clear();
        point.print(point);
    }
    private void set(double x, double y){
       this.x = x;
       this.y = y;
    }
    private void print(Point p){
        System.out.println("x" + x);
        System.out.println("y" + y);
    }
    public void clear(){
        x = 0.0;
        y = 0.0;
    }
}
