import java.util.Scanner;

/**
 * Exercise 10 (Homework) — ProjectPrototype
 *
 * A first, tiny slice of YOUR year-long project.
 *
 * TODO:
 *   1. Ask the user for the 3 most important pieces of data
 *      your project needs (use the types you picked in
 *      Exercise 10 of assignment 01)
 *   2. Print them back in a nicely formatted summary
 *   3. Calculate and display ONE derived value from that data
 *      (a total, an average, a projection — whatever your
 *       project's core calculation is)
 *
 * This is not throwaway work. It goes straight into your M1
 * Proposal, due Session 12.
 *
 * Add a comment at the top saying what your project is.
 */
public class ProjectPrototype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // My project: [Adaptive Optics Project]
        // What it does: [It takes a user's baseline prescription and the distance of an object to determine how much vision correction is needed, intended for but not limited to ortho-k patients]
        // Calculation : Correction = Baseline prescription - (1/distance)


        System.out.println("Baseline prescription:");
        double prescription = input.nextDouble();

        System.out.println("Distance: (meters)");
        double meters = input.nextDouble();

        input.nextLine();

        System.out.println("Ortho-k patient? (True or False)");
        boolean orthoK = input.nextBoolean();

        input.nextLine();

        double correction = (prescription - (1/meters));

        System.out.println("Prescription: " + prescription);
        System.out.println("Distance: " + meters);
        System.out.println(orthoK + ", an ortho-k patient");
        System.out.println("Correction needed: " + correction);



        input.close();
    }
}
