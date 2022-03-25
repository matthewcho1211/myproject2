package com.matt.ticket;

public class StudentTicket extends Ticket{
    float off = 0.8f;
    public StudentTicket(Station start, Station destination, int amount){
        super(start, destination, amount);
    }
    @Override
    public float price(){
        int distance = destination.id - start.id;
        if(distance == 100 || distance == -100){
            return 600 * off;
        }else if(distance == 200 || distance == -200){
            return 1500 * off;
        }
        return 0;
    }
    public void print(){
        System.out.println(start.name + " to " + destination.name + "\t" + price()*amount);
    }
}
