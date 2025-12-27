
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------LINKEDLIST----------------");
        PatientList liste = new PatientList();

        Patient patient1 = new Patient(234, "fatma", 2, 22);
        liste.addPatient(patient1);
        Patient patient2 = new Patient(334, "ayşe", 3, 21);
        liste.addPatient(patient2);
        Patient patient3 = new Patient(434, "aynur", 4, 32);
        liste.addPatient(patient3);
        Patient patient4 = new Patient(534, "hanifi", 5, 42);
        liste.addPatient(patient4);
        Patient patient5 = new Patient(634, "mehmet", 6, 52);
        liste.addPatient(patient5);

    
        liste.printList();
        
        liste.removePatient(1046); // when head is deleted
        liste.removePatient(5627); // when removing an item from the middle
        liste.removePatient(34); // when trying to remove an item not in the list
        liste.findPatient(3972); // find an element and print its information
        liste.findPatient(12); // searching for a non-existent element
        liste.printList();

        System.out.println("--------------QUEUE--------------------");
        
        TreatmentQueue queue = new TreatmentQueue();

        TreatmentRequest request1 = new TreatmentRequest(1111, false);
        queue.enQueue(request1);
        
        try {
            System.out.println("...waiting 2 seconds...");
                Thread.sleep(2000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TreatmentRequest request2 = new TreatmentRequest(1111, false);
        queue.enQueue(request2);
        try {
            System.out.println("...waiting 2 seconds...");
                Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TreatmentRequest request3 = new TreatmentRequest(1111, false);
        queue.enQueue(request3);
        try {
            System.out.println("...waiting 2 seconds...");
                Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TreatmentRequest request4 = new TreatmentRequest(1111, false);
        queue.enQueue(request4);
        try {
            System.out.println("...waiting 2 seconds...");
                Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TreatmentRequest request5 = new TreatmentRequest(1111, false);
        queue.enQueue(request5);
        try {
            System.out.println("...waiting 2 seconds...");
                Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TreatmentRequest request6 = new TreatmentRequest(1111, false);
        queue.enQueue(request6);
        try {
            System.out.println("...waiting 2 seconds...");
                Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TreatmentRequest request7 = new TreatmentRequest(1111, false);
        queue.enQueue(request7);
        try {
            System.out.println("...waiting 2 seconds...");
                Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TreatmentRequest request8 = new TreatmentRequest(1111, false);
        queue.enQueue(request8);
        queue.deQueue();
        queue.printQueue();
        System.out.println("----------STACK--------");

        DischargeStack stack = new DischargeStack();

        DischargeRecord record1 = new DischargeRecord(12);
        stack.push(record1);
        DischargeRecord record2 = new DischargeRecord(12);
        stack.push(record2);
        DischargeRecord record3 = new DischargeRecord(12);
        stack.push(record3);
        DischargeRecord record4 = new DischargeRecord(12);
        stack.push(record4);
        DischargeRecord record5 = new DischargeRecord(12);
        stack.push(record5);

        stack.pop();
        stack.printStack();
        stack.peek();

       System.out.println("\n\n**************** INTEGRATED HOSPITAL SYSTEM TEST ****************");
        
        HospitalSystem myHospitalSystem = new HospitalSystem();

        System.out.println("---  REGISTERING 10 PATIENTS  ---");


        myHospitalSystem.registerPatient(1001, "Acil Ahmet", 9, 70, true);
        myHospitalSystem.registerPatient(1002, "Acil Zeynep", 8, 25, true);
        myHospitalSystem.registerPatient(1003, "Acil Mehmet", 10, 65, true);

    
        myHospitalSystem.registerPatient(2001, "Normal Ali", 3, 30, false);
        myHospitalSystem.registerPatient(2002, "Normal Veli", 2, 40, false);
        myHospitalSystem.registerPatient(2003, "Normal Ayse", 1, 22, false);
        myHospitalSystem.registerPatient(2004, "Normal Fatma", 2, 21, false);
        myHospitalSystem.registerPatient(2005, "Normal Hasan", 4, 50, false);
        myHospitalSystem.registerPatient(2006, "Normal Elif", 1, 28, false);
        myHospitalSystem.registerPatient(2007, "Normal Can", 2, 33, false);

        
        System.out.println("---  ADDING PAST DISCHARGE RECORDS ---");
        DischargeRecord oldpatient = new DischargeRecord(9991);
        myHospitalSystem.dischargeStack.push(oldpatient);
        DischargeRecord oldpatient2 = new DischargeRecord(9992);
        myHospitalSystem.dischargeStack.push(oldpatient2);

        
        System.out.println("\n---  INITIAL SYSTEM STATE ---");
        myHospitalSystem.printSystemState();

    
        System.out.println("---  PROCESSING TREATMENTS (Priority First) ---");
        try {
            
            myHospitalSystem.processTreatment(); 
            Thread.sleep(500);// waiting
            myHospitalSystem.processTreatment(); 
            Thread.sleep(500);
            myHospitalSystem.processTreatment(); 
            Thread.sleep(500);
            myHospitalSystem.processTreatment();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n--- 5. FINAL SYSTEM REPORT ---");
        myHospitalSystem.printSystemState();

        System.out.println("**************** TEST COMPLETED ****************");
    }
        

 } 

        
