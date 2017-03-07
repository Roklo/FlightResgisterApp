package Border;

import flightregisterapp.Flight;
import flightregisterapp.Passenger;
import flightregisterapp.FlightRegister;
import flightregisterapp.Seat;
import flightregisterapp.Ticket;
import java.util.Scanner;

/**
 * This is just a DUMMY-class representing an Application. To be replaced with a
 * "proper" class.
 *
 * @author asty
 */
public class Application
{

    private FlightRegister flights;

    public Application()
    {
        flights = new FlightRegister();
    }

    public void init()
    {
        System.out.println("init() was called");
    }

    void doCreateFlight()
    {
        System.out.println("---- Create a Flight ----");
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

        Flight newFlight = new Flight(flightID, destinationAirport,
                departureAirport, departureHour, departureMinute,
                arrivalHour, arrivalMinute, departureDay,
                departureMonth, departureYear, arrivalDay,
                arrivalMonth, arrivalYear);
        flights.addFlight(flightID, newFlight);
        flights.listAllFlights();

    }

    void doRegisterPassenger()
    {
        System.out.println("\n---- Register a Passenger ----");
        System.out.println("Please enter the forename:");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();

        System.out.println("Please enter the surname:");
        String lastName = reader.nextLine();

        System.out.println("Please enter the email address:");
        String eMail = reader.nextLine();

        Passenger newPassenger = new Passenger(firstName, lastName, eMail);
        System.out.println(firstName + " " + lastName + " " + eMail);
        //passengers.addPassenger(lastName, newPassenger);
    }

    void doSellTicket()
    {
        System.out.println("\n---- Sell Ticket to Passenger ----");
        System.out.println("Please enter the name of the passenger:");
        Scanner reader = new Scanner(System.in);
        String passenger = reader.nextLine();
        
        System.out.println("Please choose a destination (e.g. OSL):");
        //TODO: List all available destinations
        String destination = reader.nextLine();

        System.out.println("Please choose a flight:");
        flights.listFlightsByDestination(destination);
        String flightID = reader.nextLine();
        String flight = (flights.getFlightByID(flightID).getDepartureAirport()
                + "->" + destination);

        System.out.println("Please choose a seat:");
        flights.getFlightByID(flightID).listAvailableSeats();
        String seat = reader.nextLine();
        //flights.getFlightByID(flightID).setSeatUnavailable();

        System.out.println("Please enter a valid ticket ID (e.g. 1001):");
        int ticketID = reader.nextInt();

        System.out.println("Please enter the ticket price:");
        int price = reader.nextInt();

        Ticket newTicket = new Ticket(passenger, flight,
                seat, flightID, ticketID, price);
        //tickets.addTicket(
        System.out.println("Ticket:\n" + passenger + " " + flight + " "
        + seat + " " + flightID + " " + ticketID + " " + price);
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
