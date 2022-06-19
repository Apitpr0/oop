import java.io.*;

public class mysejahtera {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String phoneNumber;
        double bodyTemperature;
        for (int i = 1; i <= 5; i++) {
            System.out.println("==========================================================");
            System.out.println("       Laypark's Cust Data Collection : Customer " + i);
            System.out.println("==========================================================");
            System.out.println("Enter your name:");
            name = input.readLine();
            System.out.println("Enter your phone number:");
            phoneNumber = input.readLine();
            try {
                System.out.println("Enter your body temperature:");
                bodyTemperature = Double.parseDouble(input.readLine());
                System.out.println("Welcome to Laypark");
                System.out.println("=========================================================================");
            } catch (NumberFormatException wrongTemp) {
                System.out.println("You have entered your body temperature in the wrong format (Non Numeric)");
                System.out.println("=========================================================================");
            } finally {
                System.out.println("Thank You");
                System.out.println("Have a nice day");
            }

        }
    }
}
