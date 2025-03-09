public class Student
{
    private String name;
    private double grade;

    public Student(String name, double grade)
    {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return String.format("%s %d", this.name, this.grade);
    }
}
