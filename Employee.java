public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // create an array of Employee objects
        Employee[] employees = new Employee[3];

        // add employee details to the array
        employees[0] = new Employee(1, "sanjana", 5000.0);
        employees[1] = new Employee(2, "anjana", 6000.0);
        employees[2] = new Employee(3, "njana", 7000.0);

        // display employee details from the array
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println();
        }
    }
}