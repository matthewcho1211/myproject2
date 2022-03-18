package com.matt;


public class Shopping {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001", 1200);
        c1.print();
        Customer c2 = new Customer("0002", 800);
        c2.print();
        SilverCustomer c3 = new SilverCustomer("0003", 2000);
        c3.print();
        GoldCustomer c4 = new GoldCustomer("0004", 5000);
        c4.print();

    }
}
