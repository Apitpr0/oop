//Demonstrates the methods equals(), compareTo() of the String class
public class Act6C {
    public static void main(String args[]) {
        String s1, s2, s3;
        s1 = new String("Hello");
        s2 = new String("Good Bye");
        s3 = new String("Happy Birthday");
        System.out.println("s1 = " + s1 + "\ns2 = " + s2 + "s3 = " + s3);

        // Test for equality
        if (s1.equals("Hello")) {
            System.out.println("s1 equals \"Hello\" ");
        } else {
            System.out.println("s1 does not equal \"Hello\" ");
        }

        // Test for equality with == operator
        if (s1 == "Hello") {
            System.out.println("s1 equals \"Hello\" ");
        } else {
            System.out.println("s1 does not equal \"Hello\" ");
        }
        // Test compareTo
        System.out.println("s1 compare to \"Hello\" is " + s2.compareTo("Hello"));
        System.out.println("s2 compare to s3 is " + s2.compareTo(s3));
    }
}
