import java.util.*;
public class MHS_Bank{
  public ArrayList<MHS_BankAccount> accountList = new ArrayList<MHS_BankAccount>();

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
