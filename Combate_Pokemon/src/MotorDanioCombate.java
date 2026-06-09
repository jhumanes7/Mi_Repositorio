import java.util.Random;

public class MotorDanioCombate {
    public static void atacar(int index, Pokemon pokemonAtacante, Pokemon pokemonDefensor, boolean atacaJugador, Random random) {
        Ataque ataqueUsado;

        if (atacaJugador) {
            if (!SistemaCombate.jugadorTienePP) {
                ataqueUsado = ListaAtaque.getAtaque("Forcejeo");
            } else {
                ataqueUsado = pokemonAtacante.getAtaques().get(index);

                ataqueUsado.setPpRestantes(ataqueUsado.getPpRestantes() - 1);
            }
        } else {
            if (!SistemaCombate.enemigoTienePP) {
                ataqueUsado = ListaAtaque.getAtaque("Forcejeo");
            } else {
                ataqueUsado = pokemonAtacante.getAtaques().get(index);

                ataqueUsado.setPpRestantes(ataqueUsado.getPpRestantes() -  1);
            }
        }


        String nombreAtacante;
        String nombreDefensor;

        if (atacaJugador) {
            nombreAtacante = pokemonAtacante.getNombre();
            nombreDefensor = "El " + pokemonDefensor.getNombre() + " enemigo";
        } else {
            nombreAtacante = "El " + pokemonAtacante.getNombre() + " enemigo";
            nombreDefensor = pokemonDefensor.getNombre();
        }

        int probabilidad;

        if (ataqueUsado.getPrecision() == 0) {
            probabilidad = -1;
        } else {
            probabilidad = random.nextInt(100);
        }

        if (probabilidad >= ataqueUsado.getPrecision()) {
            int opcion = random.nextInt(2);

            switch (opcion) {
                case 0: System.out.println("\n" + nombreDefensor + " ha esquivado el ataque\n");
                    break;

                case 1: System.out.println("\n" + nombreAtacante + " ha fallado el ataque\n");
                    break;
            }
        } else {
            System.out.println("\n" + nombreAtacante + " ha usado " + ataqueUsado.getNombre());

            int danio = CalculadoraDanio.calculadorDanio(ataqueUsado, pokemonAtacante, pokemonDefensor, atacaJugador, random);

            pokemonDefensor.recibirDanio(danio);
            System.out.println("\n" + pokemonDefensor.getNombre() + " (" + pokemonDefensor.getVida() + "/" + pokemonDefensor.getVidaMax() + ")");

            if (!pokemonDefensor.estaVivo()) {
                System.out.println("\n" + nombreDefensor + " se ha debilitado");
            }
        }
    }
}
