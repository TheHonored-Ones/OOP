public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Tesla", "Cybertruck", 2024);
        Car car3 = new Car("Honda", "Ballade", 2022);

        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
        System.out.println();
        car3.displayInfo();

        Student[] students = {
                new Student("Nkululeko", 99.9),
                new Student("Ona", 0.1), //lol
                new Student("Mark", 78.5)
        };

    }
}
