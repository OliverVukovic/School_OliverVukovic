package course;

public class Course {
    
    
    private String name;     //ime kursa
    private int numberOfClasses;  //broj casova
    private String codeName;        //naziv obuke
    
public Course() {
}    

public Course(String name, int numberOfClasses, String codeName) {
    this.name = name;                          // naziv kursa
    this.numberOfClasses = numberOfClasses;    // br.casova
    this.codeName = codeName;                  // kodni naziv
}
    

public String getName() {
        return this.name;
}
public void setName(String newName) {
        this.name = newName;
}

public int getNumberOfClasses() {
        return this.numberOfClasses;
}
public void setNumberOfClasses(int newNumberOfClasses) {
        this.numberOfClasses = newNumberOfClasses;
}        
        
public String getCodeName() {
        return this.codeName;
}
public void setYear(String newCodeName) {
        this.codeName = newCodeName;    
}        


public void info() {
    System.out.println("Naziv kursa: " + this.getName());
    System.out.println("Broj casova: " + this.getNumberOfClasses());
    System.out.println("Kodni naziv: " + this.getCodeName());
    System.out.println("");
}    



}
