import java.util.Random;

public class Pokemon {
    private String nombre;
    private Tipo tipo;
    private int vidaMax;
    private int vida;
    private Ataque[] ataques;

    public Pokemon(String nombre, Tipo tipo, int vidaMax, Ataque[] ataques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vidaMax = vidaMax;
        this.ataques = ataques;
        this.vida = vidaMax;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void atacar(int index, Pokemon pokemonAtacante, Pokemon pokemonDefensor, boolean atacaJugador, Random random) {
        Ataque ataqueUsado = pokemonAtacante.getAtaques()[index];

        String nombreAtacante;
        String nombreDefensor;

        int danio;

        if (atacaJugador) {
            nombreAtacante = pokemonAtacante.getNombre();
            nombreDefensor = "El " + pokemonDefensor.getNombre() + " rival";
        } else {
            nombreAtacante = "El " + pokemonAtacante.getNombre() + " rival";
            nombreDefensor = pokemonDefensor.getNombre();
        }

        int probabilidad = random.nextInt(100);

        if (probabilidad >= ataqueUsado.getPrecision()) {
            int opcion = random.nextInt(2);

            switch (opcion) {
                case 0: System.out.println(nombreDefensor + " ha esquivado el ataque");
                break;

                case 1: System.out.println(nombreAtacante + " ha fallado el ataque");
                break;
            }
        } else {

            danio = efectividades(ataqueUsado, pokemonDefensor);

            if (ataqueUsado.getTipo() == pokemonAtacante.getTipo()) {
                danio *= 1.5;
            }

            pokemonDefensor.recibirDanio(danio);

            System.out.println("\n" + nombreAtacante + " ha usado " + ataqueUsado.getNombre() + "\n");
            System.out.println(pokemonDefensor.getNombre() + " (" + pokemonDefensor.getVida() + "/" + pokemonDefensor.getVidaMax() + ")\n");

            if (!pokemonDefensor.estaVivo()) {
                System.out.println(nombreDefensor + " se ha debilitado");
            }
        }
    }

    public int efectividades(Ataque ataqueUsado, Pokemon pokemonDefensor) {
        int potencia = ataqueUsado.getPotencia();
        
        if (ataqueUsado.getTipo() == Tipo.PLANTA) {
            if (pokemonDefensor.getTipo() == Tipo.AGUA) {
                potencia = ataqueUsado.getPotencia() * 2;
            } else if (pokemonDefensor.getTipo() == Tipo.PLANTA || pokemonDefensor.getTipo() == Tipo.FUEGO) {
                potencia = ataqueUsado.getPotencia() / 2;
            }
        } else if (ataqueUsado.getTipo() == Tipo.FUEGO) {
            if (pokemonDefensor.getTipo() == Tipo.PLANTA) {
                potencia = ataqueUsado.getPotencia() * 2;
            } else if (pokemonDefensor.getTipo() == Tipo.FUEGO || pokemonDefensor.getTipo() == Tipo.AGUA) {
                potencia = ataqueUsado.getPotencia() / 2;
            }
        } else if (ataqueUsado.getTipo() == Tipo.AGUA) {
            if (pokemonDefensor.getTipo() == Tipo.FUEGO) {
                potencia = ataqueUsado.getPotencia() * 2;
            } else if (pokemonDefensor.getTipo() == Tipo.PLANTA || pokemonDefensor.getTipo() == Tipo.AGUA) {
                potencia = ataqueUsado.getPotencia() / 2;
            }
        }

        return potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Ataque[] getAtaques() {
        return ataques;
    }

    public void setAtaques(Ataque[] ataques) {
        this.ataques = ataques;
    }
}