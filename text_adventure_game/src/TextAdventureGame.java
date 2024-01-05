import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startGame(scanner);
    }

    public static void startGame(Scanner scanner) {
        System.out.println("Welcome to the Mysterious Cave Adventure!");
        System.out.println("You find yourself at the entrance of a dark cave. What do you do?");
        System.out.println("1. Enter the cave.");
        System.out.println("2. Look for clues around the entrance.");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            enterCave(scanner);
        } else if (choice == 2) {
            System.out.println("You find a map that shows two paths inside the cave.");
            System.out.println("It's risky to enter without more information. What do you do?");
            System.out.println("1. Enter the left path.");
            System.out.println("2. Enter the right path.");

            int pathChoice = getUserChoice(scanner, 2);

            if (pathChoice == 1) {
                System.out.println("You decide to take the left path...");
                // Add your story outcomes and further decisions here
            } else if (pathChoice == 2) {
                System.out.println("You choose the right path...");

            }
        }
    }

    public static void enterCave(Scanner scanner) {
        System.out.println("As you step into the cave, it becomes pitch black.");
        System.out.println("You can hear strange noises echoing. What do you do?");
        System.out.println("1. Light a torch and explore.");
        System.out.println("2. Retreat and reconsider.");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("With the torch, you cautiously move forward...");

        } else if (choice == 2) {
            System.out.println("You decide to step back and rethink your strategy.");
            startGame(scanner);
        }
    }

    public static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= maxChoice) {
                    isValid = true;
                } else {
                    System.out.println("Please enter a valid choice (1-" + maxChoice + ").");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }
        return choice;
    }
}
