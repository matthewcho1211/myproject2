package com.matt;

public class SilverCustomer extends Customer{
    public SilverCustomer(String name, int amount){
        super(name, amount);
    }
    @Override
    public int discount(){
        if(amount > 1000){
            int dis = amount/1000;
            return amount - 100*dis;
        }else{
            return amount;
        }
    }

    public int reduction(){
        if(amount > 1000){
            return amount/1000 * 100 ;
        }else{
            return 0;
        }
    }
    public void print(){
        System.out.println(name + "\t" + amount + "\t"+discount()+"("+reduction()+")");
    }
}
