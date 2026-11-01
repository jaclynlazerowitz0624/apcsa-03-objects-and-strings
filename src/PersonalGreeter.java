import java.util.Scanner;

/**
 * Exercise 6 — PersonalGreeter
 *
 * Ask the user for their name, age, and favorite subject.
 * Respond with a paragraph that uses all three, plus the year
 * they will turn 100.
 *
 * ⚠️ Remember the trap: if you read an int and THEN a line,
 *    you need a bare input.nextLine() in between.
 */
public class PersonalGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentYear = 2026;

        System.out.println("What's your name?");
        String name = input.nextLine();

        input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("What's your favorite subject?");
        String subject = input.nextLine();

        input.nextLine();

        System.out.println("Name: " + name + "\nAge: " + age + "\nFav subject: " + subject + "\nYear turn 100: " + (currentYear - age + 100));

        input.close();
    }
}
