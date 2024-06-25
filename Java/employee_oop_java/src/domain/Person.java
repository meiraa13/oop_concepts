package domain;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public LocalDate getBirthDate(){
        return this.birthDate;
    }

    public LocalDate setBirthDate(LocalDate birthDate){
        return this.birthDate = birthDate;
    }
}
