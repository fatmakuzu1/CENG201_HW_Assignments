# 🏥 Hospital Patient Management System

**CENG 201: Data Structures and Algorithms - Fall Term Project**

This project is a comprehensive Java application designed to simulate the patient admission, treatment, and discharge processes in a hospital environment. It demonstrates the practical application of fundamental data structures (Linked Lists, Queues, Stacks, Hash Maps) and algorithms.

## 🚀 About the Project
The system manages the flow of patients from their initial registration to their treatment based on priority and finally to their discharge. It is designed to handle dynamic data efficiently using custom-implemented data structures.

**Key Features:**
* **Patient Admission:** Manages admitted patients using a **Singly Linked List**.
* **Priority Treatment System:** Implements a **Two-Queue Strategy** to handle "Urgent" and "Normal" patients. Urgent cases are always treated first, maintaining FIFO order within their respective categories.
* **Discharge Management:** Uses a **Stack (LIFO)** to store discharge records, allowing quick access to the most recently processed patients.
* **Sorting Algorithm:** Includes a **Bubble Sort** implementation to sort patients by severity level.
* **System Reporting:** Provides a detailed real-time report of admitted patients, waiting lines, and discharge history.

## 🛠️ Data Structures Implemented
All data structures in this project were manually implemented (Custom Implementation) without using the Java Collections Framework (except HashMap for lookups), as per the assignment requirements.

1.  **Linked List (`PatientList`):** Manages admitted patients. Optimized with a `tail` pointer for O(1) insertion.
2.  **Queue (`TreatmentQueue`):** Manages the waiting lines using a Linked List-based implementation (FIFO).
3.  **Stack (`DischargeStack`):** Manages discharge records using a Linked List-based implementation (LIFO).
4.  **HashMap:** Used for O(1) quick patient lookups by ID.

## 📂 Class Structure
* `Main.java`: The entry point of the application containing the test scenario.
* `HospitalSystem.java`: The central controller class that integrates the List, Queues, and Stack.
* `Patient.java`: Model class representing patient details (ID, Name, Age, Severity).
* `TreatmentRequest.java`: Represents a treatment request with a timestamp and priority flag.
* `DischargeRecord.java`: Represents a discharged patient's record with a timestamp.
* `Node.java`: A generic node class used for the Linked List, Queue, and Stack.

## 💻 How to Run

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/fatmakuzu1/CENG201_HW_Assignments.git](https://github.com/fatmakuzu1/CENG201_HW_Assignments.git)
    ```
2.  **Compile the Project:**
    Navigate to the project directory and compile the Java files:
    ```bash
    javac Main.java
    ```
3.  **Run the Simulation:**
    ```bash
    java Main
    ```

## 📋 Test Scenario
When `Main` is executed, the following simulation occurs:
1.  Patients are registered with different priority levels (Urgent/Normal).
2.  The initial system state is printed.
3.  The `processTreatment()` method is called to treat patients based on priority (Urgent first).
4.  Processed patients are moved to the Discharge Stack.
5.  The final system state is printed to verify the logic.

---
**Author:** Fatma KUZU
