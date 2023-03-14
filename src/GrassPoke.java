package src;

import java.util.ArrayList;

public class GrassPoke extends Pokemon {

    //VARIABELEN /////////////////////

    private int amountOfPoison;
    private int grassPoisonDamage;

//CONSTRUCTOR ///////////////////////////
    public GrassPoke(String type, String name, int height, int weight, int damage, String sound, String food, int amountOfPoison, int grassPoisonDamage) {
        super(type, name, height, weight, damage, sound, food);

        this.amountOfPoison = amountOfPoison;
        this.grassPoisonDamage = grassPoisonDamage;
    }




    // METHODS//////////////////////////////////

    @Override
    public void eats(String food) {
        System.out.println("Grass pokemon don't eat food - they use photosynthesis");
    }

    @Override
    public void speaks(String sound) {
        System.out.println(getName() + " says: " + getSound());
    }


    public void getCompleteGrassPokemon() {
        System.out.println("Type: " + getType()
                + " | Name: " + getName()
                + " | Height: " + getHeight()
                + " | Weight: " + getWeight()
                + " | Damage: " + getDamage()
                + " | Sound: " + getSound()
                + " | Food: Grass pokemon don't eat food - they use photosynthesis"
                + " | Amount of poison: " + getAmountOfPoison()

        );
    }

    public void leafstorm(){
        System.out.println(getName() + " used leafstorm! `'`'`'`'`'` Opponent gets blinded by leaves!");
    }

    public void leechSeed(){
        System.out.println(getName() + " used leech seed! »»»»» Opponent gets attacked by poisoned leeches! The damage is: " + getGrassPoisonDamage());
    }

    //GETTERS EN SETTERS //////////////////////

    public int getAmountOfPoison(){
        return amountOfPoison;
    }

    public void setAmountOfPoison(int amountOfPoison){
        this.amountOfPoison = amountOfPoison;
    }

    public int getGrassPoisonDamage(){
        return grassPoisonDamage;
    }

    public void setGrassPoisonDamage(int grassPoisonDamage){
        this.grassPoisonDamage = grassPoisonDamage;
    }


}
