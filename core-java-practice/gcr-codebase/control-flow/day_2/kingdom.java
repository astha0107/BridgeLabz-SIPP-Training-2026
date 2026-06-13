import java.util.Scanner;
public class kingdom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double totaltax=0;
        for(int i=1;i<10;i++){
            System.out.println("enter the income of 1st citizen "+i);
            double income=sc.nextDouble();
            double tax;
            String bracket;
            if(income<10000){
                tax=income*0.5;
                bracket="5% of income";
            }else if (income <= 50000) {
                tax = income * 0.15;
                bracket = "15% Tax";
            } else {
                tax = income * 0.30;
                bracket = "30% Tax";
            }

            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
            System.out.println();

            totaltax += tax;
        }
        System.out.println("total tax collected is : "+totaltax);
    }
}
