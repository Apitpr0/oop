//Understand and implement method overloading
class Student {
    void show() {
        System.out.println("Hi, Good Afternoon.");
    }

    void show(String name, int age) {
        System.out.println("My Name is " + name);
        System.out.println("My Age is " + age);
    }
}

class Act5a {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.show();
        obj.show("Damia", 24);
    }
}
