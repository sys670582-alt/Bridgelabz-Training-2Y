import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        int i=1;
        while(i<11){
            int result = num1 * i;
            System.out.println(num1 + " * " + i + " = " + result);
            i++;
        }
    }

    

    
}
