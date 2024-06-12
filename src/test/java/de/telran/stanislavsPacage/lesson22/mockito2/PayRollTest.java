package de.telran.stanislavsPacage.lesson22.mockito2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class PayRollTest {

    private PayRoll payRoll;
    private EmployeeDB employeeDB;
    private BankService bankService;

    private List<Employee> employees;

    @BeforeEach
    public void  init() {
        System.out.println("Before test");

        employees = new ArrayList<>();

        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

        when(employeeDB.getAllEmployees()).thenReturn(employees);
        payRoll = new PayRoll(employeeDB, bankService);

    }


    @Test
    public void testNoEmployee() {

        assertNumberOfPayments(0);
    }

    @Test
    void monthlyPayment() {
    }

    @Test
    public void testSingleEmployee() {
       employees.add(new Employee("test employee" , "ID1", 1000));
       assertNumberOfPayments(1);
    }

    @Test
    public void testOnlyOneInteractionWithDb() {
        payRoll.monthlyPayment();
        verify(employeeDB, times(1)).getAllEmployees();
    }

    @Test
    public void testEmployeeIsPaid() {
        String employeeId = "ID1";
        int salary = 1000;
        employees.add(new Employee("Test employee",employeeId,salary));
        assertNumberOfPayments(1);

        verify(bankService, times(1)).makePayment(employeeId, salary);
    }

    @Test
    public void testAllEmployeeArePaid() {
        employees.add(new Employee("Test employee","ID1", 1000));
        employees.add(new Employee("Test employee","ID2",1500));

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        assertEquals("ID1", idCaptor.getAllValues().get(0));
        assertEquals("ID2", idCaptor.getAllValues().get(1));
        assertEquals(1000, salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(1500, salaryCaptor.getAllValues().get(1).intValue());
    }

    @Test
    public void testInteractionOrder() {
        String employeeId = "ID1";
        int salary = 1000;
        employees.add(new Employee("Test employee",employeeId,salary));
        assertNumberOfPayments(1);

        InOrder inOrder = inOrder(employeeDB,bankService);
        inOrder.verify(employeeDB).getAllEmployees();
        inOrder.verify(bankService).makePayment(employeeId, salary);
       // inOrder.verify(employeeDB).getAllEmployees();
    }


    private void  assertNumberOfPayments(int expected) {
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }
}