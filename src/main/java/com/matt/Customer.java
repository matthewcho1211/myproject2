package com.matt;

public class Customer {
    String name;
    int amount;
    public Customer(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    public int discount(){
        if(amount > 1000){
            int dis = amount/1000;
            return amount - 100*dis;
        }else{
            return amount;
        }
    }
    public void print(){
        System.out.println(name + "\t" + amount + "\t"+discount());
    }
}
