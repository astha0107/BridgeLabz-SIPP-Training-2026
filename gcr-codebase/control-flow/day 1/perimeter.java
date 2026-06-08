import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
        int perimeter=2*(l+w);
        System.out.println(perimeter);
    }
}
