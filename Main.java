
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
       
        
    }
    
}
