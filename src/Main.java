package src;

public class Main {

    public static void main(String[] args) {

        FirePoke charmander = new FirePoke("Charmander", 150, 300, 50, "chaaarmander", "small animals", "200 degrees", "second degree");

        charmander.getCompleteFirePokemon();

        /////////////////////////////////////////

        GrassPoke bulbasaur = new GrassPoke("Bulbasaur", 200, 400, 50, "saauuur", null, 50, 100);

        bulbasaur.getCompleteGrassPokemon();


    }
}
