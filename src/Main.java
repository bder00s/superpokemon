package src;

public class Main {

    public static void main(String[] args) {

        FirePoke charmander = new FirePoke("Charmander", 150, 300, 50, "chaaarmander", "small animals", "200 degrees", "second degree");

        charmander.getCompleteFirePokemon();

        charmander.inferno();

        /////////////////////////////////////////

        GrassPoke bulbasaur = new GrassPoke("Bulbasaur", 100, 400, 50, "saauuur", null, 50, 100);


        bulbasaur.leafstorm();

        bulbasaur.scratches();

        /////////////////////////////////////////////

        WaterPoke squirtle = new WaterPoke("Squirtle" ,150, 250, 50, "sqoorr" , "fish", 50, "sweet water" );

        squirtle.getCompleteWaterPokemon();

        squirtle.raindance();

    }
}
