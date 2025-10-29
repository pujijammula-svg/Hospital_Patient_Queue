package HospitalManagement.com.hospital;

public class Patient {
    private String name;
    private int age;
    private String condition; // Critical, Serious, Normal

    public Patient(String name, int age, String condition) {
        this.name = name;
        this.age = age;
        this.condition = condition;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCondition() { return condition; }

    public String toString() {
        return "Patient{name='" + name + "', age=" + age + ", condition='" + condition + "'}";
    }
}

