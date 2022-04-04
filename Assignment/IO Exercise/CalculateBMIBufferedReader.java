
//Name : Muhammad Afiq Muhaimin Bin Mohd Zaini
//Class : DDT3A
//Import All Java I/O Library
import java.io.*;

//Start class
public class CalculateBMIBufferedReader {
	// Start of main body
	public static void main(String[] args)
			// Add IOException for I/O error handling
			throws IOException {
		// Declare BufferReader as new object and InputStreamReader to check input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Ask user to input weight
		System.out.println("Enter Your Weight in Kilogram:");
		// Typecast from Integer to Double and InputStreamReader read input from
		// BufferedReader
		double weight = Double.parseDouble(br.readLine());
		// Ask user to input height
		System.out.println("Enter Your Height in Meters:");
		// Typecast from Integer to Double and InputStreamReader read input from
		// BufferedReader
		double height = Double.parseDouble(br.readLine());
		// Formula to calculate BMI
		double BMI = weight / (height * height);
		// Output BMI
		System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
	}
}
