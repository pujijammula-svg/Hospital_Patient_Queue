import HospitalManagement.com.hospital.*;

public class Main {
    public static void main(String[] args) {
        HospitalQueue hospitalQueue = new HospitalQueue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Hospital Patient Queue ===");
            System.out.println("1. Add Patient");
            System.out.println("2. Serve Next Patient");
            System.out.println("3. View Waiting Queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter condition (Critical/Serious/Normal): ");
                    String condition = sc.nextLine();
                    hospitalQueue.addPatient(new Patient(name, age, condition));
                    break;
                case 2:
                    hospitalQueue.servePatient();
                    break;
                case 3:
                    hospitalQueue.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
