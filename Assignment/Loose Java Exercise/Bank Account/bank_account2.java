class bank_account2 {
    String name;
    int number;
    String type;
    float balance;

    bank_account2(String depositor_name, int account_no, String type_of_account, float balance_amount_account) {
        name = depositor_name;
        number = account_no;
        type = type_of_account;
        balance = balance_amount_account;
    }

    void DisplayData() {
        System.out.println("Depositor name: " + name);
        System.out.println("Account number: " + number);
        System.out.println("Account type: " + type);
        System.out.println("Balance amount: " + balance);
    }

    public static void main(String args[]) {
        bank_account2 p1 = new bank_account2("Faris", 1234567890, "Savings", 98765);
        p1.DisplayData();
    }
}
