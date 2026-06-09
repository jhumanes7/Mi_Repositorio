import java.util.Random;

public class CalculadoraDanio {
    public static int calculadorDanio (Ataque ataqueUsado, Pokemon pokemonAtacante, Pokemon pokemonDefensor, boolean atacaJugador, Random random) {
        double danio;

        if (ataqueUsado.getNombre().equals("Forcejeo")) {
            danio = calcularDanioFisicoEspecial(ataqueUsado, pokemonAtacante, pokemonDefensor);
            danio = calcularCritico(danio, random);
            danio = calcularVarianza(danio, random);
        } else {
            double multiplicador = calcularEfectividad(ataqueUsado, pokemonDefensor, atacaJugador);

            danio = calcularDanioFisicoEspecial(ataqueUsado, pokemonAtacante, pokemonDefensor);
            danio = calcularSTAB(danio, ataqueUsado, pokemonAtacante);
            danio *= multiplicador;
            danio = calcularCritico(danio, random);
            danio = calcularVarianza(danio, random);
        }

        return Math.max(1, (int) (danio));
    }

    public static double calcularEfectividad (Ataque ataqueUsado, Pokemon pokemonDefensor, Boolean atacaJugador){
        double multiplicador = 1.0;

        for (int i = 0; i < pokemonDefensor.getTipos().size(); i++) {
            multiplicador *= Efectividades.multiplicador(ataqueUsado.getTipo(), pokemonDefensor.getTipos().get(i));
        }

        if (multiplicador > 1.0) {
            System.out.println("\n¡Es súper eficaz!");
        } else if (multiplicador < 1.0) {
            System.out.println("\n¡No es muy eficaz!");
        }

        if (multiplicador == 0.0) {
            if (atacaJugador) {
                System.out.println("¡No afecta al " + pokemonDefensor.getNombre() + " enemigo!");
                return 0;
            } else {
                System.out.println("¡No afecta a " + pokemonDefensor.getNombre() + "!");
                return 0;
            }
        }

        return multiplicador;
    }

    public static double calcularDanioFisicoEspecial (Ataque ataqueUsado, Pokemon pokemonAtacante, Pokemon pokemonDefensor) {
        double danio = 0;

        if (ataqueUsado.getCategoria() == CategoriaAtaque.FISICO) {
            danio = ((double) (pokemonAtacante.getAtaqueFisico() * ataqueUsado.getPotencia()) / pokemonDefensor.getDefensaFisica()) + 2;
        } else if (ataqueUsado.getCategoria() == CategoriaAtaque.ESPECIAL) {
            danio = ((double) (pokemonAtacante.getAtaqueEspecial() * ataqueUsado.getPotencia()) / pokemonDefensor.getDefensaEspecial()) + 2;
        }

        return danio;
    }

    public static double calcularSTAB (double danio, Ataque ataqueUsado, Pokemon pokemonAtacante) {
        for (int i = 0; i < pokemonAtacante.getTipos().size(); i++) {
            if (pokemonAtacante.getTipos().get(i) == ataqueUsado.getTipo()) {
                danio *= 1.5;
            }
        }

        return danio;
    }

    public static double calcularCritico (double danio, Random random) {
        boolean critico = random.nextInt(100) < 5;

        if (critico) {
            danio *= 1.5;
            System.out.println("¡Un crítico!");
        }

        return danio;
    }

    public static double calcularVarianza (double danio, Random random) {
        danio *= (0.85 + random.nextDouble() * 0.15);

        return danio;
    }
}
