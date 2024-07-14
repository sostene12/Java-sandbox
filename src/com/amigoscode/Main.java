package com.amigoscode;

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
//        START FROM LESSON 180
//    BankAccount account = new BankAccount("kaleb",BigDecimal.TEN,false);
//        System.out.println(account.withdraw(new BigDecimal("9.0")));
//        System.out.println(account.withdraw(new BigDecimal("1.0")));
//        System.out.println(account.getBalance());

        String[] languages = {"Java","Go","C++"};
        Programmer java = new Programmer("sostene","kimironko",25,"Full stack ",languages);
//       java.writeSomeCode() ;
//        System.out.println(java.getAddress());
        java.sayHi();
    }
}