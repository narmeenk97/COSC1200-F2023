package ClassPractice.Week7.week7_1;

public class Student {

    //ID, name, and grade
    //attributes are always private
    //methods are public because they are accessors
    private Long id;
    private String name;
    private Double grade;

    //Default constructor
    public Student() {
        this.id = 0L;
        this.name = "";
        this.grade = 0.0;
    }

    public Student(String name, double grade) {
        this.id = 0L;
        this.name = name;
        this.grade = grade;
    }

    //getters and setters
    //you don't give access to the attribute but you make a getter to provide access
    public Long getId(){
        return id;
    }
    //sets the value to what we pass into it doesnt return anything
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade(){
        return this.grade;
    }

    public void setGrade(Double grade){
        if(grade > 0.0 && grade <= 100.0) {
            this.grade = grade;
        }
    }

    //display method
    public void displayStudentDetails() {
            System.out.println("Name: " + this.name);
            System.out.println("ID: " + this.id);
            System.out.println("Grade: " + this.grade);
        }
}

