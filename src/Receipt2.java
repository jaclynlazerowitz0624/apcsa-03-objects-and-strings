/**
 * Exercise 5 (Homework) — Receipt, version 2
 *
 * Rebuild your Session 4 receipt, but this time:
 *   - Every price is stored in a variable
 *   - Every quantity is stored in a variable
 *   - Line totals are CALCULATED (price * quantity)
 *   - The grand total is CALCULATED (sum of line totals)
 *   - Nothing numeric is typed directly into the output string
 *
 * ⚠️ Watch your parentheses. "Total: " + price * qty will
 *    NOT do what you want if you get it wrong.
 *
 * Challenge: add an 8.875% sales tax line, rounded to 2 decimals.
 */
public class Receipt2 {
    public static void main(String[] args) {

        // Your code here

        double notebookPrice = 2.25;
        double pensPrice = 2.25;
        double backpackPrice = 24.99;

        int notebookQuantity = 2;
        int pensQuantity = 1;
        int backpackQuantity = 1;

        double notebookTotal = notebookPrice*notebookQuantity;
        double pensTotal = pensPrice*pensQuantity;
        double backpackTotal = backpackPrice*backpackQuantity;
        double totalTotal = (notebookTotal+pensTotal+backpackTotal);

        double taxRate = 0.08875;
        double tax = Math.round((totalTotal*taxRate) * 100.0)/100.0;
        double taxTotal = totalTotal+tax;
        double roundedTaxTotal = Math.round(taxTotal * 100.0)/100.0;


        System.out.println("===============================\nITEM\t\tQTY\tPRICE\n===============================\nNotebook\t2\t$"+notebookTotal+"\nPens\t\t1\t$"+pensTotal+"\nBackpack\t1\t$"+backpackTotal+"\n===============================\nTOTAL\t\t\t$"+totalTotal+"");
        System.out.println("TAX: " + tax);
        System.out.println("TOTAL + TAX: " + roundedTaxTotal);

    }
}
