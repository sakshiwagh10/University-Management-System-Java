package day27_University;

public class Student extends Person{

    private int rollno;
    private double cgpa;

    public Student(int id,String name,int rollno,double cgpa){
        super(id,name);
        this.rollno=rollno;
        this.cgpa=cgpa;
    }

    public int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }

    public double getCgpa(){
        return cgpa;
    }
    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
}
