/**
*Room Service class
*@since 8/6/2024
*@author Thanim Uddin
*The roomService class takes care of the filtering function for guests wanting a specific room
*/
import java.util.List;
import java.util.stream.Collectors;

public class roomService {
    private List<room> rooms;

    /**
    *Constructor to create a RoomService with a list of rooms
    *@param rooms    The list of rooms available in the hotel
    */
    
    public roomService(List<room> rooms) {
        this.rooms = rooms;
    }

    /**
    *Filters available rooms based on the specified criteria given by the user
    *@param type      The type of the room (Single, Double, Suite)
    *@param minPrice  The minimum price per night for the room
    *@param maxPrice  The maximum price per night for the room
    *@param guests    The maximum number of guests that the room can have
    */
    
    public List<room> filterRooms(String type, double minPrice, double maxPrice, int guests) {
        return rooms.stream()
                .filter(room -> room.getType().equalsIgnoreCase(type))
                .filter(room -> room.getPrice() >= minPrice && room.getPrice() <= maxPrice)
                .filter(room -> room.getGuests() >= guests)
                .filter(room::getAvailability)
                .collect(Collectors.toList());
    }
}
