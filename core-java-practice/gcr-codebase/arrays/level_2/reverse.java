import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = Math.abs(number);
        if (temp == 0) {
            System.out.println("Reversed Number: 0");
            sc.close();
            return;
        }
        int count = 0;
        int n = temp;

        while (n != 0) {
            count++;
            n = n / 10;
        }
        int[] digits = new int[count];
        n = temp;
        for (int i = 0; i < count; i++) {
            digits[i] = n % 10;
            n = n / 10;
        }

        int[] reverseArray = new int[count];

        for (int i = 0; i < count; i++) {
            reverseArray[i] = digits[count - 1 - i];
        }
        System.out.print("Digits in reverse order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.print("\nReversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseArray[i]);
        }
    }
}
