package student;

import course.Course;                                
import computer.Computer;        


public class Student {
    private String firstName;     //ime
    private String surname;       //prezime
    private int year;             //god rodjenja
    
    private Course course;                        // ovaj deo nisam znao
    private Computer computer;
    

    
public Student() {                                    
    this.course = new Course();                  // ovaj deo nisam znao
    this.computer = new Computer();
}    

public Student(String firstName, String surname, int year) {
    this.firstName = firstName;
    this.surname = surname;
    this.year = year;
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
        return this.course;
}

public Computer getComputer() {
        return this.computer;
}



public void info() {
    System.out.println("Ime: " + this.getFirstName());
    System.out.println("Prezime: " + this.getSurname());
    System.out.println("Godina rodjenja: " + this.getYear());
    System.out.println("Naziv kursa: " + this.course.getName());             // ovaj deo nisam znao
    System.out.println("Broj casova: " + this.course.getNumberOfClasses());
    System.out.println("Procesor: " + this.computer.getProcessTact());
    System.out.println("Memorija: " + this.computer.getMemory());
    System.out.println("Hard disk: " + this.computer.getHardDrive());
       
}     
    
    
}
