//  Back end coding for the manager class 
// Class manager is made with string variables







// 3.2 a-e

// (a) Class name is manager
// (b) 8/14/24 is the date
// (c) Programmer's name is Felix Montes-Flores

// (d)  The class is called manager and it will help with the process of the hotel reservation system

/* (e)  In the public class manager, string varaibles are declared for the name and email so that they will be stored
 in the class. This will require a generate reservation report class so it can print the information out. A report
 class for the cancellations and to manage the reservation itself class will be required to use the information. 
 Getters and setters are used to have control access in the project itself which keeps data safe from inferenence and
 non-use. 

*/







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
