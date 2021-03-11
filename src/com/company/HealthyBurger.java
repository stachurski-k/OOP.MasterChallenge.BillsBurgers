package com.company;

public class HealthyBurger extends Hamburger {
    private double egg ;

    private double peanuts;

    public HealthyBurger(String meat) {
        super(meat, "Brown rye bread");
        this.egg = 1.20;
        this.peanuts = 0.75;
        setPrice(4.00);
        setName("HealthyOne");
    }


    public void getEgg(){
        setPrice(getPrice()+this.egg);
    }

    public void getPeanuts(){
        setPrice(getPrice()+this.peanuts);
    }

    @Override
    public void getBacon() {
        System.out.println("You can't have bacon in healthy burger");
    }

}
