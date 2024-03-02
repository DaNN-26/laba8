import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Person pers1 = new Person("Алексей", "Уханов", "25/08/2006");
        Car car1 = new Car("Bugatti Divo", 2023, 7993);
        Book book1 = new Book("Всё о Bugatti", "Лапицкий Д.В.", 2009);
        pers1.display();
        car1.display();
        book1.display();
        pers1.print(book1, car1);
    }
}
class Person
{
    public String name;
    public String surname;
    public String dateBirth;
    Person(String name, String surname, String dateBirth)
    {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
    }
    public void display()
    {
        System.out.printf("Имя: %s\n", name);
        System.out.printf("Фамилия: %s\n", surname);
        System.out.printf("Дата рождения: %s\n", dateBirth);
    }
    public void print(Book book, Car car)
    {
        System.out.printf("%s читает книгу %s про машину %s", this.name, book.title, car.name);
    }
}
class Car
{
    public String name;
    public int year;
    public int engine;
    Car(String name, int year, int engine)
    {
        this.name = name;
        this.year = year;
        this.engine = engine;
    }
    public void display()
    {
        System.out.printf("Марка авто: %s\n", name);
        System.out.printf("Год выпуска: %s\n", year);
        System.out.printf("Объём двигателя: %d см3\n", engine);
    }
}
class Book
{
    public String title;
    public String author;
    public int year;
    Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void display()
    {
        System.out.printf("Название: %s\n", title);
        System.out.printf("Автор: %s\n", author);
        System.out.printf("Год издания: %d\n", year);
    }
}