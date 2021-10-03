import java.util.Scanner;
public class JavaExample {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");  //input first number		
	int num1 = sc.nextInt();
	System.out.print("Enter the second number : "); //input second number
	int num2 = sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
