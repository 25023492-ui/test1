class BankAccount {

    private final String accountNumber;
    private double balance;
    public String ownerName;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance < 0) {
            System.out.println("So du khong hop le, gan = 0");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien nap phai > 0");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

class Bai21 {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("001", "An");

        acc.deposit(-100);

        boolean kq1 = acc.withdraw(50);
        System.out.println("Rut 50: " + kq1);

        acc.deposit(500);
        System.out.println("So du: " + acc.getBalance());

        boolean kq2 = acc.withdraw(200);
        System.out.println("Rut 200: " + kq2);

        System.out.println("So du con lai: " + acc.getBalance());
    }
}