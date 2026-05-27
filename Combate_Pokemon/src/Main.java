import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        Pokemon Bulbasaur = new Pokemon(
                "Bulbasaur", Tipo.PLANTA, 120,

                new Ataque[] {
                        new Ataque("Placaje", 20, 100, Tipo.NORMAL),
                        new Ataque("Látigo Cepa", 40, 100, Tipo.PLANTA)
                }
        );

        Pokemon Charmander = new Pokemon(
                "Charmander", Tipo.FUEGO, 120,

                new Ataque[] {
                        new Ataque("Placaje", 20, 100, Tipo.NORMAL),
                        new Ataque("Ascuas", 40, 100, Tipo.FUEGO)
                }
        );

        Pokemon Squirtle = new Pokemon(
                "Squirtle", Tipo.AGUA, 120,

                new Ataque[] {
                        new Ataque("Placaje", 20, 100, Tipo.NORMAL),
                        new Ataque("Burbuja", 40, 100, Tipo.AGUA)
                }
        );

        Pokemon[] pool = {Bulbasaur, Charmander, Squirtle};

        System.out.println("Elige a tu pokemon: \n");
        for (int i = 0; i < pool.length; i++) {
            System.out.println((i + 1) + ". " + pool[i].getNombre() + "\n");
        }
        int eleccion = sc.nextInt();

        Pokemon pokemonJugador = pool[eleccion - 1];

        Pokemon pokemonRival = null;

        if (pokemonJugador == Bulbasaur) {
            pokemonRival = Charmander;
        } else if (pokemonJugador == Charmander) {
            pokemonRival = Squirtle;
        } else if (pokemonJugador == Squirtle) {
            pokemonRival = Bulbasaur;
        }


        System.out.println("\nEmpieza el combate: \n");

        System.out.println("Adelante " + pokemonJugador.getNombre() + "\n");

        System.out.println("El rival ha elegido a " + pokemonRival.getNombre() + "\n");

        while (pokemonJugador.estaVivo() && pokemonRival.estaVivo()) {

            System.out.println("Turno del jugador:");

            for (int i = 0; i < pokemonJugador.getAtaques().length; i++) {
                System.out.println((i + 1) + ". " + pokemonJugador.getAtaques()[i].getNombre() +
                        " (potencia " + pokemonJugador.getAtaques()[i].getPotencia() + ")");
            }

            int ataqueJugador = sc.nextInt() - 1;

            System.out.println("Tu pokemon ha usado " + pokemonJugador.getAtaques()[ataqueJugador].getNombre());

            int dano = pokemonJugador.getAtaques()[ataqueJugador].getPotencia();
            pokemonRival.recibirDano(dano);

            System.out.println("\nEl pokemon rival ha perdido " + pokemonJugador.getAtaques()[ataqueJugador].getPotencia() + " PS (" + pokemonRival.getVida() + "/" + pokemonRival.getVidaMax() + ") \n");

            if (!pokemonRival.estaVivo()) {
                System.out.println("""
                        El pokemon rival se ha debilitado.
                        ¡Has ganado el combate!"""); break;
            }

            System.out.println("Turno del rival: \n");


            int ataqueRival = random.nextInt(pokemonRival.getAtaques().length);

            System.out.println("El pokemon rival a usado " + pokemonRival.getAtaques()[ataqueRival].getNombre() + "\n");

            dano = pokemonRival.getAtaques()[ataqueRival].getPotencia();
            pokemonJugador.recibirDano(dano);

            System.out.println("Tu pokemon ha perdido " + pokemonRival.getAtaques()[ataqueRival].getPotencia() + " PS (" + pokemonJugador.getVida() + "/" + pokemonJugador.getVidaMax() + ") \n");

            if (!pokemonJugador.estaVivo()) {
                System.out.println("""
                        Tu pokemon ha sido debilitado.
                        ¡Has perdido el combate!""");
                break;
            }
        }
    }
}
