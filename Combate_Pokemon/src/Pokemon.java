import java.util.Arrays;
import java.util.List;

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
        vida = vidaMax;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public int atacar(int index) {
        return ataques[index].getPotencia();
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