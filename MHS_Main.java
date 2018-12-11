public class MHS_Main{

  public MHS_Main(){
    MHS_Bank nordea = new MHS_Bank();
    MHS_Bank handlesbanken = new MHS_Bank();
    MHS_Bank seb = new MHS_Bank();
    MHS_Bank swedbank = new MHS_Bank();
    // add accounts to each bank
  }

  public Payment checkPayment(String accountNumber, double totalSum) {

    Payment payment = new Payment();
    // method that communicates with TIS

    if (accountNumber.length() == 10) {
      String bankId = accountNumber.substring(0,3); // extract the bank id

    }
    return payment;
  }

  public void reset(){
    // reset Payment ?? Or make sure this happens in checkPayment??
  }

}
