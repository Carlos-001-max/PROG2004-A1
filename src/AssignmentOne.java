import java.util.ArrayList;

/**
 * Main class for Health Service Appointment System
 */
public class AssignmentOne {
    // ArrayList to store Appointment objects
    private static final ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // Create three General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Family Medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Johnson", "General Practice", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Brown", "Primary Care", false);

        // Create two Pediatricians
        Pediatrician ped1 = new Pediatrician(201, "Dr. Wilson", "Pediatrics", "0-12 years");
        Pediatrician ped2 = new Pediatrician(202, "Dr. Davis", "Child Health", "0-18 years");

        // Print all health professional details
        gp1.printHealthProfessionalDetails();
        gp2.printHealthProfessionalDetails();
        gp3.printHealthProfessionalDetails();
        ped1.printHealthProfessionalDetails();
        ped2.printHealthProfessionalDetails();

        // Demonstrate ALL constructors and methods
        System.out.println("=== Demonstrating All Constructors and Methods ===");

        // Demonstrate default constructors
        HealthProfessional defaultHP = new HealthProfessional();
        GeneralPractitioner defaultGP = new GeneralPractitioner();
        Pediatrician defaultPed = new Pediatrician();
        Appointment defaultAppt = new Appointment();

        System.out.println("Default HealthProfessional: " + defaultHP.getName());
        System.out.println("Default GP: " + defaultGP.getName());
        System.out.println("Default Pediatrician: " + defaultPed.getName());
        System.out.println("Default Appointment: " + defaultAppt.getPatientName());

        // Demonstrate getter methods
        System.out.println("GP1 ID: " + gp1.getId() + ", Name: " + gp1.getName() + ", Specialization: " + gp1.getSpecialization());
        System.out.println("GP1 can prescribe: " + gp1.isCanPrescribeMedication());
        System.out.println("Ped1 age group: " + ped1.getAgeGroupSpecialization());

        // Demonstrate setter methods
        defaultHP.setId(999);
        defaultHP.setName("Dr. Updated");
        defaultHP.setSpecialization("Updated Specialization");

        defaultGP.setId(888);
        defaultGP.setName("Dr. Updated GP");
        defaultGP.setSpecialization("Updated GP Specialization");
        defaultGP.setCanPrescribeMedication(false);

        defaultPed.setId(777);
        defaultPed.setName("Dr. Updated Pediatrician");
        defaultPed.setSpecialization("Updated Pediatric Specialization");
        defaultPed.setAgeGroupSpecialization("0-16 years");

        defaultAppt.setPatientName("Updated Patient");
        defaultAppt.setPatientMobile("0411111111");
        defaultAppt.setTimeSlot("17:00");
        defaultAppt.setSelectedDoctor(defaultGP);

        System.out.println("After setting values:");
        System.out.println("Updated HP: " + defaultHP.getName() + ", ID: " + defaultHP.getId());
        System.out.println("Updated GP: " + defaultGP.getName() + ", Can Prescribe: " + defaultGP.isCanPrescribeMedication());
        System.out.println("Updated Pediatrician: " + defaultPed.getName() + ", Age Group: " + defaultPed.getAgeGroupSpecialization());
        System.out.println("Updated Appointment: " + defaultAppt.getPatientName() + ", Time: " + defaultAppt.getTimeSlot());

        System.out.println("---");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        // Create appointments with different doctor types
        createAppointment("John Doe", "0412345678", "09:00", gp1);
        createAppointment("Jane Smith", "0498765432", "10:30", gp2);
        createAppointment("Mike Johnson", "0432156789", "14:00", ped1);
        createAppointment("Sarah Wilson", "0444555666", "15:30", ped2);

        // Demonstrate error cases
        createAppointment("", "0412345678", "09:00", gp1);
        createAppointment("Test Patient", "0412345678", "", gp1);
        createAppointment("Test Patient", "0412345678", "09:00", null);

        // Print all appointments
        printExistingAppointments();

        // Demonstrate appointment getters
        System.out.println("=== Testing Appointment Getters ===");
        if (!appointments.isEmpty()) {
            Appointment firstAppointment = appointments.getFirst();
            System.out.println("First appointment - Patient: " + firstAppointment.getPatientName() +
                    ", Mobile: " + firstAppointment.getPatientMobile() +
                    ", Time: " + firstAppointment.getTimeSlot() +
                    ", Doctor: " + firstAppointment.getSelectedDoctor().getName());
        }

        // Cancel one appointment
        cancelBooking("0498765432");

        // Try to cancel non-existent appointment
        cancelBooking("0000000000");

        // Print updated appointments
        printExistingAppointments();

        System.out.println("---");
    }

    // Create new appointment - uses polymorphism
    public static void createAppointment(String patientName, String patientMobile,
                                         String timeSlot, HealthProfessional doctor) {
        try {
            if (patientName == null || patientName.trim().isEmpty()) {
                throw new HealthServiceException("Patient name cannot be empty");
            }
            if (patientMobile == null || patientMobile.trim().isEmpty()) {
                throw new HealthServiceException("Patient mobile cannot be empty");
            }
            if (timeSlot == null || timeSlot.trim().isEmpty()) {
                throw new HealthServiceException("Time slot cannot be empty");
            }
            if (doctor == null) {
                throw new HealthServiceException("Doctor cannot be null");
            }

            Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
            appointments.add(newAppointment);
            System.out.println("Appointment created for " + patientName + " with " + doctor.getName());

        } catch (HealthServiceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Display all current appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }

        System.out.println("Existing appointments (" + appointments.size() + "):");
        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
        }
    }

    // Cancel appointment using mobile number
    public static void cancelBooking(String patientMobile) {
        boolean found = false;

        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                String patientName = appointments.get(i).getPatientName();
                appointments.remove(i);
                System.out.println("Appointment cancelled for " + patientName);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No appointment found with mobile: " + patientMobile);
        }
    }
}