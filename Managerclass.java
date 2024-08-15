// More back end coding for the manager class which will help with the process of the hotel reservation system
// Class manager is made with strings 
//Import the java util
import java.util.List; 

// Class manager

public class Manager {
    private String name;
    private String email;

    public Manager(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // This is the method tfor the generation of the report for the  reservations
    public void generateReservationReport(List<Reservation> reservations) {
        System.out.println("Reservation Report:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    // This is the method for the generation of a report of the cancellations that a customer does 
    public void generateCancellationReport(List<Reservation> reservations) {
        System.out.println("Cancellation Report:");
        for (Reservation reservation : reservations) {
            if (reservation.isCancelled()) {
                System.out.println(reservation);
            }
        }
    }

    // This is the method  to manage reservations
    public void manageReservation(Reservation reservation, boolean approve) {
        if (approve) {
            reservation.setApproved(true);
            System.out.println("Reservation approved: " + reservation);
            
            // Else statement 
        } else {
            reservation.setApproved(false);
            System.out.println("Reservation rejected: " + reservation);
        }
    }

    // Here are some getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
