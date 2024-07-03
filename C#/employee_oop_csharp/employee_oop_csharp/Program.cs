using employee_oop_csharp.models;
using employee_oop_csharp.services;

EmployeeService service = new EmployeeService();

//3.1 - add employees
List<Employee> employees =
[
    new Employee("Maria", new DateTime(2000, 10, 18), 2009.44, "Operador"),
    new Employee("João", new DateTime(1990, 5, 12), 2284.38, "Operador"),
    new Employee("Caio", new DateTime(1961, 5, 2), 9836.14, "Coordenador"),
    new Employee("Miguel", new DateTime(1988, 10, 14), 19119.88, "Diretor"),
    new Employee("Alice", new DateTime(1995, 1, 5), 2234.68, "Recepcionista"),
    new Employee("Heitor", new DateTime(1999, 11, 19), 1582.72, "Operador"),
    new Employee("Arthur", new DateTime(1993, 3, 31), 4071.84, "Contador"),
    new Employee("Laura", new DateTime(1994, 7, 8), 3017.45, "Gerente"),
    new Employee("Heloísa", new DateTime(2003, 5, 24), 1606.85, "Eletricista"),
    new Employee("Helena", new DateTime(1996, 9, 2), 2799.93, "Gerente")

];

//3.2 remove employee
service.RemoveEmployee(employees, "João");
//3.3 read employees
service.ReadEmployees(employees);
//3.4 increase salary
service.IncreaseSalary(employees);
//3.5
Dictionary<string, List<Employee>> employeeMap = service.GroupByJob(employees);
//3.6
Console.WriteLine("-------------------------------------------------------");
service.ReadEmployeeByGroup(employeeMap);
//3.7
Console.WriteLine("-------------------------------------------------------");
service.ReadEmployeeByMonth(employees, [10, 12]);
//3.8
Console.WriteLine("-------------------------------------------------------");
service.OldestEmployee(employees);
//3.9
Console.WriteLine("-------------------------------------------------------");
service.EmployeeByAlphabeticalOrder(employees);
//3.10
Console.WriteLine("-------------------------------------------------------");
service.CalculateTotalSalary(employees);
//3.11
Console.WriteLine("-------------------------------------------------------");
service.CalculateMinimumWage(employees);
