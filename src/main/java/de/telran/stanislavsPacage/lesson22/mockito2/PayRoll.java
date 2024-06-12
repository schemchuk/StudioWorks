package de.telran.stanislavsPacage.lesson22.mockito2;

import java.util.List;

public class PayRoll {
    private EmployeeDB employeeDB;
    private BankService bankService;

    public PayRoll(EmployeeDB employeeDB, BankService bankService) {
        this.employeeDB = employeeDB;
        this.bankService = bankService;
    }

    public int monthlyPayment() {
        List<Employee> employees = employeeDB.getAllEmployees();

        for (Employee employee : employees) {
           bankService.makePayment(employee.getBankID(), employee.getSalary());
        }
        return employees.size();
    }
}
