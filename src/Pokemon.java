package src;

public abstract class Pokemon {

    //VARIABELEN ////////////////////////////
    String name;
    int height;
    int weight;

    int damage;
    String sound;
    String food;

    //CONSTRUCTOR ////////////////////////////////
    public Pokemon(String name, int height, int weight, int damage, String sound, String food) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.damage = damage;
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



}


