//Demonstrates the String class index methods
public class Act6D {
    public static void main(String args[]) {
        String letters = "This is a test";
        int value1, value2, value3, value4;
        value1 = letters.indexOf('s');
        System.out.println("1ST occurrence of \"s\" in a string " + " at index :" + value1);
        value2 = letters.indexOf("is");
        System.out.println("1ST occurrence of \"is\" in a string " + " at index :" + value2);
        value3 = letters.lastIndexOf('s');
        System.out.println("last occurrence of \"s\" in a string " + "is at index:" + value3);
        value4 = letters.lastIndexOf("is");
        System.out.println("last occurrence of \"s\" in a string " + "is at index:" + value4);
    }
}
