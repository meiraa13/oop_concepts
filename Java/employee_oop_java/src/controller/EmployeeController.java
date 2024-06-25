package controller;

import domain.Employee;
import service.EmployeeService;

import java.math.BigDecimal;
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

    public void removeEmployeeByName(String name){
        this.employeeService.removeEmployeeByName(employees, name);
    }

    public void increaseSalary(BigDecimal percentage){
        this.employeeService.increaseSalary(employees, percentage);
    }
}
