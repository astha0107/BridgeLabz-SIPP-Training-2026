import java.util.Scanner;

public class largest_and_secLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        number = Math.abs(number);
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;
        if (number == 0) {
            digits[index] = 0;
            index++;
        } else {
            
            while (number != 0) {
                if (index == maxDigit) {
                    break;   
                }
                digits[index] = number % 10;
                number = number / 10;
                index++;
            }
        }
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.print("\nDigits stored in the array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

    }
}