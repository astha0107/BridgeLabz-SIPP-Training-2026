import java.util.Scanner;
public class print_N_to_one
 {
    static void printDescending(int n) {
        if (n == 0) {  
            return;
        }
        System.out.print(n + " ");  
        printDescending(n - 1);     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printDescending(n);
    }
}