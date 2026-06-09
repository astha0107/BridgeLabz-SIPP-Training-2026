import java.util.Scanner;

public class ravi_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        int rank=sc.nextInt();
        int salary=sc.nextInt();
        float membership=sc.nextFloat();
        double bonus=salary*0.12;
        int annual_bonus=(int)bonus;
        System.out.println("******************");
        System.out.println("welcome Card");
        System.out.println("******************");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Rank: "+rank);
        System.out.println("Salary: "+salary);
        System.out.println("Membership id: "+membership);
        System.out.println("Annual Bonus "+annual_bonus);
    }    
}
