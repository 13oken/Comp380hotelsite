/**
*Reservation class
*@since 8/10/2024
*@author Thanim Uddin
*The Reservation class handles the function of reserving a room for the guests
*/
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Reservation {
    private int reservationId;
    private static final AtomicInteger uniqueId = new AtomicInteger(0);
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Guest guest;
    private room rooms;

    /**
    *Constructor to create a new Reservation
    *Assigns a unique number id for the room being reserved
    *@param guest    The information of the guest making the reservation
    *@param rooms    The specified room being reserved
    *@param checkIn  The check-in date for the reservation
    *@param checkOut The check-out date for the reservation
    */
    
    public Reservation(Guest guest, room rooms, LocalDate checkIn, LocalDate checkOut) {
        reservationId = uniqueId.incrementAndGet();
        this.guest = guest;
        this.rooms = rooms;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    /**
    *@return the guest's first name
    */
    
    public int getreservationId() {
        return reservationId;
    }

    public LocalDate checkIn() {
        return checkIn;
    }

    public LocalDate checkOut() {
        return checkOut;
    }

    public Guest guest() {
        return guest;
    }

    public room rooms() {
        return rooms;
    }

//possibly add a string method that prints out the reservation details
    
}
