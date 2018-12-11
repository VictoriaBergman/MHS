public class MHS_Main{

  public MHS_Main(){
    // create banks
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
