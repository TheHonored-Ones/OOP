public class Hero
{
    public void attack()
    {
        System.out.println("A hero's attack.");
    }

    public class Superman extends Hero
    {
        @Override
        public void attack()
        {
            System.out.println("Superman uses a Laser beam from his eyes");
        }
    }

    public class Batman extends Hero
    {
        @Override
        public void attack()
        {
            System.out.println("Batman uses batarangs to one his human villains, lol ");
        }
    }
}
