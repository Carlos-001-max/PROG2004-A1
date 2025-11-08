/**
 * General Practitioner child class
 */
public class GeneralPractitioner extends HealthProfessional {
    private boolean canPrescribeMedication;

    public GeneralPractitioner() {
        super();
        this.canPrescribeMedication = true;
    }

    public GeneralPractitioner(int id, String name, String specialization, boolean canPrescribeMedication) {
        super(id, name, specialization);
        this.canPrescribeMedication = canPrescribeMedication;
    }

    // Print health professional details
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Can Prescribe Medication: " + canPrescribeMedication);
        System.out.println("----------------------------------------");
    }

    public boolean isCanPrescribeMedication() { return canPrescribeMedication; }
    public void setCanPrescribeMedication(boolean canPrescribeMedication) {
        this.canPrescribeMedication = canPrescribeMedication;
    }
}