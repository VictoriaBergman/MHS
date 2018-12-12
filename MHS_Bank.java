import java.util.*;
public class MHS_Bank{
  public ArrayList<MHS_BankAccount> accountList = new ArrayList<MHS_BankAccount>();

  public void addAccount(String accountNumber, double balance) {
    MHS_BankAccount newAccount = new MHS_BankAccount(accountNumber, balance);
    accountList.add(newAccount);
  }

  public boolean checkIndexIsLessThanSizeOfList(int index){
    return index < accountList.size();
  }

  public int getIndexOfAccount(String accountNumber) {
    int index;
    for( index = 0; index < accountList.size(); index++ ) {
      if (accountList.get(index).accountNumber.equals(accountNumber)) {
        break;
      }
    }
    // return index of existing accountNumber
    // or if the accountNumber does not exist, return size()
    return index;
  }

  public double getBalanceOfAccount (String accountNumber){
    int index = getIndexOfAccount(accountNumber);
    double balance = -1;

    if (index < accountList.size()){ // refactor this
      balance = accountList.get(index).balance;
    }
    return balance;
  }

  public boolean tryPayment(String accountNumber, double totalSum) {
    boolean paymentIsValid = false;
    int index = getIndexOfAccount(accountNumber);
    if (index < accountList.size()){ //refactor this
      double balance = getBalanceOfAccount(accountNumber);
      if (balance >= totalSum){
        accountList.get(index).balance = accountList.get(index).balance - totalSum;
        paymentIsValid = true;
      }
    }
  return paymentIsValid;
  }
}
