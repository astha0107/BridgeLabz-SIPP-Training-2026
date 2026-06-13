import java.util.Scanner;

public class frequency_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);
        if (number == 0) {
            int[] frequency = new int[10];
            frequency[0] = 1;

            System.out.println("\nFrequency of digits:");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
                }
            }
            return;
        }
        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int[] digits = new int[count];

        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\nFrequency of digits:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}