import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int t=sc.nextInt();
        int p=sc.nextInt();
        int si=(p*r*t)/100;
        System.out.println(si);
    }
}
