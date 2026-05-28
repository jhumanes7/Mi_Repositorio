import java.util.Random;
import java.util.Scanner;

public class SistemaCombate {
    public static void combate(Pokemon pokemonJugador, Pokemon pokemonRival, Scanner sc, Random random) {
        System.out.println("\nEMPIEZA EL COMBATE ▼");
        sc.nextLine();

        System.out.println("Adelante " + pokemonJugador.getNombre() + "\n");

        System.out.println("Tu rival ha elegido a " + pokemonRival.getNombre());

        int contador = 0;

        while (pokemonJugador.estaVivo() && pokemonRival.estaVivo()) {
            contador++;

            System.out.println("\nTURNO " + contador + " ▼");
            sc.nextLine();

            System.out.println("ELIGE UN ATAQUE");

            int ataqueJugador;

            do {
                for (int i = 0; i < pokemonJugador.getAtaques().size(); i++) {
                    System.out.println((i + 1) + ". " + pokemonJugador.getAtaques().get(i).getNombre() +
                            " (potencia " + pokemonJugador.getAtaques().get(i).getPotencia() + ")");
                }

                ataqueJugador = sc.nextInt() - 1;
                sc.nextLine();

                if (ataqueJugador < 0 || ataqueJugador >= pokemonJugador.getAtaques().size()) {
                    System.out.println("\n--Número Incorrecto--\n");
                }

            } while (ataqueJugador < 0 || ataqueJugador >= pokemonJugador.getAtaques().size());

            int ataqueRival = random.nextInt(pokemonRival.getAtaques().size());

            if (elegirOrden(pokemonJugador, pokemonRival, random)) {
                turnoJugador(ataqueJugador, pokemonJugador, pokemonRival, sc, random);

                if (!pokemonRival.estaVivo()) continue;

                turnoRival(ataqueRival, pokemonJugador, pokemonRival, random);
            } else {
                turnoRival(ataqueRival, pokemonJugador, pokemonRival, random);

                if(!pokemonJugador.estaVivo()) continue;

                turnoJugador(ataqueJugador, pokemonJugador, pokemonRival, sc, random);
            }
        }
    }

    public static boolean elegirOrden (Pokemon pokemonJugador, Pokemon pokemonRival, Random random) {
        boolean esMasRapido = false;

        if (pokemonJugador.getVelocidad() > pokemonRival.getVelocidad()) {
            esMasRapido = true;
        } else if (pokemonJugador.getVelocidad() == pokemonRival.getVelocidad()) {
            esMasRapido = random.nextBoolean();
        }

        return esMasRapido;
    }


    public static void turnoJugador (int ataqueJugador, Pokemon pokemonJugador, Pokemon pokemonRival, Scanner sc, Random random) {
        pokemonJugador.atacar(ataqueJugador, pokemonRival, true, random);

        if (!pokemonRival.estaVivo()) {
            System.out.println("\n¡HAS GANADO EL COMBATE!");
            return;
        }
    }

    public static void turnoRival (int ataqueRival, Pokemon pokemonJugador, Pokemon pokemonRival, Random random) {
        pokemonRival.atacar(ataqueRival, pokemonJugador, false, random);

        if (!pokemonJugador.estaVivo()) {
            System.out.println("\n¡HAS PERDIDO EL COMBATE!");
            return;
        }
    }

    public static int calculadorDanio (Ataque ataqueUsado, Pokemon pokemonAtacante, Pokemon pokemonDefensor, boolean atacaJugador, Random random) {
        double multiplicador = Efectividades.multiplicador(ataqueUsado.getTipo(), pokemonDefensor.getTipo());

        double danio = 0;

        if (ataqueUsado.getCategoria() == CategoriaAtaque.FISICO) {
            danio = ((double) (pokemonAtacante.getAtaqueFisico() * ataqueUsado.getPotencia()) / pokemonDefensor.getDefensaFisica()) + 2;
        } else if (ataqueUsado.getCategoria() == CategoriaAtaque.ESPECIAL) {
            danio = ((double) (pokemonAtacante.getAtaqueEspecial() * ataqueUsado.getPotencia()) / pokemonDefensor.getDefensaEspecial()) + 2;
        }

        if (pokemonAtacante.getTipo() == ataqueUsado.getTipo()) {
            danio *= 1.5;
        }

        if (multiplicador == 0.0) {
            if (atacaJugador) {
                System.out.println("¡No afecta al" + pokemonDefensor.getNombre() + " rival");
                return 0;
            } else {
                System.out.println("¡No afecta a " + pokemonDefensor.getNombre());
                return 0;
            }

        }
        danio *= multiplicador;

        if (multiplicador > 1.0) {
            System.out.println("\n¡Es súper eficaz!");
        } else if (multiplicador < 1.0) {
            System.out.println("\n¡No es muy eficaz!");
        }

        boolean critico = random.nextInt(100) < 5;

        if (critico) {
            danio *= 1.5;
            System.out.println("¡Un crítico!");
        }

        danio *= (0.85 + random.nextDouble() * 0.15);

        return Math.max(1, (int) (danio));
    }
}
