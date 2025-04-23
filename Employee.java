public class Employee {
    private int id;
    private String name;
    private double salary;
    private long phoneno;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phoneno = 0;    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public long getphoneno() {
        return phoneno
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setphoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee phone number:" + phoneno);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(1, "John Doe", 50000.0 , 1234567890);

        // Displaying employee details
        emp.displayEmployeeDetails();

        // Modifying employee details
        emp.setName("Jane Doe");
        emp.setSalary(55000.0);

        // Displaying updated employee details
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();
    }
}