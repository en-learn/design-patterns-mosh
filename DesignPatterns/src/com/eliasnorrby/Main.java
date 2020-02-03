package com.eliasnorrby;

public class Main {

    public static void main(String[] args) {
      User user = new User("Mosh", 30);
      System.out.println(user.name);
      user.sayHello();
    }
}
