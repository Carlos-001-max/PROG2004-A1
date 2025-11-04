/**
 * Appointment class to handle patient appointments
 */
public class Appointment {
    // Instance variables for patient details: name and mobile phone
    private String patientName;
    private String patientMobile;
    // Instance variable for preferred time slot
    private String timeSlot;
    // The selected doctor (general practitioner or other health professional type)
    private HealthProfessional selectedDoctor;

    /**
     * Default constructor
     */
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "0000000000";
        this.timeSlot = "00:00";
        this.selectedDoctor = null;
    }

    /**
     * Second constructor that initializes all instance variables
     */
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    /**
     * Method that prints all instance variables
     */
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Selected Doctor: " + selectedDoctor.getName());
        System.out.println("Doctor Type: " + selectedDoctor.getClass().getSimpleName());
        System.out.println("----------------------------------------");
    }

    // Getter methods
    public String getPatientName() { return patientName; }
    public String getPatientMobile() { return patientMobile; }
    public String getTimeSlot() { return timeSlot; }
    public HealthProfessional getSelectedDoctor() { return selectedDoctor; }

    // Setter methods
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setPatientMobile(String patientMobile) { this.patientMobile = patientMobile; }
    public void setTimeSlot(String timeSlot) { this.timeSlot = timeSlot; }
    public void setSelectedDoctor(HealthProfessional selectedDoctor) { this.selectedDoctor = selectedDoctor; }
}