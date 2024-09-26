public class AccountTransfer {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);

        while(a.transfer(b,3000)) {
            ;
        }

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}

class Account {
    private String num;
    private int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public boolean transfer(Account dest, int amount) {
        if(this.balance < 3000) {
            return false;
        }
        dest.balance += amount;
        this.balance -= amount;
        return true;
    }

    public String toString() {
        return "Account {num=" + this.num + ", balance=" + this.balance + "}";
    }
}