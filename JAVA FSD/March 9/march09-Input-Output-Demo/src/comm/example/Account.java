package comm.example;

public class Account {
    private int accountId;
    private String accountName;
    private double accountBalance;

    public Account() {
    }

    public Account(int accountId, String accountName, double accountBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public String displayDetails()
    {
        return "ID: "+accountId
                +" Name: "+accountName
                +" Balance: "+accountBalance;
    }
}

