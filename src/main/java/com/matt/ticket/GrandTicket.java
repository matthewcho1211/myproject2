package com.matt.ticket;

public class GrandTicket extends StudentTicket{
    public GrandTicket(Station start, Station destination, int amount){
        super(start, destination, amount);
        off = 0.5f;
    }
}
