package test;

class Account {
    String name = null;
    protected int id = 0;
    protected double balance = 0.0;
    protected double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(String name,int id, double balace) {
        this();
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public String setName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    void deposite(double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class checking extends Account {

    checking(){
        super();
    }
    checking(String name,int id, double balance){
        super(name,id,balance);
    }

    @Override
    public void deposite(double amount){
        if(amount>5000) System.out.println("wrong deposite");
        else if(amount <= 0) System.out.println("You can not deposite a negative or 0");
        else{
            super.deposite(amount);
        }

    }
}

class saving extends Account {

    saving(){
        super();
    }
    saving(String name,int id, double balance){
        super(name,id,balance);
    }

    @Override
    public void withdraw(double amount){
        if(amount>1500) System.out.println("Sorry, you can not withdraw");
        else if(amount <= 0) System.out.println("You can not deposite a negative or 0");
        else{
            super.withdraw(amount);
        }
    }
}