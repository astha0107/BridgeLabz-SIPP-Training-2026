import java.util.Scanner;

public class coffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter coffee type (or type exit): ");
            String coffee = sc.next();
            if (coffee.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter quantity: ");
            int qty = sc.nextInt();
            double bill, gst, total;
            switch (coffee.toLowerCase()) {
                case "espresso":
                    bill = 99 * qty;
                    gst = bill * 0.15;
                    total = bill + gst;
                    System.out.println("Bill Price: " + bill);
                    System.out.println("GST: " + gst);
                    System.out.println("Total Bill: " + total);
                    break;

                case "latte":
                    bill = 199 * qty;
                    gst = bill * 0.15;
                    total = bill + gst;
                    System.out.println("Bill Price: " + bill);
                    System.out.println("GST: " + gst);
                    System.out.println("Total Bill: " + total);
                    break;

                case "americano":
                    bill = 149 * qty;
                    gst = bill * 0.15;
                    total = bill + gst;
                    System.out.println("Bill Price: " + bill);
                    System.out.println("GST: " + gst);
                    System.out.println("Total Bill: " + total);
                    break;

                case "capuccino":
                    bill = 349 * qty;
                    gst = bill * 0.15;
                    total = bill + gst;
                    System.out.println("Bill Price: " + bill);
                    System.out.println("GST: " + gst);
                    System.out.println("Total Bill: " + total);
                    break;

                default:
                    System.out.println("Not Available");
                    break;
            }
        }

        System.out.println("Thank you for visiting!");
        sc.close();
    }
}