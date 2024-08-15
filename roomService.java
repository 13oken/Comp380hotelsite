import java.util.List;
import java.util.stream.Collectors;

public class roomService {
    private List<room> rooms;

    public roomService(List<room> rooms) {
        this.rooms = rooms;
    }

    public List<room> filterRooms(String type, double minPrice, double maxPrice, int guests) {
        return rooms.stream()
                .filter(room -> room.getType().equalsIgnoreCase(type))
                .filter(room -> room.getPrice() >= minPrice && room.getPrice() <= maxPrice)
                .filter(room -> room.getGuests() >= guests)
                .filter(room::getAvailability)
                .collect(Collectors.toList());
    }
}
