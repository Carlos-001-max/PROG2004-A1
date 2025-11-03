/**
 * Base class for all health professionals
 * This class contains common attributes for all health professionals
 */
public class HealthProfessional {
    // Required instance variables: ID (numbers only) and name
    private int id;
    private String name;

    // Another instance variable that is relevant to describe basic information
    private String specialization;

    /**
     * Default constructor
     * Initializes instance variables with default values
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
    }

    /**
     * Constructor that initializes all instance variables
     * @param id the health professional's ID
     * @param name the health professional's name
     * @param specialization the health professional's specialization
     */
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    /**
     * Prints all instance variables
     * Displays ID, name and specialization
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