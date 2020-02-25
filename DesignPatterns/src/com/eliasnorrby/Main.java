package com.eliasnorrby;

public class Main {

    public static void main(String[] args) {
      Account account = new Account();
      account.setBalance(10);
      account.withdraw(5);
      System.out.println(account.getBalance());
    }

}
