import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = sc.nextDouble();
            if (salary[i] < 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again.\n");
                i--;   // Repeat for the same employee
                continue;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nEmployee Details:");
        System.out.println("Emp\tOld Salary\tBonus\t\tNew Salary");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f%n",
                    (i + 1),
                    salary[i],
                    bonus[i],
                    newSalary[i]);
        }
        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        
    }
}
