import java.util.Iterator;

/**
 * @author Kenny Phan
 */

/**
 * Flight class contains methods and contents of what a Flight is. 
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * Initalizes the contents of a flight in the default constructor
     * @param flightNum flight # of the flight
     * @param from where the flight is departing from
     * @param to where the flight is departing to
     * @param duration how long the flight is
     * @param transfers how many transfers
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers)
    {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * Returns from where the flight departed.
     * @return
     */
    public String getFrom()
    {
        return this.from;
        
    }

    /**
     * Returns from where the flight is departing to
     * @return
     */
    public String getTo()
    {
        return this.to;

    }

    /**
     * Gets the duration of the flight
     * @return
     */
    public int getDuration()
    {
        return this.duration;

    }

    /**
     * Gets the # of transfers of a flight
     * @return
     */
    public int getNumTransfers()
    {
        return this.transfers;
    }

    /**
     * Default toString method
     */
    public String toString()
    {
        return "Flightnumber: " + this.flightNum + "\nFrom: " + this.from + "\nTo: " + this.to + "\nDuration: " + this.duration / 60 
                + " hours " + this.duration % 60 + " minutes " + "\n" + this.transfers + " Transfer";
    }
}
