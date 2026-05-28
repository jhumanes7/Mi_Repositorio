import java.util.ArrayList;
import java.util.List;

public class ListaAtaque {
    private static final List<Ataque> ataques = new ArrayList<>();

    static {
        ataques.add(new Ataque("Placaje", 20, 100, Tipo.NORMAL, CategoriaAtaque.FISICO));

        ataques.add(new Ataque("Absorber", 20, 100, Tipo.PLANTA, CategoriaAtaque.ESPECIAL));
        ataques.add(new Ataque("Látigo Cepa", 45, 100, Tipo.PLANTA, CategoriaAtaque.FISICO));
        ataques.add(new Ataque("Hoja Aguda", 90, 100, Tipo.PLANTA, CategoriaAtaque.FISICO));

        ataques.add(new Ataque("Ascuas", 40, 100, Tipo.FUEGO, CategoriaAtaque.ESPECIAL));
        ataques.add(new Ataque("Calcinación", 60, 100, Tipo.FUEGO, CategoriaAtaque.ESPECIAL));
        ataques.add(new Ataque("Lanzallamas", 90, 100, Tipo.FUEGO, CategoriaAtaque.ESPECIAL));

        ataques.add(new Ataque("Burbuja", 45, 100, Tipo.AGUA, CategoriaAtaque.ESPECIAL));
        ataques.add(new Ataque("Hidropulso", 60, 100, Tipo.AGUA, CategoriaAtaque.ESPECIAL));
        ataques.add(new Ataque("Cascada", 80, 100, Tipo.AGUA, CategoriaAtaque.FISICO));

    }

    public static List<Ataque> getListaAtaques (){
        return ataques;
    }
}
