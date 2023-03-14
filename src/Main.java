package src;

public class Main {

    public static void main(String[] args) {

        FirePoke charmander = new FirePoke("fire","Charmander", 150, 300, 50, "chaaarmander", "small animals", "100 degrees", "second degree");

        charmander.pyroBall();

        charmander.inferno();

        charmander.getPokemonType();

        /////////////////////////////////////////

        GrassPoke bulbasaur = new GrassPoke("grass","Bulbasaur", 100, 400, 50, "saauuur", null, 50, 100);


        bulbasaur.leafstorm();

        bulbasaur.scratches();

        /////////////////////////////////////////////

        WaterPoke squirtle = new WaterPoke("water","Squirtle" ,150, 250, 50, "sqoorr" , "fish", 50, "sweet water" );


        squirtle.raindance();

        squirtle.hydroCanon();

        ///////////////////////////////////////////////

        ElectricPoke pikachu = new ElectricPoke("electric", "Pikachu" , 50, 100, 70, "pika pika", "berries", 230, "1 km");

        pikachu.getCompleteElectricPokemon();

        pikachu.thunder();

    }
}
