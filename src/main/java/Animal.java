public class Animal
{
    private String name;

    public void makeSound()
    {
        System.out.println("Makes a sound.");
    }

    public class Lion extends Animal
    {
     @Override
     public void makeSound()
     {
         System.out.println("ROAR!");
     }
    }

    public class Dog extends Animal
    {
        @Override
        public void makeSound()
        {
            System.out.println("WOOF!");
        }
    }

    public class Bird extends Animal
    {
        @Override
        public void makeSound()
        {
            System.out.println("Chirp!");
        }
    }

}

