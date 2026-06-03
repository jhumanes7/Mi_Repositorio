import java.util.HashMap;
import java.util.Map;

public class Ataque {
    private String nombre;
    private int potencia;
    private int precision;
    private Tipo tipo;
    private CategoriaAtaque categoria;
    private int pp;
    private int prioridad;
    private boolean contacto;
    private AtributoAtaque atributo;


    public Ataque(String nombre, int potencia, int precision, Tipo tipo, CategoriaAtaque categoria, int pp, int prioridad, boolean contacto, AtributoAtaque atributo) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.precision = precision;
        this.tipo = tipo;
        this.categoria = categoria;
        this.pp = pp;
        this.prioridad = prioridad;
        this.contacto = contacto;
        this.atributo = atributo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public CategoriaAtaque getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaAtaque categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Ataque{" +
                "nombre='" + nombre + '\'' +
                ", potencia=" + potencia +
                ", precision=" + precision +
                ", tipo=" + tipo +
                '}';
    }
}
