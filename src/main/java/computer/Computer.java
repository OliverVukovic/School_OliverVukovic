package computer;

public class Computer {
    
    private String operatingSistem;     // operacioni sistem
    private double processTact;         // procesor GHz
    private double memory;              // memorija GB
    private int hardDrive;              // hard disk GB
    
public Computer() {
}    

public Computer(String operatingSistem, double processTact, double memory, int hardDrive) {
    this.operatingSistem = operatingSistem;          
    this.processTact = processTact;    
    this.memory = memory;
    this.hardDrive = hardDrive;
}
    

public String getOperatingSistem() {
        return this.operatingSistem;
}
public void setOperatingSistem(String newOperatingSistem) {
        this.operatingSistem = newOperatingSistem;
}

public double getProcessTact() {
        return this.processTact;
}
public void setProcessTact(double newProcessTact) {
        this.processTact = newProcessTact;
}        
        
public double getMemory() {
        return this.memory;
}
public void setMemory(double newMemory) {
        this.memory = newMemory;    
}        

public int getHardDrive() {
        return this.hardDrive;
}
public void setHardDrive(int newHardDrive) {
        this.hardDrive = newHardDrive;    
}        


public void info() {
    System.out.println("Operacioni sistem: " + this.getOperatingSistem());
    System.out.println("Procesor: " + this.getProcessTact() + " GHz");
    System.out.println("Memorija: " + this.getMemory() + " GB");
    System.out.println("Hard disk: " + this.getHardDrive() + " GB");
}        
        
    
    
}
