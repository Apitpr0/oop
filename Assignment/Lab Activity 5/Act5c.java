//Understand and create constructor
class Cons {
    Cons() {
        System.out.println(
                "I’m automatically called immediately when the object is created before the new operator completes its job");
    }
}

class Act5c {

    public static void main(String[] args) {
        Cons obj = new Cons();
    }
}
