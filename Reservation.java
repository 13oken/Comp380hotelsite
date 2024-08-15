import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Reservation {
    private int reservationId;
    private static final AtomicInteger uniqueId = new AtomicInteger(0);
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Guest guest;
    private room rooms;

    public Reservation(Guest guest, room rooms, LocalDate checkIn, LocalDate checkOut) {
        reservationId = uniqueId.incrementAndGet();
        this.guest = guest;
        this.rooms = rooms;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

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
