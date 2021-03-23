
package main;

import student.Student;


public class Main {
    
    
    public static void main(String[] args) {
       
       Student ime = new Student();
       
       ime.setFirstName("Oliver");
       ime.setSurname("Vukovic");
       ime.setYear(1979); 
       ime.getCourse().setName("QA kurs");                   // ovaj deo nisam znao
       ime.getCourse().setNumberOfClasses(40);
       ime.getComputer().setProcessTact(2.4);
       ime.getComputer().setMemory(16.0);
       ime.getComputer().setHardDrive(500);

       ime.info(); 
    }
    
}
