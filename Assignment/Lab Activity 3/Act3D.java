
//Import package io to use InputStreamReader & BufferedReader class
import java.io.*;

public class Act3D {
    public static void main(String[] args)
            throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        // Declare variable
        String str;
        String num1, num2, num3;
        int number1, number2, number3;

        System.out.println("Enter your name: ");
        str = stdin.readLine(); // Read input that is entered by user

        System.out.println("Enter first number: ");
        num1 = stdin.readLine(); // Read input that is entered by user
        // convert@parsing String (num1) to integer data type
        number1 = Integer.parseInt(num1);

        System.out.println("Enter second number: ");
        num2 = stdin.readLine(); // Read input that is entered by user
        // conver@parsing String (num1) to integer data type
        number2 = Integer.parseInt(num2);

        System.out.println("Enter third number: ");
        num3 = stdin.readLine(); // Read input that is entered by user
        // conver@parsing String (num1) to integer data type
        number3 = Integer.parseInt(num3);

        // calculate number1,number2 & number3
        int total = number1 + number2 * (number3 / number1);

        // Display output
        System.out.println("Details:");
        System.out.println("Name entered: " + str);
        System.out.println("Number entered:" + number1 + "," + number2 + "," + number3);
        System.out.println("The total is: " + total);
    }// end main()
}// end class
