package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Passport;

import java.util.Scanner;

public class PassportTest {
    public static void main(String[] args) {
        // creating a new passport
        Passport p = new Passport("", "", 0);
        Scanner sc = new Scanner(System.in);

        //Getting the name
        System.out.println("Name: ");
        String name = sc.next();
        p.setName(name);
        //Getting the country
        System.out.println("Country: ");
        String country = sc.next();
        p.setCountry(country);
        //Getting the Months to expire
        System.out.println("Months to expire: ");
        double months = sc.nextDouble();
        p.setMonths(months);

        p.print();
    }
}


