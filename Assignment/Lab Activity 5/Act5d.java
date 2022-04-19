//Understand and create constructor overloading.
class Cons {
    Cons() {
        System.out.println(
                "I'm automatically called immediately when the object is created before the new operation completes its job");
    }

    Cons(String message) {
        System.out.println("Constructor Overloading: " + message);
    }
}

class Act5d {
    public static void main(String args[]) {
        Cons obj = new Cons();
        Cons obj1 = new Cons("Yes, i got it!");
    }
}
