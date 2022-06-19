import java.io.*;

public class Area {
    public static void main(String[] args) throws IOException {
        int height, radius;
        double SurfaceArea;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter height of cone : ");
            height = Integer.parseInt(input.readLine());
            System.out.print("Enter radius of cone : ");
            radius = Integer.parseInt(input.readLine());
            SurfaceArea = 3.142 * radius * radius * (height / 3);
            System.out.println("Surface Area Of Cone = " + SurfaceArea);

        } catch (NumberFormatException d) {
            System.out.println("You entered non numeric format for radius/height");
        }
    }

}