import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];

        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        int[] reverseDigits = new int[count];

        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        System.out.print("Reverse of the number: ");

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}