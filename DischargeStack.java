
public class DischargeStack {
    private Node<DischargeRecord> top;

   
    // push--> add discharge record to top of stack
    public void push(DischargeRecord record){ 
        Node<DischargeRecord> newNode = new Node<>(record);
        newNode.next = top; 
        top = newNode;
        System.out.println("Discharged & Pushed to Stack: " + record.getPatientID());
    }

    
    // pop--> remove and return the top discharge record
    public DischargeRecord pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null; 
        }
        DischargeRecord poppedRecord = top.data;
        top = top.next;
        return poppedRecord; // return the popped record
    }
    
    // peek--> return top discharge record without removing it
    public DischargeRecord peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        System.out.println("Peeked (top record): ID " + top.data.getPatientID());
        return top.data;
    }
    // printStack--> display contents from top to bottom
    public void printStack() {
        if (isEmpty()) {
            System.out.println("--- DISCHARGE STACK (Empty) ---");
            return;
        }
        System.out.println("--- DISCHARGE STACK (LIFO) ---");
        Node<DischargeRecord> traveller = top;
        while (traveller != null) {
            System.out.println(" ID: " + traveller.data.getPatientID() +   " | Time: " + traveller.data.getFormattedTime()); 
            traveller = traveller.next;
        }
        System.out.println("---------------------------------");
    }

    
    public boolean isEmpty(){ 
        return top == null;
    }
}