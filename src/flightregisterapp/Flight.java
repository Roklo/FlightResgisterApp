package flightregisterapp;

/**
 * The flight class represents a flight in a flight reservation system. It holds
 * the details about the flight such as flightID, destinationAirport,
 * departureAirport, departureTime, departureDate, arrivalTime and arrivalDate
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 2.0 (07.03.2017)
 */
public class Flight
{

    private final String flightID;
    private final String destinationAirport;
    private final String departureAirport;

    private int departureHour;
    private int departureMinute;
    private int arrivalMinute;
    private int arrivalHour;

    private int departureDay;
    private int departureMonth;
    private int departureYear;
    private int arrivalDay;
    private int arrivalMonth;
    private int arrivalYear;

    private int price;

    public Flight(String flightID, String destinationAirport,
            String departureAirport, int departureHour, int departureMinute,
            int arrivalHour, int arrivalMinute, int departureDay,
            int departureMonth, int departureYear, int arrivalDay,
            int arrivalMonth, int arrivalYear, int price)

    {
        this.flightID = flightID;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureHour = departureHour;
        this.departureMinute = departureMinute;
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = arrivalMinute;
        this.departureDay = departureDay;
        this.departureMonth = departureMonth;
        this.departureYear = departureYear;
        this.arrivalDay = arrivalDay;
        this.arrivalMonth = arrivalMonth;
        this.arrivalYear = arrivalYear;
        this.price = price;

    }

    public String getFlightID()
    {
        return flightID;
    }

    public String getDestinationAirport()
    {
        return destinationAirport;
    }

    public String getDepartureAirport()
    {
        return departureAirport;
    }

    public int getDepartureHour()
    {
        return departureHour;
    }

    public void setDepartureHour(int departureHour)
    {
        this.departureHour = departureHour;
    }

    public int getDepartureMinute()
    {
        return departureMinute;
    }

    public void setDepartureMinute(int departureMinute)
    {
        this.departureMinute = departureMinute;
    }

    public int getArrivalMinute()
    {
        return arrivalMinute;
    }

    public void setArrivalMinute(int arrivalMinute)
    {
        this.arrivalMinute = arrivalMinute;
    }

    public int getArrivalHour()
    {
        return arrivalHour;
    }

    public void setArrivalHour(int arrivalHour)
    {
        this.arrivalHour = arrivalHour;
    }

    public int getDepartureDay()
    {
        return departureDay;
    }

    public void setDepartureDay(int departureDay)
    {
        this.departureDay = departureDay;
    }

    public int getDepartureMonth()
    {
        return departureMonth;
    }

    public void setDepartureMonth(int departureMonth)
    {
        this.departureMonth = departureMonth;
    }

    public int getDepartureYear()
    {
        return departureYear;
    }

    public void setDepartureYear(int departureYear)
    {
        this.departureYear = departureYear;
    }

    public int getArrivalDay()
    {
        return arrivalDay;
    }

    public void setArrivalDay(int arrivalDay)
    {
        this.arrivalDay = arrivalDay;
    }

    public int getArrivalMonth()
    {
        return arrivalMonth;
    }

    public void setArrivalMonth(int arrivalMonth)
    {
        this.arrivalMonth = arrivalMonth;
    }

    public int getArrivalYear()
    {
        return arrivalYear;
    }

    public void setArrivalYear(int arrivalYear)
    {
        this.arrivalYear = arrivalYear;
    }

    public void getFlightTime()
    {
        String deltaMinuteString = null;
        String deltaHourString = null;
        int deltaDay = 0;
        

        int deltaMinute = getArrivalMinute() - getDepartureMinute();
        //System.out.println(deltaMinute);
        int deltaHour = getArrivalHour() - getDepartureHour();
        //System.out.println(deltaHour);
        deltaDay = getArrivalDay() - getDepartureDay();  

        //  If minutes result in a number lower than 0. Take one hour from
        // deltaHour to compensate and add 60 minutes to the negative number.
        if (deltaMinute < 0)
        {
            deltaHour = deltaHour - 1;
            deltaMinute = 60 + deltaMinute;
        }
        
        if (deltaHour < 0)
            
        {
            deltaHour = 24 + deltaHour;
        }

        // Create a 0 infront of any number lower than 10 to get a digital 
        // clock form of the number
        // TODO: Remember to always return as String!  
        
        if (deltaMinute < 10)
        {
            deltaMinuteString = "0" + deltaMinute;
        }
        else
        {
            deltaMinuteString = Integer.toString(deltaMinute);
        }

        if (deltaHour < 10)
        {
            deltaHourString = "0" + deltaHour;
        }
        else
        {
            deltaHourString = Integer.toString(deltaHour);
        }

        System.out.println("Flight time: " + deltaDay + " day(s) " + 
                deltaHourString + ":" + deltaMinuteString + " Hours");
    }

    public int getPrice()
    {
        return price;
    }

}
