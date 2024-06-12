package de.telran.stanislavsPacage.lesson22.mockito2;

public class Employee {
    private String name;
    private String bankID;
    private int salary;

    public Employee(String name, String bankID, int salary) {
        this.name = name;
        this.bankID = bankID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getBankID() {
        return bankID;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", bankID='" + bankID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
