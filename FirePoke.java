public class FirePoke extends Pokemon {

    //VARIABELEN /////////////////////////
    String heat;


    //CONSTRUCTOR
    public FirePoke(String name, int height, int weight, int hp, String sound, String food, String heat) {
        super(name, height, weight, hp, sound, food);
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

    //GETTERS EN SETTERS //////////////


    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

}
