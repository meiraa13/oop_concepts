namespace employee_oop_csharp.models;

public class Person
{
    public string Name { get; set; }
    public DateTime BirthDate { get; set; }
    public Person(string name, DateTime birthDate)
    {
        Name = name;
        BirthDate = birthDate;

    }

    public override string ToString()
    {
        return $"nome: {Name}, data: {BirthDate}";
    }
}
