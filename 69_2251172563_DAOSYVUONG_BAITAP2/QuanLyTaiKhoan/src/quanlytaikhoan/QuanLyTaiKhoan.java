package quanlytaikhoan;

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 100) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Rut tien khong thanh cong! So du sau rut phai lon hon hoac bang 100.");
        }
    }
}

public class QuanLyTaiKhoan {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        System.out.println("So du ban dau: " + account.getBalance());
        account.withdraw(300);
        System.out.println("So du sau lan rut 300 dau tien: " + account.getBalance());
        account.withdraw(300);
        System.out.println("So du sau lan rut 300 thu hai: " + account.getBalance());
    }
}