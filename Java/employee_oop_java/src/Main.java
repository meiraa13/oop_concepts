import controller.EmployeeController;

import java.math.BigDecimal;

public class Main {
    EmployeeController employeeController;

    public Main(){
        this.employeeController = new EmployeeController();
    }

    public static void main(String[] args) {
        Main main = new Main();

        //3.1
        main.employeeController.addEmployees();
        //3.2
        main.employeeController.removeEmployeeByName("João");
        //3.3
        main.employeeController.readEmployees();
        //3.4
        main.employeeController.increaseSalary(new BigDecimal("0.10"));
        //3.5
        var employeeMap = main.employeeController.groupByJob();
        //3.6
        System.out.println("--------------------3.6--------------------");
        main.employeeController.readEmployeesByGroup(employeeMap);
        //3.8
        System.out.println("--------------------3.8--------------------");
        main.employeeController.readEmployeeByMonth(10,12);
        //3.9
        System.out.println("--------------------3.9--------------------");
        main.employeeController.findOldestEmployee();
        //3.10
        System.out.println("--------------------3.10--------------------");
        main.employeeController.readOrderedEmployee();
        //3.11
        System.out.println("--------------------3.11--------------------");
        main.employeeController.calculateTotalSalary();
        //3.12
        System.out.println("--------------------3.12--------------------");
        main.employeeController.calculateMinimumWage();


    }



}