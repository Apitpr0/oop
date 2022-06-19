import java.io.*;

class PackageBooking {
    void display() {
        System.out.println("---------------------------------------------");
        System.out.println("Paradise Resort & Training Centre");
        System.out.println("Kuala Terengganu, Terengganu");
        System.out.println("---------------------------------------------");
        System.out.println("+------+-------------+-----------+");
        System.out.println("| Code |   Package   |   Price   |");
        System.out.println("+------+-------------+-----------+");
        System.out.println("|  001 | Government  | RM150/Pax |");
        System.out.println("|  002 | Corporate   | RM230/Pax |");
        System.out.println("|  003 | VIP         | RM330/Pax |");
        System.out.println("+------+-------------+-----------+");
        System.out.println("--------------------------------------------------");
        System.out.println("\t\tPromotion");
        System.out.println("Booking more than 80 person will get 30% discount");
        System.out.println("--------------------------------------------------");
        System.out.println("-------------------Enter Your Details-------------");
    }
}

abstract class Booking extends PackageBooking {
    abstract void calculateBooking();
}

class Customer extends Booking {
    public static String name, password, ic, code;
    public static int noOfParticipants;
    public static double totalPackagePrice, custPayment, packagePrice, discount;

    Customer(String name, String ic, double packagePrice, int noOfParticipant) {
        this.name = name;
        this.ic = ic;
        this.packagePrice = packagePrice;
        this.noOfParticipants = noOfParticipants;
    }

    protected void calculateBooking() {
        totalPackagePrice = packagePrice * noOfParticipants;
        if (noOfParticipants >= 80) {
            System.out
                    .println("Because you're checking for more then 80 participants, you're eligible for 30% discount");
            discount = totalPackagePrice * (30 / 100);
            System.out.println("Your total price after discount is RM " + (totalPackagePrice - discount));
        } else {
            System.out.println("You're not eligible for 30% discount");
            System.out.println("Your total price is RM " + totalPackagePrice);
        }
    }

    public void display() {
        System.out.println("--------------RECIEPT-----------------");
        System.out.println("Name: " + name);
        System.out.println("IC: " + ic);
        System.out.println("No of participants: " + noOfParticipants);
        System.out.println("Total package price: RM" + totalPackagePrice);
        System.out.println("Customer payment: RM" + custPayment);
        System.out.println("Balance that customer need to pay: RM" + (totalPackagePrice - custPayment));
        System.out.println("--------------THANK YOU-----------------");
    }

    public static void main(String finalassignment[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Customer cus = new Customer(name, ic, packagePrice, noOfParticipants);
        System.out.println("Welcome to Paradise Resort and Training Centre");
        System.out.println("Please enter your password to continue: ");
        password = input.readLine();
        if (password.equals("P@Qwerty$123")) {
            PackageBooking pb = new PackageBooking();
            pb.display();
            System.out.println("Customer Name: ");
            name = input.readLine();
            System.out.println("Customer's IC Number: ");
            ic = input.readLine();
            System.out.println("001 - Government");
            System.out.println("002 - Corporate");
            System.out.println("003 - VIP");
            System.out.println("Please enter your package code:");
            code = input.readLine();
        } else {
            System.out.println("Sorry, you entered the wrong password");
        }
        try {
            if (code.equals("001")) {
                packagePrice = 150;
                System.out.println("Enter pax of participants: ");
                noOfParticipants = Integer.parseInt(input.readLine());
                cus.calculateBooking();
                System.out.println("Payment Amount: RM");
                custPayment = Double.parseDouble(input.readLine());
                cus.display();
            } else if (code.equals("002")) {
                packagePrice = 230;
                System.out.println("Enter pax of participants: ");
                noOfParticipants = Integer.parseInt(input.readLine());
                cus.calculateBooking();
                System.out.println("Payment Amount: RM");
                custPayment = Double.parseDouble(input.readLine());
                cus.display();
            } else if (code.equals("003")) {
                packagePrice = 330;
                System.out.println("Enter pax of participants: ");
                noOfParticipants = Integer.parseInt(input.readLine());
                cus.calculateBooking();
                System.out.println("Payment Amount: RM");
                custPayment = Double.parseDouble(input.readLine());
                cus.display();
            } else {
                System.out.println("Sorry, you have entered the wrong code. Please check again");
            }

        } catch (NumberFormatException wrongcode) {
            System.out.println("You have entered a non numeric format word. Please check again");
        }
    }
}
