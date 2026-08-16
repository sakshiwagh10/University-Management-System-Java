package day27_Service;
import day27_University.Student;
import day27_University.Teacher;
import java.util.ArrayList;
public class UniversityServices {

    ArrayList<Student>students = new ArrayList<>();
    ArrayList<Teacher>teachers = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student Added Successfully.");
    }
    public void displayStudent(){
        if (students.isEmpty()){
            System.out.println("No Students Found.");
            return;
        }
        System.out.println("\n====== STUDENTS ======");

        for (Student student: students){
            System.out.println("-------------------");
            System.out.println("ID: "+student.getId());
            System.out.println("Name: "+student.getName());
            System.out.println("Roll No: "+student.getRollno());
            System.out.println("CGPA: "+student.getCgpa());
        }
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
        System.out.println("Teacher Added Successfully.");
    }
    public void displayTeacher(){
        if (teachers.isEmpty()){
            System.out.println("No Teacher Found.");
            return;
        }
        System.out.println("\n===== TEACHER ======");

        for (Teacher teacher: teachers){
            System.out.println("------------------");
            System.out.println("ID: "+teacher.getId());
            System.out.println("Name: "+teacher.getName());
            System.out.println("Subject: "+teacher.getSubject());
            System.out.println("Salary: "+teacher.getSalary());
        }
    }
}
