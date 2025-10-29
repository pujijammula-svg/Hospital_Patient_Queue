package HospitalManagement.com.hospital;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient>{

    public int compare(Patient p1, Patient p2) {
        return Integer.compare(getPriority(p1.getCondition()), getPriority(p2.getCondition()));
    }

    private int getPriority(String condition) {
        switch (condition.toLowerCase()) {
            case "critical":
                return 1;
            case "serious":
                return 2;
            case "normal":
                return 3;
            default:
                return 4;
        }
    }

}

