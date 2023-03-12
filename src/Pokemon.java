package src;

public abstract class Pokemon {

    //VARIABELEN ////////////////////////////
    String name;
    int height;
    int weight;
    int hp;
    String sound;
    String food;

    //CONSTRUCTOR ////////////////////////////////
    public Pokemon(String name, int height, int weight, int hp, String sound, String food) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hp = hp;
        this.sound = sound;
        this.food = food;
    }

    //GETTERS en SETTERS //////////////////////////
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

    public int getHp() {
        return hp;
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



}


