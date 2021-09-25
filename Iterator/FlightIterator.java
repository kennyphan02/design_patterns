import java.util.Iterator;

/**
 * @author Kenny Phan
 */

/**
 * FlightIterator class that contains contents and methods of FlightIterator. Implements iterator
 */
public class FlightIterator implements Iterator
{
    private Flight[] flights;
    private int position;

    /**
     * Default constructor that takes an instance of Flight[] as a parameter. position is set equal to 0.
     * @param flights type Flight[]
     */
    public FlightIterator(Flight[] flights)
    {
        this.flights = flights;
        position = 0;
    }

    /**
     * Checks to see if the next element (position + 1) is null. If it is null, return false; otherwise, return true.
     */
    public boolean hasNext()
    {
        if(position >= this.flights.length || this.flights[position] == null) 
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Returns flight based on the position and then position is incremented by one afterwards.
     */
    public Flight next()
    {
        Flight flight = this.flights[position];
        position = position + 1;
        return flight;
    }


}