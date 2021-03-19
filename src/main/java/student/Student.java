package student;

import course.Course;
import computer.Computer;        


public class Student {
    private String firstName;     //ime
    private String surname;       //prezime
    private int year;             //god rodjenja
    private Course course;
    private Computer computer;
    
public Student() {
    this.firstName = "Oliver";
    this.surname = "Vukovic";
    this.year = 1979;
    this.course = course;
    this.computer = computer;
}    

public Student(String firstName, String surname, int year, Course course, Computer computer) {
    this.firstName = firstName;
    this.surname = surname;
    this.year = year;
    this.course = course;
    this.computer = computer;
}
    

public String getFirstName() {
        return this.firstName;
}

public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
}

public String getSurname() {
        return this.surname;
}

public void setSurname(String newSurname) {
        this.surname = newSurname;
}        
        
public int getYear() {
        return this.year;
}

public void setYear(int newYear) {
        this.year = newYear;    
}        

public Course getCourse() {
        return course;
}

public void setCourse(Course course) {
        this.course = course;
}

public Computer getComputer() {
        return computer;
}

public void setComputer(Computer computer) {
        this.computer = computer;
}


public void info() {
    System.out.println("Ime: " + this.getFirstName());
    System.out.println("Prezime: " + this.getSurname());
    System.out.println("Godina rodjenja: " + this.getYear());
    System.out.println("Naziv kursa: " + this.getCourse());
    System.out.println("Broj casova: " + this.getCourse());
    System.out.println("Procesor: " + this.getComputer() + " GHz");
    System.out.println("Memorija: " + this.getComputer() + " GB");
    System.out.println("Hard disk: " + this.getComputer() + " GB");
}    

   
    
    
    
    
    
}
