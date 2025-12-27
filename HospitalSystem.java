
import java.util.HashMap;
public class HospitalSystem {
    PatientList patientList;
    DischargeStack dischargeStack;
    TreatmentQueue normalQueue; 
    TreatmentQueue urgentQueue; 

    HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        this.patientList = new PatientList();
        this.dischargeStack = new DischargeStack();
        this.normalQueue = new TreatmentQueue();
        this.urgentQueue = new TreatmentQueue();
        this.patientMap = new HashMap<>();
    }

    
      // registerPatient--> add patient and enqueue based on priority
    public void registerPatient(int id, String name, int severity, int age, boolean isUrgent) {
        
        Patient patient = new Patient(id, name, severity, age);
        patientList.addPatient(patient);
        patientMap.put(id, patient); // add to map

        TreatmentRequest request = new TreatmentRequest(id, isUrgent);

        // Enqueue based on priority
        if (isUrgent) {
            urgentQueue.enQueue(request);
            System.out.println(">> URGENT patient enqueued: " + name);
        } else {
            normalQueue.enQueue(request);
            System.out.println(">> Normal patient enqueued: " + name);
        }
    }

    // QUEUE---> STACK
    
    public void processTreatment() {
        TreatmentRequest processedRequest = null;
        boolean isUrgentTreated = false;

        if (!urgentQueue.isEmpty()) {
            processedRequest = urgentQueue.deQueue();
            isUrgentTreated = true;
        } 
        else if (!normalQueue.isEmpty()) {
            processedRequest = normalQueue.deQueue();
        } 
        else {
            System.out.println("No patients waiting for treatment.");
            return;
        }

        // After treatment, push a discharge record onto stack
        if (processedRequest != null) {
            DischargeRecord record = new DischargeRecord(processedRequest.getPatientId());
            dischargeStack.push(record); 
            
            String type = isUrgentTreated ? "[URGENT]" : "[NORMAL]";
            System.out.println("TREATED: " + type + " Patient ID: " + processedRequest.getPatientId());
        }
    }
    
    
    // print System
    public void printSystemState() {
        System.out.println("\n========= HOSPITAL SYSTEM REPORT =========");
        patientList.printList();
        
        System.out.println("\n[WAITING QUEUES]");
        System.out.println("--- URGENT ---");
        urgentQueue.printQueue();
        System.out.println("--- NORMAL ---");
        normalQueue.printQueue();
        
        dischargeStack.printStack();
        System.out.println("=========================================\n");
    }
    
    
    // sortPatient_-> delegate to PatientList
    public void sortPatients() {
        patientList.sortPatientsBySeverity();
    }
}