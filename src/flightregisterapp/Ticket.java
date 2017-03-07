/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

/**
 *
 *
 */
public class Ticket
{

    private int ticketID;
    private Seat seat;
    private Passenger passenger;
    private Flight flight;
    private String flightID;
    private int price;

    public Ticket(Passenger passenger, Flight flight, Seat seat)
    {
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
        this.ticketID = 0;
        this.flightID = "";
        this.price = 0;
    }
}
