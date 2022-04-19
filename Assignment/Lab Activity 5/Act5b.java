//Understand and Create Method Overloading 
class DisplayOverloading3 {
    public void disp(char c, int num) {
        System.out.println("I'm the first definition of method disp");
        System.out.println("c: " + c);
        System.out.println("num: " + num);
    }

    public void disp(int num, char c) {
        System.out.println("I'm the second definition of method disp");
        System.out.println("c: " + c);
        System.out.println("num: " + num);
    }
}

class Act5b {
    public static void main(String[] args) {
        DisplayOverloading3 obj = new DisplayOverloading3();
        obj.disp('x', 51);
        obj.disp(52, 'y');
    }
}
