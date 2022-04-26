//Demonstrates the length(), charAt() and getChars() method of the String class.
public class Act6B {
    public static void main(String args[]) {
        String s1;
        char charArray[];
        s1 = new String("Hello there!");
        charArray = new char[5];
        System.out.println("s1 : " + s1);
        System.out.println("Length of s1 : " + s1.length());
        System.out.println("Character at 3rd position : " + s1.charAt(2));
        s1.getChars(0, 5, charArray, 0);
        System.out.print("The character array is : ");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(" " + charArray[i]);
            System.out.println();
        }
    }
}
