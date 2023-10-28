package models;

public class Employee extends Person{
    private int entryYear;
    private double salary;

    public Employee(String id, String firstName, String lastName, Gender gender,
                    Country country, int entryYear, double salary) {
        super(id, firstName, lastName, gender, country);
        this.entryYear = entryYear;
        this.salary = salary;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
