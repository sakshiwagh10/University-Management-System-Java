package day27_University;

public class Teacher extends Person{

    private String subject;
    private double salary;

    public Teacher(int id,String name,String subject,double salary){
        super(id,name);
        this.subject=subject;
        this.salary=salary;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
