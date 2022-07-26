package OOP.BANK;

public class BankDetailsUse {
    public static void main(String[] args){

        BankDetails p1 = new BankDetails("Jagdish Kumawat", "SBI2022");

        p1.addMoney(10000);
        System.out.println(p1.totalBalance());  
        
        p1.addMoney(20000);
        System.out.println(p1.totalBalance());

        p1.withdrawMoney(25000);
        System.out.println(p1.totalBalance());


    
        System.out.println(BankDetails.BANK_NAME);
        System.out.println(BankDetails.numOfAccounts);

        System.out.println(p1.getAccountNumber());
    }
}
