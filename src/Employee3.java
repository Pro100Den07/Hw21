import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
}

class Company {
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static double calculateAverageSalary(List<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.size();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

public class Employee3 {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new Employee("John", 3000, "Sales");
        Employee employee2 = new Employee("Alice", 4000, "Engineering");

        company.addEmployee(employee1);
        company.addEmployee(employee2);

        double totalSalary = company.calculateTotalSalary();
        System.out.println("Total company salary: " + totalSalary);

        double averageSalary = Company.calculateAverageSalary(company.getEmployees());
        System.out.println("Average company salary: " + averageSalary);
    }
}