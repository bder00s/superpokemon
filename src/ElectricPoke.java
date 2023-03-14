package src;

public class ElectricPoke extends Pokemon {

    // VARIABELEN /////////////////////////
    private int amountOfVolt;
    private String voltRadius;


// CONSTRUCTOR /////////////////////

    public ElectricPoke(String type, String name, int height, int weight, int damage, String sound, String food, int amountOfVolt, String voltRadius) {
        super(type, name, height, weight, damage, sound, food);

        this.amountOfVolt = amountOfVolt;
        this.voltRadius = voltRadius;
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

    public void getCompleteElectricPokemon() {
        System.out.println("Type:  " + getType()
                + " | Name: " + getName()
                + " | Height: " + getHeight()
                + " | Weight: " + getWeight()
                + " | Damage: " + getDamage()
                + " | Sound: " + getSound()
                + " | Food: " + getFood()
                + " | Amount of volt: " + getAmountOfVolt()
                + " | Volt radius: " + getVoltRadius()
        );
    }

    public void thunder() {
        System.out.println(getName() + " uses thunder and electrocutes its opponent with " + getAmountOfVolt() + " volt.");
    }

    public void electroBall() {
        System.out.println(getName() + " throws an electroball at its opponent and does " + getDamage() + " damage.");
    }

    //GETTERS EN SETTERS /////////////////////

    public int getAmountOfVolt() {
        return amountOfVolt;
    }

    public void setAmountOfVolt(int amountOfVolt) {
        this.amountOfVolt = amountOfVolt;
    }


    public String getVoltRadius(){
        return voltRadius;
    }

    public void setVoltRadius(String voltRadius){
        this.voltRadius = voltRadius;
    }




}


