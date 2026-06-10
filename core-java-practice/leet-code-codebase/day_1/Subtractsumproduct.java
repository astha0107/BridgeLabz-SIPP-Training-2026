import java.util.Scanner;

public class Subtractsumproduct {
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;

        while(n>0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n=n/10;
        }

        return prod-sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(subtractProductAndSum(n));
        sc.close();
    }
}