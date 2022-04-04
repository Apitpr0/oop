//Name : Muhammad Afiq Muhaimin Bin Mohd Zaini
//Class : DDT3A
public class CalculateBMI {

	public static void main(String[] args) {
		// Declare weight,height as double
		double height = 1.65;
		double weight = 65;
		// Declare BMI as double and formula to calc
		double BMI = weight / (height * height);
		// Output BMI
		System.out.println("The body mass index is " + BMI + " kg/m2");
	}

}