class Person2 {
    String name;
    int age;
    float salary;

    Person2(String fullname, int years, float totsalary) {
        name = fullname;
        age = years;
        salary = totsalary;
    }

    void displayData() {
        System.out.println("My Name is " + name);
        System.out.println("My Age is " + age);
        System.out.println("My Salary is " + salary);
    }

    public static void main(String args[]) {
        Person2 p1 = new Person2("Sharizan", 32, 9876);
        p1.displayData();
    }
}
