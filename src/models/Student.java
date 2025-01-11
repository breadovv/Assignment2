package models;

public class Student extends Person{
    private double gpa;

    public Student() {
        super();
        this.gpa = 0.0;
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public double getGpa() { return gpa; }

    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString(){
        return "Student:" + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        double salary = 0;
        if (gpa > 2.67) { salary = 36660.00; }
        return salary;
    }


}