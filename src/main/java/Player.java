public class Player
{
    private String name;
    private int age;

    public void introduce()
    {
        System.out.printf("I am %s, %d years old", name, age);
    }


    public class BasketballPlayer extends Player
    {
        private int pointsScored;

        public void introduce()
        {
            System.out.printf("I am %s, %d years old, and I have scored %d points!", name, age, pointsScored);
        }

    }
}
