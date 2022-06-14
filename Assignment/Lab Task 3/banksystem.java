import java.io.*;

abstract class AccBank {
    int accNumber = 154755;
    int accBalance = 100;

    abstract void accDisplay();

    void accInfo() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Balance: RM" + accBalance);
    }
}

class withdraw extends AccBank {
    int withdrawMoney;

    void accDisplay() {
        new withdraw().accInfo();
        withdrawMoney = accBalance - 10;
        System.out.println("Total balance in your acc is RM" + withdrawMoney);
    }
}

class deposit extends AccBank {
    int depositMoney;

    void accDisplay() {
        new deposit().accInfo();
        depositMoney = accBalance + 100;
        System.out.println("Total balance in your acc is RM" + depositMoney);
    }
}

public class banksystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int optionAction;
        System.out.println("//////////////////////////");
        System.out.println("Welcome to Invictus Bank!");
        System.out.println("//////////////////////////");
        System.out.println("Choose your option (01 - Withdraw from your account) or (02 - Deposit to your account)");
        optionAction = Integer.parseInt(br.readLine());

        if (optionAction == 01) {
            withdraw moneyWithdraw = new withdraw();
            moneyWithdraw.accDisplay();
        } else if (optionAction == 02) {
            deposit moneyDeposit = new deposit();
            moneyDeposit.accDisplay();
        } else {
            System.out.println("Error, Please enter the correct option");
        }
    }
}
