import java.util.ArrayList;

/**
 * Main class for the Health Service Appointment System
 */
public class AssignmentOne {
    // ArrayList to store instances of Appointment class
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // Create three objects of General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Family Medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Johnson", "General Practice", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Brown", "Primary Care", false);

        // Create two objects of the other health professional type
        Pediatrician ped1 = new Pediatrician(201, "Dr. Wilson", "Pediatrics", "0-12 years");
        Pediatrician ped2 = new Pediatrician(202, "Dr. Davis", "Child Health", "0-18 years");

        // Print details of all health professionals
        gp1.printHealthProfessionalDetails();
        gp2.printHealthProfessionalDetails();
        gp3.printHealthProfessionalDetails();
        ped1.printHealthProfessionalDetails();
        ped2.printHealthProfessionalDetails();

        System.out.println("---");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        // Make 2 appointments with general practitioners
        createAppointment("John Doe", "0412345678", "09:00", gp1);
        createAppointment("Jane Smith", "0498765432", "10:30", gp2);

        // Make another 2 appointments with the other type of health professional
        createAppointment("Mike Johnson", "0432156789", "14:00", ped1);
        createAppointment("Sarah Wilson", "0444555666", "15:30", ped2);

        // Print existing appointments
        printExistingAppointments();

        // Cancel one of the existing appointments
        cancelBooking("0498765432");

        // Print again existing appointments to demonstrate updated collection
        printExistingAppointments();

        System.out.println("---");
    }

    /**
     * Create a new booking and add it to the ArrayList
     * Can handle appointments with any health professional types due to inheritance
     */
    public static void createAppointment(String patientName, String patientMobile,
                                         String timeSlot, HealthProfessional doctor) {
        // Ensure all required information is supplied
        if (patientName == null || patientName.trim().isEmpty() ||
                patientMobile == null || patientMobile.trim().isEmpty() ||
                timeSlot == null || timeSlot.trim().isEmpty() ||
                doctor == null) {
            System.out.println("Error: All appointment information must be provided.");
            return;
        }

        Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created successfully for " + patientName);
    }

    /**
     * Display existing appointments in the ArrayList
     * If no appointments, print message to indicate this
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }

        System.out.println("Existing appointments:");
        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
        }
    }

    /**
     * Cancel a booking using patient's mobile phone
     * If mobile phone not found, print error message
     */
    public static void cancelBooking(String patientMobile) {
        boolean found = false;

        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled successfully for mobile: " + patientMobile);
                found = true;
                break;
            }
        }


        if (!found) {
            System.out.println("Error: No appointment found with mobile number: " + patientMobile);
        }
    }
}