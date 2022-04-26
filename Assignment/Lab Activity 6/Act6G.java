//Demonstrates StringBuffer constructors.
public class Act6G {
    public static void main(String args[]) {
        StringBuffer bf1, bf2, bf3;
        bf1 = new StringBuffer();
        bf2 = new StringBuffer(10);
        bf3 = new StringBuffer("PoliteknikUngku Omar");
        System.out.println("Buffer 1 : \"" + bf1.toString() + " \"");
        System.out.println("Buffer 1 : \"" + bf2.toString() + " \"");
        System.out.println("Buffer 1 : \"" + bf3.toString() + " \"");
    }
}
