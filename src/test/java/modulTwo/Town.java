package modulTwo;

public class Town {
    private String Name;
    private int Index;
    private int People;

    public Town(String name, int postIndex, int people)
    {
        this.Name = name;
        this.Index = postIndex;
        this.People = people;
    }

    @Override
    public String toString()
    {
        return "Загальна інформація: \n" +
                "Назва: " + this.Name +
                "\nПоштовий індекс: " + this.Index +
                "\nНаселення: " + this.People;
    }
}
