package student;

public class Student {
    private String firstName;     //ime
    private String surname;  //prezime
    private int year;        //god rodjenja
    
public Student() {
    this.firstName = "Oliver";
    this.surname = "Vukovic";
    this.year = 1979;
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

public void setSurame(String newSurname) {
        this.surname = newSurname;
}        
        
public int getYear() {
        return this.year;
}

public void setYear(int newYear) {
        this.year = newYear;    
}        


public void info() {
    System.out.println("Ime: " + this.getFirstName());
    System.out.println("Prezime: " + this.getSurname());
    System.out.println("Godina rodjenja: " + this.getYear());
    System.out.println("");
}    
    
    
    
    
    
    
}
