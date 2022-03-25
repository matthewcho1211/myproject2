package com.matt.ticket;

public class GrandTicket extends StudentTicket{
    public GrandTicket(Station start, Station destination, int amount){
        super(start, destination, amount);
        off = 0.5f;
    }
    @Override
    public void print(){
        System.out.println("grand ticket"+"\t"+start.name + " to " + destination.name + "\t" + amount + "\t" + price()*amount);
    }
}
