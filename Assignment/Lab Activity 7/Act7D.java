class Sum {
    int n;

    void add(int num) // add method in super class
    {
        int result = 0;
        this.n = num;
        for (int i = 1; i <= n; i++)
            result = result + i;
        System.out.println("The sum is " + result);
    }
}

class Even extends Sum {
    void add(int num) // add method in subclass
    {
        int result = 0;
        this.n = num;
        for (int i = 2; i <= n; i += 2)
            result = result + i;
        System.out.println("The sum is " + result);
    }
}

class Act7D {
    public static void main(String args[]) {
        Sum obj1 = new Sum();
        Even obj2 = new Even();
        obj1.add(10); // calling the Add method of super class
        obj2.add(10); // calling the Add method of sub class
    }
}
