import java.util.Scanner;
public class Reverse_Integer {
    public static int reverse(int x) {
        long rev=0;
        while(x!=0){
            long digit=x%10;
            rev=(rev*10)+digit;
            x=x/10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }else{
            return (int)rev;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(reverse(x));
    }
}