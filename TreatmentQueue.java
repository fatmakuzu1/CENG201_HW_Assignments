public class TreatmentQueue {
    Node<TreatmentRequest> front;
    Node<TreatmentRequest> rear; 
    int size = 0;
    
    // enQueue-->> add a treatment request to the end
    public void enQueue(TreatmentRequest request) {
        Node<TreatmentRequest> newNode = new Node<>(request);
        
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode; 
            rear = newNode;      
        }
        size++;
    }

    public TreatmentRequest deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty; nothing to dequeue.");
            return null;
        }

        TreatmentRequest data = front.data;
        front = front.next;
        size--;
        if (front == null) {
            rear = null;
        }
        
        return data;
    }

    // size
    public int size() {
        return size;
    }
    
    // isEmpty
    public boolean isEmpty() {
        return front == null;
    }

    // printQueue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("   [Queue Empty]");
            return;
        }
        
        int count = 1;
        Node<TreatmentRequest> traveller = front;
        
        while (traveller != null) {
            System.out.println("   " + count + " Patient ID: " + traveller.data.getPatientId() +  " | Entry: " + traveller.data.getFormattedTime() + " | Waiting: " + traveller.data.getWaitingTime());
            traveller = traveller.next;
            count++;
        }
    }
}