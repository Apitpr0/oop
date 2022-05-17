class Person {
    String name;
    int age;
}

class Student extends Person {
    int mark1, mark2, mark3;

    void putdata() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Mark1 = " + mark1);
        System.out.println("Mark2 = " + mark2);
        System.out.println("Mark3 = " + mark3);
    }
}

class Marks {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "Sultana";
        obj1.age = 17;
        obj1.mark1 = 67;
        obj1.mark2 = 87;
        obj1.mark3 = 97;
        obj1.putdata();
    }
}