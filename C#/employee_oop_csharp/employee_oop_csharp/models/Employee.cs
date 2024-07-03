using System.Globalization;

namespace employee_oop_csharp.models;

public class Employee : Person
{
    public double Salary { get; set; }
    public string Job { get; set; }
    public Employee(string name, DateTime date, double salary, string job) : base(name, date)
    {
        Salary = salary;
        Job = job;
    }

    internal string FormatData(DateTime date)
    {
        return date.ToString("dd/MM/yyyy");
    }

    internal string FormatSalary(double salary)
    {
        return salary.ToString("N", new CultureInfo("pt-BR"));
    }

    public override string ToString()
    {
        return $"nome: {Name}, data: {FormatData(BirthDate)}, salario: {FormatSalary(Salary)}, Função: {Job}";
    }
}
