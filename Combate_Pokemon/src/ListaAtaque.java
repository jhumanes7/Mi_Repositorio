import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaAtaque {
    private static final List<Ataque> ataques = new ArrayList<>();
    private static final Map<String, Ataque> mapaAtaques = new HashMap<>();

    static {
        ataques.add(new Ataque("Acupresión", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30));
        ataques.add(new Ataque("Adaptación", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30));
        ataques.add(new Ataque("Afilar", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20));
        ataques.add(new Ataque("Agarre", 55, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 30));
        ataques.add(new Ataque("Agarrón", 0, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 5));
        ataques.add(new Ataque("Agitacola", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30));
        ataques.add(new Ataque("Aguante", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 10));
        ataques.add(new Ataque("Aguzar", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30));
        ataques.add(new Ataque("Alboroto", 90, 100, Tipo.NORMAL, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Alivio", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20));
        ataques.add(new Ataque("Amago", 30, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Antojo", 30, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Anulación", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20));
        ataques.add(new Ataque("Estruendo", 140, 100, Tipo.NORMAL, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Giro Rápido", 50, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 40));
        ataques.add(new Ataque("Megapatada", 120, 75, Tipo.NORMAL, CategoriaAtaque.FISICO, 5));
        ataques.add(new Ataque("Meteorobola", 50, 100, Tipo.NORMAL, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Triataque", 80, 100, Tipo.NORMAL, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Velocidad Extrema", 80, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 5));

        ataques.add(new Ataque("Hoja Aguda", 90, 100, Tipo.PLANTA, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Asta Drenaje", 90, 100, Tipo.PLANTA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Latigazo", 120, 85, Tipo.PLANTA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Gigadrenado", 75, 100, Tipo.PLANTA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Rayo Solar", 120, 100, Tipo.PLANTA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Lluevehojas", 130, 90, Tipo.PLANTA, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Somnífero", 0, 75, Tipo.PLANTA, CategoriaAtaque.ESTADO, 15));

        ataques.add(new Ataque("Puño Fuego", 75, 100, Tipo.FUEGO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Patada Ígnea", 85, 90, Tipo.FUEGO, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Envite Ígneo", 120, 100, Tipo.FUEGO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Pirotecnia", 70, 100, Tipo.FUEGO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Lanzallamas", 90, 100, Tipo.FUEGO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Anillo Ígneo", 150, 90, Tipo.FUEGO, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Día Soleado", 0, 0, Tipo.FUEGO, CategoriaAtaque.ESTADO, 5));

        ataques.add(new Ataque("Cascada", 80, 100, Tipo.AGUA, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Martillazo", 100, 95, Tipo.AGUA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Tajo Acuático", 70, 100, Tipo.AGUA, CategoriaAtaque.FISICO, 20));
        ataques.add(new Ataque("Surf", 90, 100, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Hidrobomba", 110, 80, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Hidrocañón", 150, 90, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Hidrochorro", 0, 0, Tipo.AGUA, CategoriaAtaque.ESTADO, 15));

        ataques.add(new Ataque("Chispa", 65, 100, Tipo.ELECTRICO, CategoriaAtaque.FISICO, 20));
        ataques.add(new Ataque("Voltio Cruel", 90, 100, Tipo.ELECTRICO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Placaje Eléctrico", 120, 100, Tipo.ELECTRICO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Puño Trueno", 75, 100, Tipo.ELECTRICO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Rayo", 90, 100, Tipo.ELECTRICO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Trueno", 110, 70, Tipo.ELECTRICO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Campo Eléctrico", 0, 0, Tipo.ELECTRICO, CategoriaAtaque.ESTADO, 10));

        ataques.add(new Ataque("Fuerza Telúrica", 90, 100, Tipo.TIERRA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Terremoto", 100, 100, Tipo.TIERRA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Fisura", 1000000, 30, Tipo.TIERRA, CategoriaAtaque.FISICO, 5));
        ataques.add(new Ataque("Bomba Fango", 65, 85, Tipo.TIERRA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Tierra Viva", 90, 100, Tipo.TIERRA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Simún de Arena", 100, 80, Tipo.TIERRA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Ataque Arena", 0, 100, Tipo.TIERRA, CategoriaAtaque.ESTADO, 15));

        ataques.add(new Ataque("Avalancha", 75, 90, Tipo.ROCA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Testarazo", 150, 80, Tipo.ROCA, CategoriaAtaque.FISICO, 5));
        ataques.add(new Ataque("Tormenta de Diamantes", 100, 95, Tipo.ROCA, CategoriaAtaque.FISICO, 5));
        ataques.add(new Ataque("Poder Pasado", 60, 100, Tipo.ROCA, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Joya de Luz", 80, 100, Tipo.ROCA, CategoriaAtaque.ESPECIAL, 20));
        ataques.add(new Ataque("Rayo Meteórico", 120, 90, Tipo.ROCA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Trampa  Rocas", 0, 0, Tipo.ROCA, CategoriaAtaque.ESTADO, 20));

        ataques.add(new Ataque("Puño Hielo", 75, 100, Tipo.HIELO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Chuzos", 85, 90, Tipo.HIELO, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Martillo Hielo", 100, 90, Tipo.HIELO, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Rayo Aurora", 65, 100, Tipo.HIELO, CategoriaAtaque.ESPECIAL, 20));
        ataques.add(new Ataque("Rayo Hielo", 90, 100, Tipo.HIELO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Llama Gélida", 140, 90, Tipo.HIELO, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Granizo", 0, 0, Tipo.HIELO, CategoriaAtaque.ESTADO, 10));

        ataques.add(new Ataque("Pico Taladro", 80, 100, Tipo.VOLADOR, CategoriaAtaque.FISICO, 20));
        ataques.add(new Ataque("Vuelo", 90, 95, Tipo.VOLADOR, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Pájaro Osado", 120, 100, Tipo.VOLADOR, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Tajo Aéreo", 75, 95, Tipo.VOLADOR, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Ala Mortífera", 80, 100, Tipo.VOLADOR, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Vendaval", 100, 70, Tipo.VOLADOR, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Despejar", 0, 0, Tipo.VOLADOR, CategoriaAtaque.ESTADO, 15));

        ataques.add(new Ataque("Ida y Vuelta", 70, 100, Tipo.BICHO, CategoriaAtaque.FISICO, 20));
        ataques.add(new Ataque("Tijera X", 80, 100, Tipo.BICHO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Escaramuza", 100, 100, Tipo.BICHO, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Rayo Señal", 75, 100, Tipo.BICHO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Bola de Polen", 90, 100, Tipo.BICHO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Zumbido", 90, 100, Tipo.BICHO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Disparo Demora", 0, 95, Tipo.BICHO, CategoriaAtaque.ESTADO, 40));

        ataques.add(new Ataque("Llave Vital", 70, 0, Tipo.LUCHA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Gancho Alto", 85, 90, Tipo.LUCHA, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Patada Salto Alta", 120, 90, Tipo.LUCHA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Esfera Aural", 80, 0, Tipo.LUCHA, CategoriaAtaque.ESPECIAL, 20));
        ataques.add(new Ataque("Sable Místico", 85, 100, Tipo.LUCHA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Onda Certera", 120, 70, Tipo.LUCHA, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Corpulencia", 0, 0, Tipo.LUCHA, CategoriaAtaque.ESTADO, 20));

        ataques.add(new Ataque("Sombra Vil", 40, 100, Tipo.FANTASMA, CategoriaAtaque.FISICO, 30));
        ataques.add(new Ataque("Puntada Sombría", 90, 100, Tipo.FANTASMA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Golpe Umbrío", 120, 100, Tipo.FANTASMA, CategoriaAtaque.FISICO, 5));
        ataques.add(new Ataque("Tinieblas", 60, 100, Tipo.FANTASMA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Bola Sombra", 80, 100, Tipo.FANTASMA, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Orbes Espectro", 110, 100, Tipo.FANTASMA, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Mismo Destino", 0, 0, Tipo.FANTASMA, CategoriaAtaque.ESTADO, 15));

        ataques.add(new Ataque("Psicocorte", 70, 100, Tipo.PSIQUICO, CategoriaAtaque.FISICO, 20));
        ataques.add(new Ataque("Cabezazo Zen", 80, 90, Tipo.PSIQUICO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Psicocolmillo", 85, 100, Tipo.PSIQUICO, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Psiquico", 90, 100, Tipo.PSIQUICO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Premonición", 120, 100, Tipo.PSIQUICO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Láser Prisma", 160, 100, Tipo.PSIQUICO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Cambiafuerza", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 10));

        ataques.add(new Ataque("Finta", 60, 0, Tipo.SINIESTRO, CategoriaAtaque.FISICO, 20));
        ataques.add(new Ataque("Juego Sucio", 95, 100, Tipo.SINIESTRO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Golpe Bajo", 70, 100, Tipo.SINIESTRO, CategoriaAtaque.FISICO, 5));
        ataques.add(new Ataque("Pulso Umbrío", 80, 100, Tipo.SINIESTRO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Furia Candente", 90, 100, Tipo.SINIESTRO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Umbreozona", 90, 100, Tipo.SINIESTRO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Robo", 0, 0, Tipo.SINIESTRO, CategoriaAtaque.ESTADO, 10));

        ataques.add(new Ataque("Lanzamugre", 120, 80, Tipo.VENENO, CategoriaAtaque.FISICO, 5));
        ataques.add(new Ataque("Puya Nociva", 80, 100, Tipo.VENENO, CategoriaAtaque.FISICO, 20));
        ataques.add(new Ataque("Veneno X", 70, 100, Tipo.VENENO, CategoriaAtaque.FISICO, 20));
        ataques.add(new Ataque("Bomba Lodo", 90, 100, Tipo.VENENO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Cadena Virulenta", 100, 100, Tipo.VENENO, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Niebla Clara", 50, 0, Tipo.VENENO, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Búnker", 0, 0, Tipo.VENENO, CategoriaAtaque.ESTADO, 10));

        ataques.add(new Ataque("Cabeza de Hierro", 80, 100, Tipo.ACERO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Puño Meteoro", 90, 90, Tipo.ACERO, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Cola Férrea", 100, 75, Tipo.ACERO, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Disparo Espejo", 65, 85, Tipo.ACERO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Foco Resplandor", 80, 100, Tipo.ACERO, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Deseo Oculto", 140, 100, Tipo.ACERO, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Cambio de Marcha", 0, 0, Tipo.ACERO, CategoriaAtaque.ESTADO, 10));

        ataques.add(new Ataque("Cola Dragón", 60, 90, Tipo.DRAGON, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Garra Dragón", 80, 100, Tipo.DRAGON, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Enfado", 120, 100, Tipo.DRAGON, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Furia Dragón", 40, 100, Tipo.DRAGON, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Pulso Dragón", 85, 100, Tipo.DRAGON, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Cometa Draco", 130, 90, Tipo.DRAGON, CategoriaAtaque.ESPECIAL, 5));
        ataques.add(new Ataque("Estruendo Escama", 0, 0, Tipo.DRAGON, CategoriaAtaque.ESTADO, 5));

        ataques.add(new Ataque("Choque Anímico", 75, 100, Tipo.HADA, CategoriaAtaque.FISICO, 15));
        ataques.add(new Ataque("Carantoña", 90, 90, Tipo.HADA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Feerichoque", 100, 100, Tipo.HADA, CategoriaAtaque.FISICO, 10));
        ataques.add(new Ataque("Brillo Mágico", 80, 100, Tipo.HADA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Fuerza Lunar", 95, 100, Tipo.HADA, CategoriaAtaque.ESPECIAL, 15));
        ataques.add(new Ataque("Feerichoque", 100, 100, Tipo.HADA, CategoriaAtaque.ESPECIAL, 10));
        ataques.add(new Ataque("Cerrojo Feérico", 0, 0, Tipo.HADA, CategoriaAtaque.ESTADO, 10));

        for (Ataque ataque : ataques) {
            mapaAtaques.put(ataque.getNombre(), ataque);
        }
    }

    public static List<Ataque> getListaAtaques (){
        return ataques;
    }

    public static Ataque getAtaque(String nombre) {
        return mapaAtaques.get(nombre);
    }
}
