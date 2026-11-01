import java.util.Scanner;

/**
 * Exercise 9 — The Scanner Trap
 *
 * ⚠️ RUN THIS AS-IS FIRST. Do not fix it yet.
 *
 * Enter 16 for the age. Then try to type your name.
 * Watch what happens.
 *
 * Then go fill in exercises/02-scanner.md, and only after
 * that come back and fix this file.
 */
public class ScannerTrap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        System.out.println();
        System.out.println("Age recorded:  " + age);
        System.out.println("Name recorded: [" + name + "]");
        System.out.println();
        System.out.println("Is the name empty? If so, you found the trap.");

        input.close();
    }
}
