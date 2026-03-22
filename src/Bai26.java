class Transaction {

    private final String transactionId;
    private final double amount;
    private final String timestamp;

    public Transaction(String id, double amount, String time) {
        this.transactionId = id;
        this.amount = amount;
        this.timestamp = time;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        return timestamp;
    }
}

class Account {

    private Transaction[] history = new Transaction[100];
    private int size = 0;

    public void addTransaction(Transaction t) {
        history[size++] = t;
    }

    public Transaction[] getHistory() {
        Transaction[] copy = new Transaction[size];
        for (int i = 0; i < size; i++) {
            copy[i] = history[i];
        }
        return copy;
    }
}

class Bai26 {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.addTransaction(new Transaction("T1", 100, "10:00"));
        acc.addTransaction(new Transaction("T2", 200, "11:00"));

        Transaction[] h = acc.getHistory();

        h[0] = null;

        System.out.println(acc.getHistory()[0].getAmount());
    }
}