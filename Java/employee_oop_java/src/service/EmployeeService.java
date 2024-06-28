package service;

import domain.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class EmployeeService {

    public void addEmployees(List<Employee> employees){

        employees.add(new Employee("Maria", LocalDate.of(2000, Month.OCTOBER,18),new BigDecimal("2009.44"),"Operador"));
        employees.add(new Employee("João", LocalDate.of(1990, Month.MAY,12),new BigDecimal("2284.38"),"Operador"));
        employees.add(new Employee("Caio", LocalDate.of(1961, Month.MAY,2),new BigDecimal("9836.14"),"Coordenador"));
        employees.add(new Employee("Miguel", LocalDate.of(1988, Month.OCTOBER,14),new BigDecimal("19119.88"),"Diretor"));
        employees.add(new Employee("Alice", LocalDate.of(1995, Month.JANUARY,5),new BigDecimal("2234.68"),"Recepcionista"));
        employees.add(new Employee("Heitor", LocalDate.of(1999, Month.NOVEMBER,19),new BigDecimal("1582.72"),"Operador"));
        employees.add(new Employee("Arthur", LocalDate.of(1993, Month.MARCH,31),new BigDecimal("4071.84"),"Contador"));
        employees.add(new Employee("Laura", LocalDate.of(1994, Month.JULY,8),new BigDecimal("3017.45"),"Gerente"));
        employees.add(new Employee("Heloísa", LocalDate.of(2003, Month.MAY,24),new BigDecimal("1606.85"),"Eletricista"));
        employees.add(new Employee("Helena", LocalDate.of(1996, Month.SEPTEMBER,2),new BigDecimal("2799.93"),"Gerente"));
    }


    public void readEmployees(List<Employee> employees) {
        for (Employee employee: employees){
            System.out.println(employee);
        }

    }

    public void removeEmployeeByName(List<Employee> employees, String name) {
        employees.removeIf(e -> e.getName().equalsIgnoreCase(name) );
    }

    public void increaseSalary(List<Employee> employees, BigDecimal percentage) {
        for (Employee employee: employees){
            BigDecimal currentSalary = employee.getSalary();
            BigDecimal raise = currentSalary.multiply(percentage);
            BigDecimal newSalary = currentSalary.add(raise);
            employee.setSalary(newSalary);
        }

    }

    public Map<String, List<Employee>> groupByJob(List<Employee> employees) {
        Map<String, List<Employee>> employeesMap = new HashMap<>();

        for(Employee employee: employees){
            String job = employee.getJob();
            List<Employee> list = employeesMap.get(job);
            if(list == null ){
                list = new ArrayList<>();
                employeesMap.put(job, list);
            }
            list.add(employee);
        }
        return employeesMap;
    }

    public void readEmployeeByGroup(Map<String, List<Employee>> employeeMap) {
        for (Map.Entry<String, List<Employee>> entry: employeeMap.entrySet()){
            System.out.println("Função " + entry.getKey());
            for(Employee employee: entry.getValue()){
                System.out.println(employee);
            }
        }
    }

    public void readEmployeeByMonth(int[] months, List<Employee> employees) {
        for(Employee employee: employees){
            int birthMonth = employee.getBirthDate().getMonthValue();
            for (int month: months){
                if (birthMonth == month){
                    System.out.println(employee);
                }
            }
        }
    }

    public void findOldestEmployee(List<Employee> employees) {
        Employee oldest = null;
        LocalDate oldestDate = LocalDate.now();

        for (Employee employee: employees){
            LocalDate birthDate = employee.getBirthDate();
            if (birthDate.isBefore(oldestDate)) {
                oldestDate = birthDate;
                oldest = employee;
            }
        }
        System.out.println(oldest);
    }

    public void readOrderedEmployee(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName));

        for(Employee employee: employees){
            System.out.println(employee);
        }
    }

    public void calculateTotalSalary(List<Employee> employees) {
        BigDecimal totalSalary = new BigDecimal(0);
        for (Employee employee: employees){
            totalSalary = totalSalary.add(employee.getSalary());
        }
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("pt","BR"));
        System.out.println(numberFormat.format(totalSalary));
    }

    public void calculateMinimumWage(List<Employee> employees) {
        BigDecimal minimumWage = new BigDecimal("1212.00");

        for(Employee employee: employees){
            BigDecimal minimumWages = employee.getSalary().divide(minimumWage,2, RoundingMode.UP);
            System.out.println(employee.getName() + ": " + minimumWages + " salários minimos");
        }
    }
}
