import java.util.Scanner;

public class volume_cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double pi=3.14;
        double volume= pi * Math.pow(r,2)*h;
        System.out.println(volume);
    }
}
