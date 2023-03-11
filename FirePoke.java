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

    }

    @Override
    public void speaks(String sound) {

    }

    //GETTERS EN SETTERS //////////////

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

}
