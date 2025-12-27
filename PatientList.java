
public class PatientList {
    Node<Patient> head;
    Node<Patient> tail; 
    

    public void addPatient(Patient patient){
        Node<Patient> newNode = new Node<Patient>(patient); 
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        System.out.println("----ADDED PATIENT----");
        tail.data.printPatientData();
    }

 
    public void removePatient(int id){
        
        if (head == null) {
            System.out.println("List is EMPTY");
            return; 
        }
        if(head.data.getId()== id){ // if list has a single element
            head = head.next;
            if (head == null) {
                tail = null;
            }
            System.out.println("Patient "+id+" was deleted!!");
            return;

        }else{
        boolean result= true;
        Node<Patient> traveller = head;
        while(traveller.next != null){ 
            if (traveller.next.data.getId() == id) { // if condition satisfied, delete and exit the method
                if (traveller.next == tail) {
                    tail = traveller;

                }
                traveller.next = traveller.next.next;
                result = false; // found and deleted
                break;
            }
            traveller = traveller.next;
        }
        if (result) {
            System.out.println("Patient not found!! Check ID");  
        }
       } 

    }
    
    public void findPatient(int id){
        Node<Patient> traveller = head;
        boolean result = true;
        while (traveller.next != null) { 
            
            if (traveller.data.getId() == id) {
                System.out.println("<---  Patient "+traveller.data.getId()+"  --->");
                traveller.data.printPatientData();
                result = false;
            }
            traveller = traveller.next;
        }
        if (result) {
           System.out.println("Patient not found!! Check ID");
        }
        

    }
   
    public void printList(){
        int count = 1;
        Node<Patient> traveller = head;
        System.out.println("<--- PATIENT LIST --->");
        while (traveller != null) {
            System.out.print(count + "- " );
            traveller.data.printPatientData();
            traveller = traveller.next;
            count++;
            
        }

    }
    // sorting
    public void sortPatientsBySeverity() {
        if (head == null || head.next == null) return;
        
        boolean swapped;
        Node<Patient> current;
        Node<Patient> last = null;
        
        do {
            swapped = false;
            current = head;
            while (current.next != last) {
                if (current.data.getSeverity() < current.next.data.getSeverity()) {
                    Patient temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
        System.out.println("Patients sorted by severity (High to Low).");
    }

    
}
