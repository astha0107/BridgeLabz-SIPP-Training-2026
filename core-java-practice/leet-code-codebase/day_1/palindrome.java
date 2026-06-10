import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        if (x < 0) {
            return false;
        }
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        return rev == x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (isPalindrome(x)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
