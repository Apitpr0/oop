class bank_account {
    String name, typeofAcc;
    float balance;
    int accNumber;

    bank_account(String ba_Name, String ba_TypeofAcc, int ba_AccNumber, float ba_Balance) {
        name = ba_Name;
        typeofAcc = ba_TypeofAcc;
        accNumber = ba_AccNumber;
        balance = ba_Balance;
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Type Of Account: " + typeofAcc);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] wuu) {
        bank_account ba1 = new bank_account("Afiq", "Savings", 503587769, 15000.68F);
        ba1.displayData();
    }
}
