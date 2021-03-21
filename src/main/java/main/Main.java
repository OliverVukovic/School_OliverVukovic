
package main;

import student.Student;
import course.Course;
import computer.Computer;

public class Main {

    public static void main(String[] args) {
       
       Student ime = new Student();
       ime.info();
        
       ime.setFirstName("Alexa");
       ime.setSurname("Vukotic");
       ime.setYear(1980); 
       ime.info();
       
       Course naziv = new Course();
       naziv.info(); 
       
       Computer podaci = new Computer();
       podaci.info();
       
        
        
        
    }
    
}
