package modulTwo;

import lombok.Data;

@Data
public class Country {
    private String Name;
    private double Area;
    private String Description;
    public Country (String name, double Area, String description)
    {
        this.Name = name;
        this.Area = Area;
        this.Description = description;
    }

    @Override
    public String toString()
    {
        return "Загальна інформація: \n" +
                "Назва: " + this.Name + "\n" +
                "Площа: " + this.Area +" км^2\n" +
                "Опис: " + this.Description ;
    }
}
