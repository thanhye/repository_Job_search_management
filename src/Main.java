import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Employment> employmentList = new ArrayList<>();
    static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employment");
            System.out.println("2. Add Person");
            System.out.println("3. Display Employments");
            System.out.println("4. Display Persons");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addEmployment(scanner);
                    break;
                case 2:
                    addPerson(scanner);
                    break;
                case 3:
                    displayEmployments();
                    break;
                case 4:
                    displayPersons();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void addEmployment(Scanner scanner) {
        System.out.println("Enter job title:");
        String title = scanner.nextLine();
        System.out.println("Enter company name:");
        String company = scanner.nextLine();
        System.out.println("Enter job location:");
        String location = scanner.nextLine();

        Employment employment = new Employment(title, company, location);
        employmentList.add(employment);
    }

    public static void addPerson(Scanner scanner) {
        System.out.println("Enter person name:");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth (yyyy-mm-dd):");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter gender:");
        String genderInput = scanner.nextLine();
        char gender = genderInput.charAt(0);

        Person person = new Person(name, dateOfBirth, gender);
        personList.add(person);
    }

    public static void displayEmployments() {
        for (Employment employment : employmentList) {
            System.out.println(employment.toString());
        }
    }

    public static void displayPersons() {
        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }
}