package test;
import java.io.*;


public class main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File info = new File("info.txt");
        File R = new File("result.txt");

        FileInputStream fRead = new FileInputStream(info);
        double Balance =fRead.read();

        FileOutputStream fWrite =new FileOutputStream(R);

        checking c1 = new checking();
        saving s1 = new saving();

        System.out.println(c1.toString());
        System.out.println(s1.toString());

        Account account = new Account("mohamed",1122, Balance);
        account.setAnnualInterestRate(1.5);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        System.out.println("Name: " + account.getName());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());


        fWrite.write(("Name: " + account.getName()+"\n").getBytes());
        fWrite.write(("Balance: $" + account.getBalance()+"\n").getBytes());
        fWrite.write(("Monthly Interest: " + account.getMonthlyInterest()+"\n").getBytes());
        fWrite.write(("Date Created: " + account.getDateCreated()).getBytes());
        fWrite.close();
    }

}
