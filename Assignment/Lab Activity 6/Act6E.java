//Demonstrates the String class substring methods
public class Act6E {
    public static void main(String args[]) {
        String s1 = "I do shopping in Sunway Carnival Mall";
        String s2 = s1.substring(2, 10);
        String s3 = s1.substring(17);
        System.out.println("substring from index 2 to 10 is: " + s2);
        System.out.println("substring from index 17 to end is: " + s3);
    }
}
