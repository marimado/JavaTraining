/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch03.ex07;

import java.util.Objects;

/**
 *
 * @author mariko.madono
 */
public class ColorAttr extends Attr{
    private ScreenColor myColor; //変換された色
    
    public ColorAttr(String name, Object value){
        super(name, value);
        decodeColor();
    }
    
    public ColorAttr(String name){
        this(name, "transparent");
    }
    
    public ColorAttr(String name, ScreenColor value){
        super(name, value.toString());
        myColor = value;
    }
    
    @Override
    public Object setValue(Object newValue){
        //スーパークラスのsetValueを最初に行う
        Object retval = super.setValue(newValue);
        decodeColor();
        return retval;
    }
    /*
    値を記述ではなくScreenColorに設定する
    */
    public ScreenColor setValue(ScreenColor newValue){
        //スーパークラスのsetValueを最初に行う
        super.setValue(newValue.toString());
        ScreenColor oldValue = myColor;
        myColor = newValue;
        return oldValue;
    }
    public ScreenColor getColor(){
        return myColor;
    }
    
    @Override
    public boolean equals(Object o){
        if((o instanceof ColorAttr) && ((ColorAttr)o).getColor()==this.myColor){
            return true;
        }
        else
            return false;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.myColor);
        return hash;
    }
    
    protected void decodeColor(){
        if(getValue() == null){
            myColor = null;
        }
        //この部分がエラーになる。。。原因が分からない。
        //else
        //    myColor = new ScreenColor(getValue());    
        }    
}
