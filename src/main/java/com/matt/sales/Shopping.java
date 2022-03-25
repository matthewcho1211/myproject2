package com.matt.sales;


import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        Customer c1 = new Customer("0001", 1200);
        Customer c2 = new Customer("0002", 800);
        SilverCustomer c3 = new SilverCustomer("0003", 2000);
        GoldCustomer c4 = new GoldCustomer("0004", 5000);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        for(Customer c : list){
            c.print();
        }

    }
}
