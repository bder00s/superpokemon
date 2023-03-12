package src;

public class WaterPoke extends Pokemon {

    //VARIABELEN ///////////////////////
    private int waterDamage ;
    private String waterType;

    //CONSTRUCTOR ////////////////

    public WaterPoke(String name, int height, int weight, int damage, String sound, String food, int waterDamage, String waterType) {
        super(name, height, weight, damage, sound, food);

        this.waterDamage = waterDamage;
        this.waterType = waterType;

    }


    // METHODS ////////////////////////////

    @Override
    public void eats(String food) {
        System.out.println(getName() + " eats: " + getFood());
    }

    @Override
    public void speaks(String sound) {
        System.out.println(getName() + " says: " + getSound() + " - when above water surface");
    }


public void getCompleteWaterPokemon(){
    System.out.println(" Name: " + getName()
            + " | Height: " + getHeight()
            + " | Weight: " + getWeight()
            + " | Damage: " + getDamage()
            + " | Sound: " + getSound() + " - when above water surface"
            + " | Food: " + getFood()
            + " | Water type: " + getWaterType());

}

public void hydroCanon(){
    System.out.println(getName() + " used hydro canon! ~~~~~~~~ Opponent drowns with " + getWaterDamage() + " damage");
}

public void raindance(){
    System.out.println(getName() + " used raindance '''''''' and heals itself with " + getWaterType());
}

    //GETTERS EN SETTERS /////////////////////

    public int getWaterDamage(){
        return waterDamage;
    }

    public void setWaterDamage(int waterDamage){
        this.waterDamage = waterDamage;
    }

    public String getWaterType(){
        return waterType;
    }

    public void setWaterType(){
        this.waterType = waterType;
    }
}
