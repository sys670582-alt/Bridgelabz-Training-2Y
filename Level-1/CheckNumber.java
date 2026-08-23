import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            if(numbers[i] > 0){
                System.out.println("Number is positive.");
            } else if(numbers[i] < 0){
                System.out.println("Number is negative.");
            } else {
                System.out.println("Number is zero.");
            }
            if(numbers[i]>0 && numbers[i]%2==0){
                System.out.println("Number is even.");
            } else if(numbers[i]>0 && numbers[i]%2!=0){
                System.out.println("Number is odd.");
            }else{
                System.out.println("Number is neither even nor odd.");
            }
        }
            if(numbers[0]== numbers[4]){
                System.out.println("First and last numbers are equal.");

            }else if(numbers[0] > numbers[4]){
                System.out.println("First number is greater than last number.");
            }else{
                System.out.println("Last number is greater than first number.");
            }
        
        
    }
    
}
