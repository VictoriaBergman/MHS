public class MHS_Main{
    public MHS_Bank nordea;
    public MHS_Bank handelsbanken;
    public MHS_Bank seb;
    public MHS_Bank swedbank;

  public MHS_Main(){
    //Creat banks.
    nordea = new MHS_Bank();
    handelsbanken = new MHS_Bank();
    seb = new MHS_Bank();
    swedbank = new MHS_Bank();
    // add accounts to each bank
    nordea.addAccount("1234567891", 0);
    nordea.addAccount("1234678912", 10);
    nordea.addAccount("1234789123", 25);
    nordea.addAccount("1234891234", 50);
    nordea.addAccount("1234912345", 5000);

    handelsbanken.addAccount("1423012345", 30);
    handelsbanken.addAccount("1423123456", 70);
    handelsbanken.addAccount("1423234567", 60);
    handelsbanken.addAccount("1423345678", 300);
    handelsbanken.addAccount("1423456789", 55);

    seb.addAccount("5531223445", 15);
    seb.addAccount("5531774689", 35);
    seb.addAccount("5531553876", 20);
    seb.addAccount("5531443251", 80);
    seb.addAccount("5531889234", 75);

    swedbank.addAccount("9951618539", 55);
    swedbank.addAccount("9951628539", 95);
    swedbank.addAccount("9951653679", 78);
    swedbank.addAccount("9951653679", 85);
    swedbank.addAccount("9951617459", 200);
  }

  public Payment checkPayment(String accountNumber, double totalSum) {

    Payment payment = new Payment();
    // method that communicates with TIS

    if (accountNumber.length() == 10) {
      String bankId = accountNumber.substring(0,4); // extract the bank id
      if (bankId.equals("1234")) {
        payment.nameOfBank = "Nordea";
        payment.isValid = nordea.tryPayment(accountNumber, totalSum);
      } else if (bankId.equals("1423")) {
        payment.nameOfBank = "Handelsbanken";
        payment.isValid = handelsbanken.tryPayment(accountNumber, totalSum);
      } else if (bankId.equals("5531")) {
        payment.nameOfBank = "SEB";
        payment.isValid = seb.tryPayment(accountNumber, totalSum);
      } else if (bankId.equals("9951")) {
        payment.nameOfBank = "Swedbank";
        payment.isValid = swedbank.tryPayment(accountNumber, totalSum);
      }
    }
    return payment;
  }

  public void reset(){
    // reset Payment ?? Or make sure this happens in checkPayment??
  }

}
