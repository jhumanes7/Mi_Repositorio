import java.util.List;

public class Pokemon {
    private final int numPokedex;
    private String nombre;
    private int nivel;
    private List<Tipo> tipos;
    private int vidaMax;
    private int vida;
    private int ataqueFisico;
    private int defensaFisica;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private List<Ataque> ataques;

    public Pokemon(int numPokedex, String nombre, int nivel, List<Tipo> tipos, int vidaBase, int ataqueBase, int defensaBase, int ataqueEBase, int defensaEBase, int velocidadBase, List<Ataque> ataques) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.nivel = nivel;
        this.tipos = tipos;
        this.vidaMax = ((2 * vidaBase * nivel) / 100) + nivel + 10;
        this.vida = vidaMax;
        this.ataqueFisico = ((2 * ataqueBase * nivel) / 100) + 5;
        this.defensaFisica = ((2 * defensaBase * nivel) / 100) + 5;
        this.ataqueEspecial = ((2 * ataqueEBase * nivel) / 100) + 5;
        this.defensaEspecial = ((2 * defensaEBase * nivel) / 100) + 5;
        this.velocidad = ((2 * velocidadBase * nivel) / 100) + 5;
        this.ataques = ataques;
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

    public int getNumPokedex() {
        return numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(List<Tipo> tipos) {
        this.tipos = tipos;
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

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public int getAtaqueFisico() {
        return ataqueFisico;
    }

    public void setAtaqueFisico(int ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    public int getDefensaFisica() {
        return defensaFisica;
    }

    public void setDefensaFisica(int defensaFisica) {
        this.defensaFisica = defensaFisica;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "numPokedex=" + numPokedex +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", tipos=" + tipos +
                ", vidaMax=" + vidaMax +
                ", vida=" + vida +
                ", ataqueFisico=" + ataqueFisico +
                ", defensaFisica=" + defensaFisica +
                ", ataqueEspecial=" + ataqueEspecial +
                ", defensaEspecial=" + defensaEspecial +
                ", velocidad=" + velocidad +
                ", ataques=" + ataques +
                '}';
    }
}