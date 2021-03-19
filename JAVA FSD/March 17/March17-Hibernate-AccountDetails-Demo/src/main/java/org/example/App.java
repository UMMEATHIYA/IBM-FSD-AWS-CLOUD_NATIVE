package org.example;

/**
 * Hello world!
 *
 */
import org.example.entity.Account;
import org.example.service.AccountService;
import org.example.service.AccountServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static AccountService accountService;

    static {
        accountService = new AccountServiceImpl();
    }

    public static void main(String[] args) {
        System.out.print("Account Number: ");
        int acno = scanner.nextInt();
        System.out.print("Account NAME: ");
        String name = scanner.next();
        System.out.print("Balance: ");
        int balance = scanner.nextInt();
        System.out.print("Address: ");
        String Address = scanner.next();
        accountService.createAccount(new Account(acno,name,balance,Address));
        System.out.print("Account created.");
    }

}