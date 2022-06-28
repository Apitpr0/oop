public class bank_account {
    String depositorname, typeOfAcc;
    float accountNumber, balAmount;

    bank_account(String ba_depositorname, String ba_typeOfAcc, float ba_accountNumber, float ba_balAmount) {
        depositorname = ba_depositorname;
        typeOfAcc = ba_typeOfAcc;
        accountNumber = ba_accountNumber;
        balAmount = ba_balAmount;
    }

    public void displayData() {
        System.out.println("Depositor name is " + depositorname);
        System.out.println("Type of account is " + typeOfAcc);
        System.out.println("Account number is " + accountNumber);
        System.out.println("Balance amount is" + balAmount);
    }

    public static void main(String[] args) {
        bank_account bacc = new bank_account("Ramen", "Savings", 3494818846F, 30000.69F);
        bacc.displayData();
    }
}
