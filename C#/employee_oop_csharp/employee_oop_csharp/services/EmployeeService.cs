using employee_oop_csharp.models;

namespace employee_oop_csharp.services;

public class EmployeeService
{
    public void RemoveEmployee(List<Employee> employees, string name)
    {
        var employeeToRemove = employees.Single(e => e.Name == name);
        employees.Remove(employeeToRemove);
    }

    public void ReadEmployees(List<Employee> employees)
    {
        foreach (Employee employee in employees)
        {
            Console.WriteLine(employee);
        }
    }

    public void IncreaseSalary(List<Employee> employees)
    {
        foreach (Employee employee in employees)
        {
            employee.Salary = Math.Round(employee.Salary * 1.1, 2);
        }

    }

    public Dictionary<string, List<Employee>> GroupByJob(List<Employee> employees)
    {
        Dictionary<string, List<Employee>> employeeMap = new();
        foreach (Employee employee in employees)
        {
            string job = employee.Job;
            if (!employeeMap.TryGetValue(job, out List<Employee> list))
            {
                list = new List<Employee>();
                employeeMap[job] = list;
            }
            list.Add(employee);
        }
        return employeeMap;
    }

    public void ReadEmployeeByGroup(Dictionary<string, List<Employee>> employeeMap)
    {
        foreach (KeyValuePair<string, List<Employee>> entry in employeeMap)
        {
            Console.WriteLine($"Função: {entry.Key}");
            foreach (Employee employee in entry.Value)
            {

                Console.WriteLine(employee.Name);
            }
        }
    }

    public void ReadEmployeeByMonth(List<Employee> employees, int[] months)
    {
        IEnumerable<Employee> birthdates = employees.Where(e => months.Contains(e.BirthDate.Month));
        foreach (Employee employee in birthdates)
        {
            Console.WriteLine(employee.Name);
        }

    }

    public void OldestEmployee(List<Employee> employee)
    {
        var oldest = employee.OrderBy(e => e.BirthDate).FirstOrDefault();
        Console.WriteLine(oldest);
    }

    public void EmployeeByAlphabeticalOrder(List<Employee> employees)
    {
        var orderedEmployees = employees.OrderBy(e => e.Name).ToList();
        foreach (Employee employee in orderedEmployees)
        {
            Console.WriteLine(employee.Name);
        }
    }

    public void CalculateTotalSalary(List<Employee> employees)
    {
        var totalSalary = employees.Sum(e => e.Salary);
        Console.WriteLine(totalSalary);
    }

    public void CalculateMinimumWage(List<Employee> employees)
    {
        foreach (Employee employee in employees)
        {
            var minimumWages = Math.Round(employee.Salary / 1212, 2, MidpointRounding.AwayFromZero);
            Console.WriteLine($"{employee.Name} ganha {minimumWages} salários minimos.");
        }
    }
}
