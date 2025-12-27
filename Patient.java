// Patient: model holding id, name, severity and age
public class Patient {
    int id;
    String name;
    int severity;
    int age;

    // constructor
    public Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
        
    }
    // print patient information
    public void printPatientData(){
        System.out.println("Patient Name: "+name);
        System.out.println("Patient ID: "+id);
        System.out.println("Patient Age: "+age);
        System.out.println("Patient Severity: "+severity);
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    // validate severity: allowed range 0..10
    public void setSeverity(int severity) {
        if (severity<0 || severity>10) {
            System.out.println("Invalid severity!! Please check severity");
        }else{
            this.severity = severity;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        
        this.age = age;
    }


    
    
}
