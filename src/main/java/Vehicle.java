public class Vehicle
{
    public void startEngine()
    {
        System.out.println("Engin starts");
    }

    public class Car extends Vehicle
    {
        @Override
        public void startEngine()
        {
            System.out.println("Car engine started");
        }
    }

    public class Bike extends Vehicle
    {
        @Override
        public void startEngine()
        {
            System.out.println("Bike engin started");
        }
    }
}
