/**
 * Base class for all health professionals
 * Contains common attributes for all health professionals
 */
public class HealthProfessional {
    // Required instance variables: ID and name
    private int id;
    private String name;
    // Another relevant instance variable
    private String specialization;

    /**
     * Default constructor
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
    }

    /**
     * Second constructor that initializes all instance variables
     */
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    /**
     * Method that prints all instance variables
     */
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }

    // Getter methods
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    // Setter methods
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}