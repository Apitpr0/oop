//declare abstract class
public abstract class Multiply {
    abstract void printNum(); // declare abstract method
}

class multiplyOperation extends Multiply {
    public void printNum() {
        int i = 10;
        int ans = i * 2;
        System.out.println("The answer is: " + ans);
    }

    public void printNum(int z) {
        int ans = z * 3;
        System.out.println("The answer is: " + ans);
    }

    public class multiply {
        public static void main(String[] args) {
            multiplyOperation m = new multiplyOperation();
            m.printNum();
            m.printNum(5);
        }
    }
}
