

public class Main {

    public static void main(String[] args) {

        FirePoke charmander = new FirePoke("Charmander", 150, 300, 50, "chaaarmander", "small animals", "200 degrees");

        charmander.speaks(charmander.getSound());
        charmander.eats(charmander.getFood());

        charmander.getCompleteFirePokemon();


    }
}
