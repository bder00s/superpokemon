package src;

public abstract class Pokemon {

    //VARIABELEN ////////////////////////////
    String type;
    String name;
    int height;
    int weight;

    int damage;
    String sound;
    String food;

    //CONSTRUCTOR ////////////////////////////////
    public Pokemon(String type,String name, int height, int weight, int damage, String sound, String food) {
        this.type = type;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.damage = damage;
        this.sound = sound;
        this.food = food;
    }

    //GETTERS en SETTERS //////////////////////////

    public String getType(){
        return type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHeight() {
        return height;
    }


    public int getWeight() {
        return weight;
    }

    public int getDamage() {
        return damage;
    }

    public String getSound() {
        return sound;
    }


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    //METHODS ////////////////////////////////////

    public abstract void eats(String food);


    public abstract void speaks(String sound);

    public void scratches() {
        System.out.println(getName() + " scratches Opponent and does " + getDamage() + " damage");
    }

public void getPokemonType(){
    System.out.println(getName() + " is a " + getType() + " pokemon");
}

}


