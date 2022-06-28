public class BMI {
    public static void main(String[] args) {
        double height = 1.65;
        double weight = 65;
        double resultBMI;
        resultBMI = (weight) / (height * height);
        System.out.println("Your BMI is " + resultBMI);
    }
}