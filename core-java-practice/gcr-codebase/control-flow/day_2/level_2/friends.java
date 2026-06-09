import java.util.Scanner;
public class friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amarAge=sc.nextInt();
        int akbarAge=sc.nextInt();
        int anthonyAge=sc.nextInt();
        double amarHeight=sc.nextDouble();
        double akbarHeight=sc.nextDouble();
        double anthonyHeight=sc.nextDouble();
        if (amarAge<akbarAge && amarAge<anthonyAge) {
            System.out.println("Youngest friend: Amar");
        } else if (akbarAge<amarAge && akbarAge<anthonyAge) {
            System.out.println("Youngest friend: Akbar");
        } else {
            System.out.println("Youngest friend: Anthony");
        }
        if (amarHeight>akbarHeight && amarHeight>anthonyHeight) {
            System.out.println("Tallest friend: Amar");
        } else if (akbarHeight>amarHeight && akbarHeight>anthonyHeight) {
            System.out.println("Tallest friend: Akbar");
        } else {
            System.out.println("Tallest friend: Anthony");
        }
    }
}