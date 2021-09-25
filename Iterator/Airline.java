import java.util.Iterator;

@author Kenny Phan
/** Airline class that contains the contents and methods of Airline */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

    /**
     * Default constructor that sets the attributes of the private variables within Airline. Default flight size is 2.
     * @param title the title of the airline
     */
    public Airline(String title)
    {
        size = 0;
        this.flights = new Flight[2];
        this.title = title;

    }

    /**
     * Adds a flight to the arraylist of flights
     * @param flightNum flight # of the flight
     * @param from where the flight is departing from
     * @param to where the flight is departing to
     * @param duration how long the flight is
     * @param transfers how many transfers
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers)
    {
        
        if(size >= this.flights.length)
        {
            growArray(this.flights);  
       
        }
        Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
        this.flights[size] = newFlight;
        size++;   

    }

    /**
     * Returns the title of the airline
     * @return
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Doubles the flight array if max capacity is reached. A temporary array is created with twice the size of the original
     * array. the original contents of the flight array is transferred to the temporary array. The original flight array's length
     * is replaced with the temporary array's length. The contents of the temp array is transferred to the original array.
     * @param flights An instance of flight[]
     * @return
     */
    public Flight[] growArray(Flight[] flights)
    {
        Flight[] newFlights = new Flight[this.flights.length*2]; // Creates a new flight array with twice the size of the original
        for(int i = 0; i < this.flights.length; i++) // copies original array contents into the new flight array
        {
            newFlights[i] = this.flights[i];
        }
        this.flights = new Flight[newFlights.length];
        for(int i = 0; i < newFlights.length; i++)
        {
            this.flights[i] = newFlights[i];
        }
        return this.flights; // returns flight 
    }

    /**
     * Creates the iterator for flights
     * @return
     */
    public FlightIterator createIterator()
    {
        return new FlightIterator(this.flights);
    }
}
