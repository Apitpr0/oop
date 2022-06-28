import java.util.Scanner;

public class InputValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        if (number > 100 || number < 90) {
            System.out.println("Your number is greater then 100");
        } else {
            System.out.println("Your number is not greater then 100");
        }
    }
}
