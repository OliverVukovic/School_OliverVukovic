
package main;

import student.Student;
import course.Course;
import computer.Computer;

public class Main {
    
    

    public static void main(String[] args) {
       
       Student ime = new Student();
       
       ime.setFirstName("Oliver");
       ime.setSurname("Vukovic");
       ime.setYear(1979); 
       
       
       Course naziv = new Course("QA kurs", 40, "QA");
       naziv.info(); 
       
       Computer podaci = new Computer("Windows", 4.0, 16.0, 2000);
       podaci.info();
       
       ime.setCourse(naziv);
       ime.setComputer(podaci);
        
       ime.info(); 
    }
    
}
