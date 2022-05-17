#include <iostream>
using namespace std;
int main()
{
    float PersonalLoanAmount;
    float LoanPeriod;
    float IMP;
    float MP;
    float ConvertedLoanPeriod;
    // User insert Personal Loan Amount
    cout << "Please insert Personal Loan Amount: " << endl;
    cin >> PersonalLoanAmount;
    // User insert Loan Period
    cout << "Please insert Loan Period: " << endl;
    cin >> LoanPeriod;
    // Loan Period is converted to months
    ConvertedLoanPeriod = LoanPeriod * 12;
    // Interest Rate Per Month is calculated
    IMP = (PersonalLoanAmount * LoanPeriod * 0.035) / ConvertedLoanPeriod;
    cout << "Your Interest Monthly repayment is: " << IMP << endl;
    // Monthly Payment is calculated
    MP = (PersonalLoanAmount / ConvertedLoanPeriod) + IMP;
    // Monthly Payment is displayed
    cout << "Your Monthly repayment is: " << MP << endl;
}
