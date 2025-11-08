/**
 * Pediatrician child class
 */
public class Pediatrician extends HealthProfessional {
    private String ageGroupSpecialization;

    public Pediatrician() {
        super();
        this.ageGroupSpecialization = "0-18 years";
    }

    public Pediatrician(int id, String name, String specialization, String ageGroupSpecialization) {
        super(id, name, specialization);
        this.ageGroupSpecialization = ageGroupSpecialization;
    }

    // Print health professional details
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Pediatrician");
        System.out.println("Age Group Specialization: " + ageGroupSpecialization);
        System.out.println("----------------------------------------");
    }

    public String getAgeGroupSpecialization() { return ageGroupSpecialization; }
    public void setAgeGroupSpecialization(String ageGroupSpecialization) {
        this.ageGroupSpecialization = ageGroupSpecialization;
    }
}