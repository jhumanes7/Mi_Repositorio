import java.util.Random;
import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PULSA ENTER PARA COMENZAR ▼");
        sc.nextLine();

        Random random = new Random();

        Pokemon bulbasaur = new Pokemon(
                "Bulbasaur", Tipo.PLANTA, 120,

                new Ataque[] {
                        new Ataque("Placaje", 20, 100, Tipo.NORMAL),
                        new Ataque("Látigo Cepa", 40, 100, Tipo.PLANTA)
                }
        );

        Pokemon charmander = new Pokemon(
                "Charmander", Tipo.FUEGO, 120,

                new Ataque[] {
                        new Ataque("Placaje", 20, 100, Tipo.NORMAL),
                        new Ataque("Ascuas", 40, 100, Tipo.FUEGO)
                }
        );

        Pokemon squirtle = new Pokemon(
                "Squirtle", Tipo.AGUA, 120,

                new Ataque[] {
                        new Ataque("Placaje", 20, 100, Tipo.NORMAL),
                        new Ataque("Burbuja", 40, 100, Tipo.AGUA)
                }
        );

        Pokemon[] pool = {bulbasaur, charmander, squirtle};

        int eleccion;

        do {
            System.out.println("ELIGE A TU POKEMON");
            for (int i = 0; i < pool.length; i++) {
                System.out.println((i + 1) + ". " + pool[i].getNombre());
            }
            eleccion = sc.nextInt();
            sc.nextLine();

            if (eleccion < 1 || eleccion > pool.length) {
                System.out.println("\n--Número Incorrecto--\n");
            }

        } while (eleccion < 1 || eleccion > pool.length);

        Pokemon pokemonJugador = pool[eleccion - 1];

        Pokemon pokemonRival = null;

        if (pokemonJugador == bulbasaur) {
            pokemonRival = charmander;
        } else if (pokemonJugador == charmander) {
            pokemonRival = squirtle;
        } else if (pokemonJugador == squirtle) {
            pokemonRival = bulbasaur;
        }

        System.out.println("\nEMPIEZA EL COMBATE ▼");
        sc.nextLine();

        System.out.println("Adelante " + pokemonJugador.getNombre() + "\n");

        System.out.println("Tu rival ha elegido a " + pokemonRival.getNombre() + "\n");

        while (pokemonJugador.estaVivo() && pokemonRival.estaVivo()) {

            System.out.println("TURNO DEL JUGADOR ▼");
            sc.nextLine();

            System.out.println("ELIGE UN ATAQUE");

            int ataqueJugador;

            do {
                for (int i = 0; i < pokemonJugador.getAtaques().length; i++) {
                    System.out.println((i + 1) + ". " + pokemonJugador.getAtaques()[i].getNombre() +
                            " (potencia " + pokemonJugador.getAtaques()[i].getPotencia() + ")");
                }

                ataqueJugador = sc.nextInt() - 1;
                sc.nextLine();

                if (ataqueJugador < 0 || ataqueJugador >= pokemonJugador.getAtaques().length) {
                    System.out.println("\n--Número Incorrecto--\n");
                }

            } while (ataqueJugador < 0 || ataqueJugador >= pokemonJugador.getAtaques().length);

            pokemonJugador.atacar(ataqueJugador, pokemonJugador, pokemonRival, true, random);

            if (!pokemonRival.estaVivo()) {
                System.out.println("¡HAS GANADO EL COMBATE!");
                break;
            }

            System.out.print("TURNO DEL RIVAL ▼");
            sc.nextLine();

            int ataqueRival = random.nextInt(pokemonRival.getAtaques().length);

            pokemonRival.atacar(ataqueRival, pokemonRival, pokemonJugador,false, random);

            if (!pokemonJugador.estaVivo()) {
                System.out.println("¡HAS PERDIDO EL COMBATE!");
                break;
            }
        }
    }
}
