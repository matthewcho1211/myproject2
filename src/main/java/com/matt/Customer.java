package com.matt;

public class Customer {
    String name;
    int amount;
    float off = 0.1f;
    public Customer(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    public float discount(){
        if(amount > 1000){
            return amount - (amount/1000)*off*1000;
        }else{
            return amount;
        }
    }
    public void print(){
        System.out.println(name + "\t" + amount + "\t"+discount());
    }
}
