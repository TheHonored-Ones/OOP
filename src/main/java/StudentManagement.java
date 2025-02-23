public class StudentManagement {
//    !. Create instance variables.
    String name;
    double grade;

//    Class constructor
    public StudentManagement(String name, double grade) {
//        2. Asssign said instance variables value in the constructor using "this"
        this.name = name;
        this.grade = grade;

    }

    public static  void main(String[] args){
//        Creating an array of student objects
        StudentManagement[] students = {
                new StudentManagement("Ona",88.72),
                new StudentManagement("Nale",34.58),
                new StudentManagement("Sihle",82.33)
        };

//        I rememebr using dot to access variables inside objects

        for (StudentManagement student : students){
            System.out.printf("%s got %.2f for the term\n",student.name,student.grade);
        }


    }
}
