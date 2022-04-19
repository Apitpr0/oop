class Person {
    String name;
    int age;
    float salary;

    Person(String p_Name, int p_Age, float p_Salary) {
        name = p_Name;
        age = p_Age;
        salary = p_Salary;
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[]) {
        Person p1 = new Person("Afiq", 20, 3500.50F);
        p1.displayData();
    }
}
