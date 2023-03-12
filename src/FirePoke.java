package src;

public class FirePoke extends Pokemon {

    //VARIABELEN /////////////////////////
    private String heat;
    private String heatDamage;


    //CONSTRUCTOR
    FirePoke(String type, String name, int height, int weight, int damage, String sound, String food, String heat, String heatDamage) {
        super(type,name, height, weight, damage, sound, food);

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
        System.out.println("Type: " + getType()
                + " | Name: " + getName()
                + " | Height: " + getHeight()
                + " | Weight: " + getWeight()
                + " | Damage: " + getDamage()
                + " | Sound: " + getSound()
                + " | Food: " + getFood()
                + " | Heat of fire: " + getHeat()
        );
    }

    public void pyroBall(){
        System.out.println(getName() + " used pyroball! o0o A hole is burned into opponent! The damage is: " + getHeatDamage());
    }

    public void inferno(){
        System.out.println(getName() + " used inferno! ^^^^^^^ Opponent goes up in flames!");
    }


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
