//Demonstrate string class constructors
public class Act6A {
    public static void main(String args[]) {
        char charArray[] = { 'b', 'i', 'r', 't', 'h', 'd', 'a', 'y' };
        StringBuffer sb;
        String s1, s2, s3, s4, output;
        s1 = new String("Hello");
        sb = new StringBuffer("Welcome to Java Programming");
        // Use String constructors
        s2 = new String(s1);
        s3 = new String(charArray);
        s4 = new String(sb);
        // append Strings to output
        output = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 + "\ns4 = " + s4 + "\ns4 = " + s4;
        System.out.println(output);
    }
}
