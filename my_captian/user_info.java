package my_captian;

import java.util.Scanner;

public class user_info{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking age with validation
        int age;

        while (true) {
            System.out.print("Enter your age: ");

            if (sc.hasNextInt()) {
                age = sc.nextInt();

                if (age >= 0) {
                    break;
                } else {
                    System.out.println("Age cannot be negative. Please enter again.");
                }

            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // Clear invalid input
            }
        }

        // Clear the newline
        sc.nextLine();

        // Taking profession
        System.out.print("Enter your profession: ");
        String profession = sc.nextLine();

        // Displaying formatted summary
        System.out.println("\n========== User Information ==========");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Profession : " + profession);

        // Conditional messages based on age
        if (age >= 13 && age <= 19) {
            System.out.println("Message    : You're a teenager.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Message    : You're an adult.");
        } else if (age >= 60) {
            System.out.println("Message    : You're a senior citizen.");
        } else {
            System.out.println("Message    : You're a child.");
        }

        System.out.println("======================================");

        sc.close();
    }
}

