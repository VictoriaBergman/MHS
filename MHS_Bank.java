import java.util.*;
public class MHS_Bank{
  public ArrayList<MHS_BankAccount> accountList = new ArrayList<MHS_BankAccount>();

  public void addAccount(String accountNumber, double balance) {
    MHS_BankAccount newAccount = new MHS_BankAccount(accountNumber, balance);
    accountList.add(newAccount);
  }

  public boolean checkIndex(int index){
    return index < accountList.size();
  }

  public int indexOfAccount(String accountNumber) {
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
}
