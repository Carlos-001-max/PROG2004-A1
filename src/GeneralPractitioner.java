/**
 * Child class representing General Practitioner
 * Extends HealthProfessional base class
 */
public class GeneralPractitioner extends HealthProfessional {
    // Additional instance variable to differentiate from other health professional types
    private boolean canPrescribeMedication;

    /**
     * Default constructor
     */
    public GeneralPractitioner() {
        super();
        this.canPrescribeMedication = true;
    }

    /**
     * Second constructor that initializes all instance variables
     */
    public GeneralPractitioner(int id, String name, String specialization, boolean canPrescribeMedication) {
        super(id, name, specialization);
        this.canPrescribeMedication = canPrescribeMedication;
    }

    /**
     * Prints health professional details including type information
     */
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Can Prescribe Medication: " + canPrescribeMedication);
        System.out.println("----------------------------------------");
    }

    // Getter and setter methods
    public boolean isCanPrescribeMedication() { return canPrescribeMedication; }
    public void setCanPrescribeMedication(boolean canPrescribeMedication) {
        this.canPrescribeMedication = canPrescribeMedication;
    }
}