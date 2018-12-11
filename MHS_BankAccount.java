import java.util.ArrayList;


public class MHS_BankAccount{
  public MHS_BankAccount (String inputAccountNumber, double inputBalance){
  accountNumber = inputAccountNumber;
  balance = inputBalance;
  }

  public static int indexOfAccount(String accountNumber) {
    int index;
      for (index = 0; index < accountList.size(); index++) {
        if (accountList.get(index).accountNumber.equals(accountNumber)) {
          break;
        }
      }
    return index;
  }

  public double getBalanceOfAccount (String accountNumber){
    int index = indexOfAccount(accountNumber);
    double balance = -1;

    if (index <accountList.size()){
      balance = accountList.get(index).balance;
    }
    return balance;
  }
}
