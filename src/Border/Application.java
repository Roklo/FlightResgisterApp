package Border;

import flightregisterapp.Flight;
import java.util.Scanner;

/**
 * This is just a DUMMY-class representing an Application. To be replaced with a
 * "proper" class.
 *
 * @author asty
 */
public class Application
{

    public void init()
    {
        System.out.println("init() was called");
    }

    void doCreateFlight()
    {
        System.out.println("---- Create a flight ----");
        System.out.println("Please enter the flight ID (e.g. SK4145):");
        Scanner reader = new Scanner(System.in);
        String flightID = reader.nextLine();

        System.out.println("\nPlease enter the destination airport (e.g. OSL):");
        String destinationAirport = reader.nextLine();

        System.out.println("\nPlease enter the departure airport (e.g. AES):");
        String departureAirport = reader.nextLine();

        System.out.println("\nPlease enter the departure hour (0-23):");
        int departureHour = reader.nextInt();

        System.out.println("\nPlease enter the departure minute (0-59):");
        int departureMinute = reader.nextInt();

        System.out.println("\nPlease enter the arrival hour (0-23):");
        int arrivalHour = reader.nextInt();

        System.out.println("\nPlease enter the arrival minute (0-59):");
        int arrivalMinute = reader.nextInt();

        System.out.println("\nPlease enter the departure day (1-31):");
        int departureDay = reader.nextInt();

        System.out.println("\nPlease enter the departure month (1-12):");
        int departureMonth = reader.nextInt();

        System.out.println("\nPlease enter the departure year:");
        int departureYear = reader.nextInt();
        
        System.out.println("\nPlease enter the arrival day (1-31):");
        int arrivalDay = reader.nextInt();

        System.out.println("\nPlease enter the arrival month (1-12):");
        int arrivalMonth = reader.nextInt();

        System.out.println("\nPlease enter the arrival year:");
        int arrivalYear = reader.nextInt();
        
        System.out.println("\nPlease enter the flight price:");
        int price = reader.nextInt();
        
        
        
        

        Flight newFlight = new Flight(flightID, destinationAirport,
                departureAirport, departureHour, departureMinute,
                arrivalHour, arrivalMinute, departureDay,
                departureMonth, departureYear, arrivalDay,
                arrivalMonth, arrivalYear, price);
        //flights.add(newFlight);
        
    }

    void doRegisterPassenger()
    {
        System.out.println("doRegisterPassenger() was called");
    }

    void doSellTicket()
    {
        System.out.println("doSellTicket() was called");
    }

    void doListSeatsInFlight()
    {
        System.out.println("doListSeatsInFlight() was called");
    }

    void doListPassengersInFlight()
    {
        System.out.println("doListPassengersInFlight() was called");
    }

}
