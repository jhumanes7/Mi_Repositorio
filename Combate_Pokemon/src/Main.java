import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("PULSA ENTER PARA COMENZAR ▼");
        sc.nextLine();

        Pokemon pokemonJugador = EleccionPokemon.eleccionJugador(sc, random);
        Pokemon pokemonRival = EleccionPokemon.eleccionRival(random);


        SistemaCombate.combate(pokemonJugador, pokemonRival, sc, random);
    }
}


// LOS ATAQUES DE ESTADO HACEN 1 DE DAÑO Y EL DAÑO SE ACUMULA EN EL MISMO POKEMON
// BORRAR O RELLENAR POKEMONS SIN ATAQUES PARA PROBAR MAIN
