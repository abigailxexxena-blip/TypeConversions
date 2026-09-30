import java.util.Scanner;
public class Bank {
    static int[] deposit;
    static int rate;
    static double[] interest;
    static double[] total;
    static int[] wholeInterest;
    static String[] names;
    public static void calc() {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = key.nextInt();
        key.nextLine();

        names = new String[n];
        deposit = new int[n];
        interest = new double[n];
        total = new double[n];
        wholeInterest = new int[n];

        System.out.print("Enter interest rate: ");
        rate = key.nextInt();
        key.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nCustomer " + (i + 1));

            System.out.print("Name: ");
            names[i] = key.nextLine();

            System.out.print("Enter deposit amount: ");
            deposit[i] = key.nextInt();
            key.nextLine();

            interest[i] = deposit[i] * rate / 100.0;

            total[i] = deposit[i] + interest[i];

            wholeInterest[i] = (int) interest[i];

        }

    }
    public static void report() {
        System.out.println("\n BANK REPORT ");

        for (int i = 0; i < names.length; i++) {

            System.out.println("\nCustomer " + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.println("Deposit: " + deposit[i]);
            System.out.println("Rate: " + rate + "%");
            System.out.println("Interest: " + interest[i]);
            System.out.println("Total: " + total[i]);
            System.out.println("Whole Interest: " + wholeInterest[i]);
            System.out.println("Total: " + total[i]);
        }
    }
}
