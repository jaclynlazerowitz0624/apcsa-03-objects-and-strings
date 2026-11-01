import java.util.Scanner;

/**
 * Exercise 7 — InteractiveTip
 *
 * Your tip calculator from Session 7, but the user supplies
 * the bill, the tip percentage, and the number of people.
 *
 * Output the tip, the total, and each person's share,
 * all to 2 decimal places.
 */
public class InteractiveTip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bill?");
        double billAmount = input.nextDouble();

        System.out.println("Tip percentage?");
        double tipPercent = input.nextDouble();

        input.nextLine();

        System.out.println("How many people?");
        int people = input.nextInt();

        input.nextLine();


        double tip = billAmount * (tipPercent / 100.0);
        double rTip = Math.round(tip * 100) / 100.0;

        double total = billAmount + rTip;
        double rTotal = Math.round(tip * 100) / 100.0;

        double share = rTotal / people;
        double rShare = Math.round(share * 100) / 100.0;
        double rBillAmountShare = Math.round((billAmount / people)*100)/100;

        double fTotal = rTotal + billAmount;

        System.out.println("Tip: $" + rTip);
        System.out.println("Total: $" + fTotal);
        System.out.println("Each person's tip share: $" + rShare);
        System.out.println("Each person's bill share: $" + rBillAmountShare);
        System.out.println("Each person's total share: $" + (rShare + rBillAmountShare));

        input.close();
    }
}
