import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] employeeData = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Salary must be greater than 0 "
                        + "and years of service cannot be negative.");
                System.out.println("Please enter the details again.");

                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            if (years > 5) {
                bonus[i] = salary * 0.05;
            } else {
                bonus[i] = salary * 0.02;
            }

            newSalary[i] = salary + bonus[i];

          
            totalOldSalary += salary;
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

       
        System.out.println("\n========== Zara Employee Bonus Details ==========");

        System.out.printf("%-12s %-15s %-15s %-15s %-15s%n",
                "Employee", "Old Salary", "Years", "Bonus", "New Salary");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-12d %-15.2f %-15.2f %-15.2f %-15.2f%n",
                    (i + 1),
                    employeeData[i][0],
                    employeeData[i][1],
                    bonus[i],
                    newSalary[i]);
        }

        System.out.println("==================================================");
        System.out.printf("Total Old Salary  : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus       : %.2f%n", totalBonus);
        System.out.printf("Total New Salary  : %.2f%n", totalNewSalary);

        sc.close();
    }
}