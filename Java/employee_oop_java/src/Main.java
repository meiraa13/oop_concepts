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



    }



}