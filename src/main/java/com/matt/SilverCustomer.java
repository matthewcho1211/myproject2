package com.matt;

public class SilverCustomer extends Customer{
    public SilverCustomer(String name, int amount){
        super(name, amount);
    }
    public float backMoney(){
        if(amount > 1000){
            return (amount/1000)*off*1000;
        }else{
            return 0;
        }
    }
    public void print(){
        System.out.println(name + "\t" + amount + "\t"+discount()+"("+backMoney()+")");
    }
}
