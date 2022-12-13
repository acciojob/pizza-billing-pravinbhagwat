package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeawayPrice;
    private  boolean istoppingsAdded;
    private boolean isCheeseAdded;
    private boolean isTakeawayAdded;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price = 300;
        else this.price = 400;

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        isCheeseAdded = false;
        istoppingsAdded = false;
        isTakeawayAdded = false;
        isBillGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded) {
            this.cheesePrice = 80;
            this.price += this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!istoppingsAdded) {
            if (isVeg) {
                this.toppingsPrice = 70;
            }
            else {
                this.toppingsPrice = 120;
            }
            this.price += toppingsPrice;
            istoppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isTakeawayAdded) {
            this.takeawayPrice = 20;
            this.price += takeawayPrice;
            this.isTakeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!isBillGenerated) {
//            this.bill  = "Base Price Of The Pizza: " + this.price + "\n";
            if(isCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.cheesePrice +"\n";
            }
            if (istoppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if (isTakeawayAdded) {
                this.bill += "Paperbag Added: " + this.takeawayPrice + "\n";
            }
            this.bill += "Total Price: "+ this.price +"\n";

            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
