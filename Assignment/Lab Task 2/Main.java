public class Main {
    String name1;
    String name2;

    Main(String a, String b) {
        name1 = a;
        name2 = b;
    }

    public static void main(String args[]) {
        Main language = new Main("Java", "Python");
        System.out.println("\nProgramming Language: " + language.name1 + "\nProgramming Language: " + language.name2);
    }
}