/**
 * Child class representing Pediatrician
 * Extends HealthProfessional base class
 */
public class Pediatrician extends HealthProfessional {
    // Additional instance variable to differentiate from General Practitioner
    private String ageGroupSpecialization;

    /**
     * Default constructor
     */
    public Pediatrician() {
        super();
        this.ageGroupSpecialization = "0-18 years";
    }

    /**
     * Second constructor that initializes all instance variables
     */
    public Pediatrician(int id, String name, String specialization, String ageGroupSpecialization) {
        super(id, name, specialization);
        this.ageGroupSpecialization = ageGroupSpecialization;
    }

    /**
     * Prints health professional details including type information
     */
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Pediatrician");
        System.out.println("Age Group Specialization: " + ageGroupSpecialization);
        System.out.println("----------------------------------------");
    }

    // Getter and setter methods
    public String getAgeGroupSpecialization() { return ageGroupSpecialization; }
    public void setAgeGroupSpecialization(String ageGroupSpecialization) {
        this.ageGroupSpecialization = ageGroupSpecialization;
    }
}