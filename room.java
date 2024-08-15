public class room {
    private int id;
    private String type;
    private double price;
    private int maxGuests;
    private boolean availability;

    public room(int id, String type, double price, int maxGuests, boolean availability) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.maxGuests = maxGuests;
        this.availability = availability;
    }

    public int getID() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getGuests() {
        return maxGuests;
    }

    public boolean getAvailability() {
        return availability;
    }
}