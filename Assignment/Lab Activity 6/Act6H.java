//Demonstrates the length() and capacity() methods of the StringBuffer class.
public class Act6H {
    public static void main(String args[]) {
        StringBuffer bf = new StringBuffer("Hello, how are you?");
        System.out.println("Buffer " + bf.toString() + "\nlength = " + bf.length() + "\ncapacity = " + bf.capacity());
        bf.ensureCapacity(75);
        System.out.println("\n\nNew Capacity = " + bf.capacity());
        bf.setLength(10);
        System.out.println("New length = " + bf.length() + "\n Buffer : " + bf.toString());
    }
}
