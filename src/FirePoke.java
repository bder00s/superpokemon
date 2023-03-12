package src;

public class FirePoke extends Pokemon {

    //VARIABELEN /////////////////////////
    private String heat;
    private String heatDamage;


    //CONSTRUCTOR
    FirePoke(String name, int height, int weight, int hp, String sound, String food, String heat, String heatDamage) {
        super(name, height, weight, hp, sound, food);
        this.heatDamage = heatDamage;
        this.heat = heat;


    }

    //METHODS //////////////////////////

    @Override
    public void eats(String food) {

        System.out.println(getName() + " eats: " + getFood());
    }

    @Override
    public void speaks(String sound) {

        System.out.println(getName() + " says: " + getSound());
    }


    public void getCompleteFirePokemon() {
        System.out.println(" Name: " + getName()
                + " | Height: " + getHeight()
                + " | Weight: " + getWeight()
                + " | HP: " + getHp()
                + " | Sound: " + getSound()
                + " | Food: " + getFood()
                + " | Heat of fire: " + getHeat()
        );
    }

    public void


    //GETTERS EN SETTERS //////////////


    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

    public String getHeatDamage(){
        return heatDamage;
    }

    public void setHeatDamage(String heatDamage){
        this.heatDamage = heatDamage;
    }

}
