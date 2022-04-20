package day39_Recap.cydeoTask;

public class Student extends Person{

    private int studentId;
    private String fieldsOfStudy;

    public Student(String name, int age, char gender, int studentId, String fieldsOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldsOfStudy(fieldsOfStudy);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        studentId = studentId;
    }

    public String getFieldsOfStudy() {
        return fieldsOfStudy;
    }

    public void setFieldsOfStudy(String fieldsOfStudy) {
        this.fieldsOfStudy = fieldsOfStudy;
    }

    public void study(){
        System.out.println(getName()+ " is studying");

    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +

                "studentId=" + studentId +
                ", fieldsOfStudy='" + fieldsOfStudy + '\'' +
                '}';
    }
}
/*
 6. Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()

 */