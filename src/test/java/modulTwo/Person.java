package modulTwo;

import lombok.Data;

@Data
public class Person {
    private String Name;
    private String Surname;


    public Person(String name, String surname, String phone)
    {
        this.Name = name;
        this.Surname = surname;

    }

    @Override
    public String toString() {
        return "Ім'я: "+ this.Name + "; Прізвище: "
                + this.Surname;    }
}
