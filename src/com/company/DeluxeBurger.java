package com.company;

public class DeluxeBurger extends Hamburger {

    private double chips;
    private double drink;

    public DeluxeBurger() {
        super("Well done Extra Large", "Extra Large");
        this.chips = 5d;
        this.drink = 3d;
        setName("BigOne");
        setPrice(8.00);
    }

    public void getChips(){
        setPrice(getPrice()+this.chips);
    }

    public void getDrink(String Name){
        setPrice(getPrice()+this.drink);
    }

    @Override
    public void getLettuce() {
        System.out.println("You can't add vegetables to BigOne");
    }

    @Override
    public void getTomato() {
        System.out.println("You can't add vegetables to BigOne");
    }
}


