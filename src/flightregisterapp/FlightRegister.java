/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

import java.util.HashMap;

/**
 *
 * @author Håkon
 */
public class FlightRegister
{
    private HashMap<String, Flight> flights;
    
    public FlightRegister()
    {
        this.flights = new HashMap<>();
    }
    
    public void addFlight(String flightID, Flight flight)
    {
        this.flights.put(flightID, flight);
    }

}
