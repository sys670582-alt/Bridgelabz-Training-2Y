import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = scanner.nextInt();

            if (age[i] >= 18) {
                System.out.println("Student can vote.");
            } else {
                System.out.println("Student cannot vote.");
            }
        }

        scanner.close();
    }
}