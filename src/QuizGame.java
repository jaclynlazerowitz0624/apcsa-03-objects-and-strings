import java.util.Scanner;

/**
 * Exercise 8 — QuizGame
 *
 * Ask the user 3 questions, store their answers, then print
 * a summary of everything they said.
 *
 * NOTE: You cannot score it yet — that needs if statements,
 * which arrive in Unit 3. For now just collect and echo.
 *
 * Make the questions about something you care about.
 */
public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fav color?");
        String color = input.nextLine();

        input.nextLine();

        System.out.println("Fav number (integer)?");
        int number = input.nextInt();

        input.nextLine();

        System.out.println("Fav letter?");
        char letter = input.next().charAt(0);

        input.nextLine();

        System.out.println("Your fav color: " + color);
        System.out.println("Your fav number (integer): " + number);
        System.out.println("Your fav letter: " + letter);

        input.close();
    }
}
