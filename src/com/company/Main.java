package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Medium Rare","White");
        hamburger.BaseBurger();
        hamburger.getBacon();
        hamburger.getLettuce();
        hamburger.getCheese();
        System.out.println("Your personalized burger costs: " + hamburger.getPrice() + " $");
        System.out.println(hamburger.getName());

        System.out.println(" ");


        HealthyBurger healthyBurger = new HealthyBurger("Vegetarian");
        System.out.println("Basic Healthy burger costs:" + healthyBurger.getPrice());
        healthyBurger.getEgg();
        healthyBurger.getPeanuts();
        healthyBurger.getBacon();
        healthyBurger.getTomato();
        System.out.println("Your personalized healthy burger costs: " + healthyBurger.getPrice());

        System.out.println(" ");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("BigOne costs:" + deluxeBurger.getPrice());
        deluxeBurger.getDrink("Pepsi");
        deluxeBurger.getChips();
        System.out.println("Your personalized bigOne costs:" + deluxeBurger.getPrice());







    }
}
