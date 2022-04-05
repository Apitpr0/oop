class Activity2 {
    public static void main(String args[]) {
        int yr = Integer.parseInt("2022");
        if (leap(yr)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    static boolean leap(int yr) {
        if (yr % 400 == 0) {
            return true;
        }
        if (yr % 100 == 0) {
            return false;
        }
        if (yr % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
