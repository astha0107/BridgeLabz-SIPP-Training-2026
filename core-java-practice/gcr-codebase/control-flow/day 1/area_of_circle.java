import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double pi=3.14;
        double area= pi* Math.pow(r, 2);
        System.out.println(area);
    }
}
