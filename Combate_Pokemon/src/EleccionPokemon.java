import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EleccionPokemon {

    static List<Pokemon> pool = ListaPokemon.getListaPokemons();

    public static Pokemon eleccionJugador (Scanner sc, Random random) {


        int eleccion;

        do {
            System.out.println("ELIGE A TU POKEMON");
            for (int i = 0; i < pool.size(); i++) {
                System.out.println((i + 1) + ". " + pool.get(i).getNombre());
            }
            eleccion = sc.nextInt();
            sc.nextLine();

            if (eleccion < 1 || eleccion > pool.size()) {
                System.out.println("\n--Número Incorrecto--\n");
            }

        } while (eleccion < 1 || eleccion > pool.size());

        return pool.get(eleccion - 1);
    }

    public static Pokemon eleccionRival (Random random) {

        return pool.get(random.nextInt(pool.size()));
    }
}
