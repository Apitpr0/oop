
//Name : Muhammad Afiq Muhaimin Bin Mohd Zaini
//Class : DDT3A
import java.util.Scanner;

public class CalculateBMIScanner {

	public static void main(String[] args) {
		// Declare new Scanner util
		Scanner sc = new Scanner(System.in);
		// Ask user to input weight
		System.out.println("Input weight in kilogram: ");
		// Program Accept Input for weight
		double weight = sc.nextDouble();
		// Ask user to input height
		System.out.println("\nInput height in meters: ");
		// Program Accept Input for height
		double height = sc.nextDouble();
		// Formula to calculate BMI
		double BMI = weight / (height * height);
		// Output BMI
		System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
	}

}