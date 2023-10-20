package ClassPractice.Week7.week7_1;

public class StudentDriver {

    public static void main(String[] args) {

        //Instantiating a student object using the default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Details:");
        student1.displayStudentDetails();

        System.out.println(" --- --- --- ");

        //Instantiating a student object using the default constructor
        Student student2 = new Student("Bruce Wayne", 95.5);
        System.out.println("Student 2 Details:");
        student2.displayStudentDetails();

        System.out.println(" --- --- --- ");

        //demonstrate the use of setters and getters
        System.out.println("Student 1 Details:");
        student1.setName("Peter Parker");
        student1.setId(67890L);
        student1.setGrade(99.5);
        student1.displayStudentDetails();

        System.out.println(" --- --- --- ");
    }
}
