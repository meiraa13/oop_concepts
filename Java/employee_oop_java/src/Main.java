import controller.EmployeeController;

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
        main.employeeController.readEmployees();


    }



}