/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

/**
 *
 * @author rocio
 */
public class FlightRegisterAppMain 
{ 
    
  public static void main(String[] args) 
  {
      Flight newflight = new Flight("#F846", "OSL",
              "AES", 0, 23, 0, 23, 1, 1, 2017, 2, 1, 2017, 4500);
        newflight.getFlightTime();
    }

}
