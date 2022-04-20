class Numbers {
    public static void main(String args[]) {
        Sum obj1 = new Sum(0, 0);
        Sum obj2 = new Sum(0.0, 0.0);
        obj1.add(5, 7);
        obj2.add(5.0, 7.0);
    }

    public class Sum {
        int a, b;
        double c, d;

        Sum(int a, int b) {

        }

        Sum(double c, double d) {

        }

        public void add(int a, int b) {
            System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        }

        public void add(double c, double d) {
            System.out.println("Sum of " + c + " and " + d + " is " + (c + d));
        }

        public static class Sum {
            int a, b, c, d;

            int sum(int a, int b) {
                return a + b;
            }

            double sum(double c, double d) {
                return c + d;
            }

            void add(int a, int b) {

                System.out.println("The sum is " + (a + b));
            }

            void add(double c, double d) {
                System.out.println("The sum is " + (c + d));
            }
        }
    }
}