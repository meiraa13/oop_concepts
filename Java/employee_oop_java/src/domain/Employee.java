package domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Employee extends Person{
    private BigDecimal salary;
    private String job;
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final NumberFormat numberFormatter = NumberFormat.getInstance(new Locale("pt","BR"));

    public Employee(String name, LocalDate birthDate, BigDecimal salary, String job){
        super(name, birthDate);
        this.salary = salary;
        this.job = job;
    }

    public BigDecimal getSalary(){
        return this.salary;
    }

    public BigDecimal setSalary(BigDecimal salary){
        return this.salary = salary;
    }

    public String getJob(){
        return this.job;
    }

    public String setJob(String job){
        return this.job = job;
    }

    @Override
    public String toString(){
        return "Funcionario [Nome=" + getName() + ", Data de Nascimento=" + getBirthDate().format(dateFormatter) + ", Salario=" + numberFormatter.format(salary) + ", Função=" +  job + "]";

    }
}
