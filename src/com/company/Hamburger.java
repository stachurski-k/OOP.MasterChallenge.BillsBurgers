package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private double lettuce;
    private double tomato;
    private double bacon;
    private double cheese;


    public Hamburger( String meat,  String breadRollType) {
        this.name = "Basic";
        this.meat = meat;
        this.price = 5.50;
        this.breadRollType = breadRollType;

        this.lettuce = 0.5;
        this.tomato = 0.5;
        this.bacon = 1.5;
        this.cheese = 1;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getLettuce(){
        this.price += this.lettuce;
    }

    public void getTomato(){
        this.price += this.tomato;
    }
    public void getBacon(){
        this.price += this.bacon;
    }
    public void getCheese(){
        this.price += this.cheese;
    }

    private double totalCost(){
        return (this.price + this.tomato + this.bacon + this.lettuce + this.cheese);
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void BaseBurger(){
        System.out.println("Basic burger costs 5$" + "\n" + "Available addition:"+ "\n"
        +"Lettuce - 0.50$" + "\n" + "Tomato - 0.50$" + "\n" + "Bacon - 1.50$" + "\n" + "Cheese - 1.00$ ");
    }
}
