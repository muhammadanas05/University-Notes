class Bank {
        int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    int amount = 1000;

        int getBalance() {
        return amount;
    }
}

class BankB extends Bank {
        int amount = 1500;

        int getBalance() {
        return amount;
    }
}

class BankC extends Bank {
    int amount = 2000;

        int getBalance() {
        return amount;
    }

    public static void main(String[] args) {
        BankA A = new BankA();
        BankB B = new BankB();
        BankC C = new BankC();

        System.out.println("Money deposited in Bank A: $" + A.getBalance());
        System.out.println("Money deposited in Bank B: $" + B.getBalance());
        System.out.println("Money deposited in Bank C: $" + C.getBalance());
    }
}
