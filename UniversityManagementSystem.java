import day27_University.Student;
import day27_University.Teacher;
import day27_Service.UniversityServices;
import java.util.Scanner;

public class UniversityManagementSystem {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        UniversityServices service = new UniversityServices();

        while (true){
            System.out.println("\n===== College Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Add Teacher");
            System.out.println("4. Display Teacher");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\n===== Add Student =====");
                    System.out.println("Enter ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String sname = sc.nextLine();
                    System.out.println("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter CGPA: ");
                    double cgpa = sc.nextDouble();
                    sc.nextLine();

                    Student student = new Student(sid,sname,roll,cgpa);
                    service.addStudent(student);
                    break;

                case 2:
                    service.displayStudent();
                    break;

                case 3:
                    System.out.println("\n====== Add Teacher =======");
                    System.out.print("Enter ID: ");
                    int teacherId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String teacherName = sc.nextLine();

                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Teacher teacher = new Teacher(teacherId,teacherName,subject,salary);
                    service.addTeacher(teacher);
                    break;

                case 4:
                    service.displayTeacher();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
