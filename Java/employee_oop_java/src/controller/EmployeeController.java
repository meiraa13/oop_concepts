package controller;

import domain.Employee;
import service.EmployeeService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final List<Employee> employees = new ArrayList<>();
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

    public Map<String, List<Employee>> groupByJob(){
        return this.employeeService.groupByJob(employees);
    }

    public void readEmployeesByGroup(Map<String, List<Employee>> employeeMap){
        this.employeeService.readEmployeeByGroup(employeeMap);
    }

    public void readEmployeeByMonth(int... months){
        this.employeeService.readEmployeeByMonth(months, employees);
    }
}
