import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int exp=sc.nextInt();
        int power=(int) Math.pow(b,exp);
        System.out.println(power);
    }
}
