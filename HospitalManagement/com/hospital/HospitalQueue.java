package HospitalManagement.com.hospital;

import java.util.PriorityQueue;

public class HospitalQueue {
    private PriorityQueue<Patient> queue;

    public HospitalQueue() {
        queue = new PriorityQueue<>(new PatientComparator());
    }

    public void addPatient(Patient patient) {
        queue.offer(patient);
        System.out.println(patient.getName() + " added to queue (" + patient.getCondition() + ")");
    }

    public void servePatient() {
        if (queue.isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }
        Patient next = queue.poll();
        System.out.println("Serving " + next);
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("No patients waiting.");
            return;
        }
        System.out.println("Patients waiting:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
