package src;

public class ElectricPoke extends Pokemon {

    // VARIABELEN /////////////////////////
private int amountOfVolt;



// CONSTRUCTOR /////////////////////

    public ElectricPoke(String type, String name, int height, int weight, int damage, String sound, String food, int amountOfVolt) {
        super(type, name, height, weight, damage, sound, food);

        this.amountOfVolt = amountOfVolt;
    }

    //METHODS ///////////////////////////////
    @Override
    public void eats(String food) {

        System.out.println(getName() + " eats: " + getFood());
    }

    @Override
    public void speaks(String sound) {

        System.out.println(getName() + " says: " + getSound());
    }

    public void getCompleteElectricPokemon(){
        System.out.println("Type:  " + getType()
                + " | Name: " + getName()
                + " | Height: " + getHeight()
                + " | Weight: " + getWeight()
                + " | Damage: " + getDamage()
                + " | Sound: " + getSound()
                + " | Food: " + getFood()
                + " | Amount of volt: " + getAmountOfVolt()
        );
    }


    //GETTERS EN SETTERS /////////////////////

    public int getAmountOfVolt(){
        return amountOfVolt;
    }

    public void setAmountOfVolt(int amountOfVolt){
        this.amountOfVolt = amountOfVolt;
    }
}
