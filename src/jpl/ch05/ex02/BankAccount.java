/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl.ch05.ex02;

/**
 *
 * @author mariko.madono
 */
public class BankAccount {
    private long number;
    private long balance;
    private Action lastAct;
    private History history;
    
    public class Action{
        private String act;
        private long amount;
       
        Action(String act, long amount){
            this.act = act;
            this.amount = amount;
        }
        
        public String toString(){
            return number + ":" + act + " " + amount;
        }
    }
    // 本当はLinkedListにしたかった。。。
    //　口座に対する最後の10個の処理を記録する
        // 口座NumberをもとにHistoryオブジェクトを特定する
        // Historyオブジェクトが何個あるのか数える
        //すでに10個Historyオブジェクトがある
        //    true→最古のレコードを探す。削除する。最後のHisotryオブジェクトのNextに新しいLastActHistoryオブジェクトを追加する。
        //    false→削除せずにHistoryオブジェクトを追加する。
    public static class History implements Cloneable{
        private static final int MAX = 10;
        private Action[] actionRecord = new Action[MAX];
        int current = 0;
        
        public Action next(){           
            return actionRecord[current];
        }
        public void addHistory(Action act){
            if(++current == MAX){
                for(int i = 0; i < MAX; i++){
                    actionRecord[i] = actionRecord[i+1];
                }
                actionRecord[MAX] = act;
            }
            else
                actionRecord[current] = act;
                
        }
        public History clone(){
            History history = new History();
            history.actionRecord = this.actionRecord;
            history.current = this.current;
            return history;
        }
    }
    
    public History history(){
        return history.clone();
    }
    
    public void deposit(long amount){
        balance += amount;
        lastAct = new Action("deposit", amount);
    }
    
    public void withdraw(long amount){
        balance -= amount;
        lastAct = new Action("withdraw", amount);
    }
    
}
