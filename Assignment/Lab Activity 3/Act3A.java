import java.io.*;

public class Act3A {
    public static void main(String[] args) {
        System.out.println("Variables created: ");
        // varaibles declaration & initialzation
        char char1 = 'x';
        byte numB = 50;
        short numS1 = 1996;
        int numl = 32770;
        long numL = 134353453L;
        float numF1 = 3.142F;
        double numD = 0.000000987;

        // display the value of each variable
        System.out.println("char1= " + char1);
        System.out.println("numB= " + numB);
        System.out.println("numS1= " + numS1);
        System.out.println("numl= " + numl);
        System.out.println("numL= " + numL);
        System.out.println("numF1= " + numF1);
        System.out.println("numD= " + numD);
        System.out.println(" ");
        System.out.println("Types converted");
        short numS2 = numB; // implicit type casting
        short numS3 = (short) numl; // explicit type casting

        // from integer change to floating point
        float numF3 = (float) numl;

        // from floating point turn to be integral type
        int numl2 = (int) numF1;

        // display the output
        System.out.println("short numS2= " + numS2);
        System.out.println("short numS3= " + numS3);
        System.out.println("short numF3= " + numF3);
        System.out.println("int numl2= " + numl2);
    }// end main()
}// end class