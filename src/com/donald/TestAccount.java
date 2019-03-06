package com.donald;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1= new Account("Mary","001",30000);
        Account acc2= new Account("George","002",500000);
        Account acc3= new Account("Cloney","003",2540000);
        Account acc4= new Account("Harry","004",60206.55);
        Account acc5= new Account("Potter","005",120000);

        System.out.println(acc1.getBalance());
        acc1.setBalance(65000);
        System.out.println(acc1.getBalance());

        acc2.deposit(1000);
        acc2.printDetails();
        acc2.withdraw(40000);
        acc2.printDetails();

        String name = "john";
        name.toUpperCase();
        //primitive
        int x = 10;
        double z = 88;
        boolean finished = true;

        Account[] accounts = {acc1,acc2,acc3,acc4,acc5};

        for(Account k :accounts) {
            k.deposit(100);
            k.printDetails();

        }
    }
}
