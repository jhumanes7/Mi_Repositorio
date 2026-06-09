import java.util.Random;
import java.util.Scanner;

public class SistemaCombate {
    static boolean jugadorTienePP = true;
    static boolean enemigoTienePP = true;

    public static void combate(Pokemon pokemonJugador, Pokemon pokemonEnemigo, Scanner sc, Random random) {
        System.out.println("\nEMPIEZA EL COMBATE ▼");
        sc.nextLine();

        System.out.println("Adelante " + pokemonJugador.getNombre() + "\n");

        System.out.println("El enemigo ha elegido a " + pokemonEnemigo.getNombre());

        int contador = 0;

        while (pokemonJugador.estaVivo() && pokemonEnemigo.estaVivo()) {
            contador++;

            System.out.println("\nTURNO " + contador + " ▼");
            sc.nextLine();

            System.out.println("ELIGE UN ATAQUE");

            int ataqueJugador;

            do {
                for (int i = 1; i < pokemonJugador.getAtaques().size(); i++) {
                    System.out.printf("%-20s", i + ". " + pokemonJugador.getAtaques().get(i - 1).getNombre() + " PP " +
                            pokemonJugador.getAtaques().get(i - 1).getPpRestantes() + "/" + pokemonJugador.getAtaques().get(i - 1).getPp() + "   ");

                        if (i % 2 == 0) {
                            System.out.println();
                        }
                }

                ataqueJugador = sc.nextInt() - 1;
                sc.nextLine();

                if (ataqueJugador < 0 || ataqueJugador >= pokemonJugador.getAtaques().size()) {
                    System.out.println("\n--Número Incorrecto--\n");
                } else if (pokemonJugador.getAtaques().get(ataqueJugador).getPpRestantes() <= 0) {
                    System.out.println("No quedan PP restantes");

                    for (int i = 0; i < pokemonJugador.getAtaques().size(); i++) {
                        if (pokemonJugador.getAtaques().get(i).getPpRestantes() > 0) return;

                        SistemaCombate.jugadorTienePP = false;
                    }
                }

            } while (ataqueJugador < 0 || ataqueJugador >= pokemonJugador.getAtaques().size() || pokemonJugador.getAtaques().get(ataqueJugador).getPpRestantes() <= 0);

            int ataqueEnemigo = random.nextInt(pokemonEnemigo.getAtaques().size());

            if (pokemonEnemigo.getAtaques().get(ataqueEnemigo).getPpRestantes() <= 0) {
                for (int i = 0; i < pokemonEnemigo.getAtaques().size(); i++) {
                    if (pokemonEnemigo.getAtaques().get(i).getPpRestantes() > 0) return;

                    SistemaCombate.enemigoTienePP = false;
                }

                ataqueEnemigo = random.nextInt(pokemonEnemigo.getAtaques().size());
            }

            if (elegirOrden(pokemonJugador, pokemonEnemigo, pokemonJugador.getAtaques().get(ataqueJugador), pokemonEnemigo.getAtaques().get(ataqueEnemigo), random)) {
                turnoJugador(ataqueJugador, pokemonJugador, pokemonEnemigo, sc, random);

                if (!pokemonEnemigo.estaVivo()) continue;

                turnoRival(ataqueEnemigo, pokemonJugador, pokemonEnemigo, random);
            } else {
                turnoRival(ataqueEnemigo, pokemonJugador, pokemonEnemigo, random);

                if(!pokemonJugador.estaVivo()) continue;

                turnoJugador(ataqueJugador, pokemonJugador, pokemonEnemigo, sc, random);
            }
        }
    }



    public static boolean elegirOrden (Pokemon pokemonJugador, Pokemon pokemonEnemigo, Ataque ataqueJugador, Ataque ataqueEnemigo, Random random) {
        boolean esMasRapido = false;

        if (ataqueJugador.getPrioridad() > ataqueEnemigo.getPrioridad()) {
            esMasRapido = true;
        } else if (ataqueJugador.getPrioridad() == ataqueEnemigo.getPrioridad()) {
            if (pokemonJugador.getVelocidad() > pokemonEnemigo.getVelocidad()) {
                esMasRapido = true;
            } else if (pokemonJugador.getVelocidad() == pokemonEnemigo.getVelocidad()) {
                esMasRapido = random.nextBoolean();
            }
        }

        return esMasRapido;
    }

    public static void turnoJugador (int ataqueJugador, Pokemon pokemonJugador, Pokemon pokemonEnemigo, Scanner sc, Random random) {
        MotorDanioCombate.atacar(ataqueJugador, pokemonJugador, pokemonEnemigo, true, random);

        if (!pokemonEnemigo.estaVivo()) {
            System.out.println("\n¡HAS GANADO EL COMBATE!");
            return;
        }
    }

    public static void turnoRival (int ataqueEnemigo, Pokemon pokemonJugador, Pokemon pokemonEnemigo, Random random) {
        MotorDanioCombate.atacar(ataqueEnemigo, pokemonEnemigo, pokemonJugador, false, random);

        if (!pokemonJugador.estaVivo()) {
            System.out.println("\n¡HAS PERDIDO EL COMBATE!");
            return;
        }
    }
}
