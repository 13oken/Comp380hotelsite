/**
*room class
*@since 8/5/2024
*@author Thanim Uddin
*The room class represents a room in the hotel.
*It stores the information for a specific room such as the type, price, maximum number of guests, and availability.
*/
public class room {
    private int id;
    private String type;
    private double price;
    private int maxGuests;
    private boolean availability;

    /**
    *Constructs a new Room with the specified type, price, max number of guests, and availability
    *@param id        The room number for the specified room
    *@param type      The type of the room (Single, Double, Suite)
    *@param price     The price per night for the room
    *@param maxguests The maximum number of guests that the room can have
    *@param available The availability of the room
    */
    
    public room(int id, String type, double price, int maxGuests, boolean availability) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.maxGuests = maxGuests;
        this.availability = availability;
    }

    /**
    *@return the room's id(room number)
    */
    
    public int getID() {
        return id;
    }

    /**
    *@return the room's type
    */
    
    public String getType() {
        return type;
    }

    /**
    *@return the room's price
    */
    
    public double getPrice() {
        return price;
    }

    /**
    *@return the room's max number of guests
    */
    
    public int getGuests() {
        return maxGuests;
    }

    /**
    *@return a true or false for the room's availability
    */
    
    public boolean getAvailability() {
        return availability;
    }
}
