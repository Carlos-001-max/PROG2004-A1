/**
 * Appointment class for patient bookings
 */
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional selectedDoctor;

    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "0000000000";
        this.timeSlot = "00:00";
        this.selectedDoctor = null;
    }

    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Print appointment details
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Selected Doctor: " + selectedDoctor.getName());
        System.out.println("Doctor Type: " + selectedDoctor.getClass().getSimpleName());
        System.out.println("----------------------------------------");
    }

    // Getters and setters
    public String getPatientName() { return patientName; }
    public String getPatientMobile() { return patientMobile; }
    public String getTimeSlot() { return timeSlot; }
    public HealthProfessional getSelectedDoctor() { return selectedDoctor; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setPatientMobile(String patientMobile) { this.patientMobile = patientMobile; }
    public void setTimeSlot(String timeSlot) { this.timeSlot = timeSlot; }
    public void setSelectedDoctor(HealthProfessional selectedDoctor) { this.selectedDoctor = selectedDoctor; }
}