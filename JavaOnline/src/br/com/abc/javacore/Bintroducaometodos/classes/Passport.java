package br.com.abc.javacore.Bintroducaometodos.classes;

public class Passport {
    private String name;
    private String country;
    private double monthsToExpire;

    public Passport(String name, String country, double monthsToExpire) {
        this.name = name;
        this.country = country;
        this.monthsToExpire = monthsToExpire;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("Months to expire: " + this.monthsToExpire);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMonths(double months) {
        this.monthsToExpire = months;
    }
}
