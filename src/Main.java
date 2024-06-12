import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ManagementSystem ms = new ManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            boolean isExist = false;

            switch (choice) {
                case 1:
                    System.out.print("Enter student name : ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student mail-address : ");
                    String mail = scanner.nextLine();
                    ms.addStudent(name, mail);
                    break;
                case 2:
                    ms.listStudents();
                    break;
                case 3:
                    System.out.print("For update enter student id : ");
                    int updateid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("New name : ");
                    String newName = scanner.nextLine();
                    System.out.print("New mail-address : ");
                    String newMail = scanner.nextLine();
                    ms.updateStudent(updateid, newName, newMail);
                    break;
                case 4:
                    System.out.print("For delete enter student id : ");
                    int deleteid = scanner.nextInt();
                    ms.deleteStudent(deleteid);
                    break;
                case 5:
                    System.out.println("Thank you for using our system");
                    isExist = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if (isExist) {
                break;
            }
        }
    }
}