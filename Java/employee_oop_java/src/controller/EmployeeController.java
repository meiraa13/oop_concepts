package controller;

import domain.Employee;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    private final List<Employee> employees = new ArrayList<Employee>();
    private final EmployeeService employeeService;

    public EmployeeController() {
        this.employeeService = new EmployeeService();
    }

    public void addEmployees(){
        this.employeeService.addEmployees(employees);
    }

    public void readEmployees(){
        this.employeeService.readEmployees(employees);
    }
}
