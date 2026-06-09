import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaAtaque {
    private static final List<Ataque> ataques = new ArrayList<>();
    private static final Map<String, Ataque> mapaAtaques = new HashMap<>();

    static {
        ataques.add(new Ataque("Afilar", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Agarre", 55, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 30, 0, true, null));
        ataques.add(new Ataque("Anulación", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Arañazo", 40, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 35, 0, true, null));
        ataques.add(new Ataque("Atadura", 15, 85, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, true, null)); //
        ataques.add(new Ataque("Ataque Furia", 15, 85, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, true, null)); //
        ataques.add(new Ataque("Ataque Rápido", 40, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 30, 1, true, null));
        ataques.add(new Ataque("Atizar", 80, 75, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, true, null));
        ataques.add(new Ataque("Autodestrucción", 200, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 5, 0, false, null)); //
        ataques.add(new Ataque("Beso Amoroso", 0, 75, Tipo.NORMAL, CategoriaAtaque.ESTADO, 10, 0, false, null));
        ataques.add(new Ataque("Bomba Huevo", 100, 75, Tipo.NORMAL, CategoriaAtaque.FISICO, 10, 0, false, AtributoAtaque.PROYECTIL));
        ataques.add(new Ataque("Bomba Sónica", 60, 90, Tipo.NORMAL, CategoriaAtaque.ESPECIAL, 20, 0, false, null)); //
        ataques.add(new Ataque("Bombardeo", 15, 85, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, false, AtributoAtaque.PROYECTIL)); //
        ataques.add(new Ataque("Cabezazo", 130, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 10, 0, true, null)); //
        ataques.add(new Ataque("Canto", 0, 55, Tipo.NORMAL, CategoriaAtaque.ESTADO, 15, 0, false, AtributoAtaque.SONIDO));
        ataques.add(new Ataque("Chirrido", 0, 85, Tipo.NORMAL, CategoriaAtaque.ESTADO, 40, 0, false, AtributoAtaque.SONIDO));
        ataques.add(new Ataque("Clavo Cañón", 20, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 15, 0, false, null)); //
        ataques.add(new Ataque("Constricción", 15, 90, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, true, null)); //
        ataques.add(new Ataque("Conversión", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Cornada", 65, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 25, 0, true, null));
        ataques.add(new Ataque("Corte", 50, 95, Tipo.NORMAL, CategoriaAtaque.FISICO, 30, 0, true, AtributoAtaque.CORTE));
        ataques.add(new Ataque("Cuchillada", 70, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, true, AtributoAtaque.CORTE)); //
        ataques.add(new Ataque("Danza Espada", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20, 0, false, AtributoAtaque.DANZA));
        ataques.add(new Ataque("Danza Espada", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20, 0, false, AtributoAtaque.DANZA));
        ataques.add(new Ataque("Derribo", 90, 85, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, true, null)); //
        ataques.add(new Ataque("Deslumbrar", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Destello", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Destructor", 40, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 35, 0, true, null)); //
        ataques.add(new Ataque("Día de Pago", 40, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, false, null)); //
        ataques.add(new Ataque("Doble Bofetón", 15, 85, Tipo.NORMAL, CategoriaAtaque.FISICO, 10, 0, true, null)); //
        ataques.add(new Ataque("Doble Equipo", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 15, 0, false, null));
        ataques.add(new Ataque("Doble Filo", 120, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 15, 0, true, null)); //
        ataques.add(new Ataque("Explosión", 250, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 5, 0, false, null)); //
        ataques.add(new Ataque("Foco Energía", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Forcejeo", 50, 0, Tipo.NORMAL, CategoriaAtaque.FISICO, 1, 0, true, null));
        ataques.add(new Ataque("Fortaleza", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Fuerza", 80, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 15, 0, true, null));
        ataques.add(new Ataque("Furia", 20, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, false, null)); //
        ataques.add(new Ataque("Golpe Cabeza", 70, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 15, 0, true, null)); //
        ataques.add(new Ataque("Golpe Cuerpo", 85, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 15, 0, true, null)); //
        ataques.add(new Ataque("Golpes Furia", 18, 80, Tipo.NORMAL, CategoriaAtaque.FISICO, 15, 0, true, null)); //
        ataques.add(new Ataque("Gruñido", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 40, 0, false, AtributoAtaque.SONIDO));
        ataques.add(new Ataque("Guillotina", 1000, 30, Tipo.NORMAL, CategoriaAtaque.FISICO, 5, 0, true, null)); //
        ataques.add(new Ataque("Hipercolmillo", 80, 90, Tipo.NORMAL, CategoriaAtaque.FISICO, 15, 0, true, AtributoAtaque.MORDISCO)); //
        ataques.add(new Ataque("Hiperrayo", 150, 90, Tipo.NORMAL, CategoriaAtaque.ESPECIAL, 5, 0, false, null)); //
        ataques.add(new Ataque("Látigo", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Malicioso", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Megapatada", 120, 75, Tipo.NORMAL, CategoriaAtaque.FISICO, 5, 0, true, null));
        ataques.add(new Ataque("Megapuño", 80, 85, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, true, AtributoAtaque.PUNIO));
        ataques.add(new Ataque("Meteoros", 60, 0, Tipo.NORMAL, CategoriaAtaque.ESPECIAL, 20, 0, false, null));
        ataques.add(new Ataque("Metrónomo", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 10, 0, false, null));
        ataques.add(new Ataque("Mimético", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 10, 0, false, null));
        ataques.add(new Ataque("Ovocuración", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 5, 0, false, AtributoAtaque.CURACION));
        ataques.add(new Ataque("Pantalla de Humo", 0, 100, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Perforador", 1000, 30, Tipo.NORMAL, CategoriaAtaque.FISICO, 5, 0, true, null)); //
        ataques.add(new Ataque("Pisotón", 65, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 20, 0, true, null)); //
        ataques.add(new Ataque("Placaje", 40, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 35, 0, true, null));
        ataques.add(new Ataque("Puño Cometa", 18, 85, Tipo.NORMAL, CategoriaAtaque.FISICO, 15, 0, true, AtributoAtaque.PUNIO)); //
        ataques.add(new Ataque("Puño Mareo", 70, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 10, 0, true, AtributoAtaque.PUNIO)); //
        ataques.add(new Ataque("Recuperación", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 5, 0, false, AtributoAtaque.CURACION));
        ataques.add(new Ataque("Reducción", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 10, 0, false, null));
        ataques.add(new Ataque("Remolino", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20, -6, false, AtributoAtaque.VIENTO));
        ataques.add(new Ataque("Restricción", 10, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 35, 0, true, null)); //
        ataques.add(new Ataque("Rizo Defensa", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 40, 0, false, null));
        ataques.add(new Ataque("Rugido", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20, 0, false, AtributoAtaque.SONIDO));
        ataques.add(new Ataque("Salpicadura", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 40, 0, false, null));
        ataques.add(new Ataque("Saña", 120, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 10, 0, true, null)); //
        ataques.add(new Ataque("Superdiente", 60, 90, Tipo.NORMAL, CategoriaAtaque.FISICO, 10, 0, true, null)); //
        ataques.add(new Ataque("Supersónico", 0, 55, Tipo.NORMAL, CategoriaAtaque.ESTADO, 20, 0, false, AtributoAtaque.SONIDO));
        ataques.add(new Ataque("Sustituto", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 10, 0, false, null));
        ataques.add(new Ataque("Transformación", 0, 0, Tipo.NORMAL, CategoriaAtaque.ESTADO, 10, 0, false, null));
        ataques.add(new Ataque("Triataque", 80, 100, Tipo.NORMAL, CategoriaAtaque.FISICO, 10, 0, false, null)); //
        ataques.add(new Ataque("Venganza", 60, 0, Tipo.NORMAL, CategoriaAtaque.FISICO, 10, 1, true, null)); //
        ataques.add(new Ataque("Viento Cortante", 80, 100, Tipo.NORMAL, CategoriaAtaque.ESPECIAL, 10, 0, false, null)); //

        ataques.add(new Ataque("Absorber", 20, 100, Tipo.PLANTA, CategoriaAtaque.ESPECIAL, 25, 0, false, AtributoAtaque.CURACION)); //
        ataques.add(new Ataque("Danza Pétalo", 120, 100, Tipo.PLANTA, CategoriaAtaque.ESPECIAL, 10, 0, true, AtributoAtaque.DANZA)); //
        ataques.add(new Ataque("Dessarrollo", 0, 0, Tipo.PLANTA, CategoriaAtaque.ESTADO, 20, 0, false, null)); //
        ataques.add(new Ataque("Drenadoras", 0, 90, Tipo.PLANTA, CategoriaAtaque.ESTADO, 10, 0, false, null));
        ataques.add(new Ataque("Espora", 0, 100, Tipo.PLANTA, CategoriaAtaque.ESTADO, 15, 0, false, AtributoAtaque.POLVO));
        ataques.add(new Ataque("Hoja Afilada", 55, 95, Tipo.PLANTA, CategoriaAtaque.FISICO, 25, 0, false, AtributoAtaque.CORTE)); //
        ataques.add(new Ataque("Látigo Cepa", 45, 100, Tipo.PLANTA, CategoriaAtaque.FISICO, 25, 0, true, null));
        ataques.add(new Ataque("Megaagotar", 40, 100, Tipo.PLANTA, CategoriaAtaque.ESPECIAL, 15, 0, false, AtributoAtaque.CURACION)); //
        ataques.add(new Ataque("Paralizador", 0, 75, Tipo.PLANTA, CategoriaAtaque.ESTADO, 30, 0, false, AtributoAtaque.POLVO));
        ataques.add(new Ataque("Rayo Solar", 120, 100, Tipo.PLANTA, CategoriaAtaque.ESPECIAL, 10, 0, false, null)); //
        ataques.add(new Ataque("Somnífero", 0, 75, Tipo.PLANTA, CategoriaAtaque.ESTADO, 15, 0, false, AtributoAtaque.POLVO));

        ataques.add(new Ataque("Ascuas", 40, 100, Tipo.FUEGO, CategoriaAtaque.ESPECIAL, 25, 0, false, null)); //
        ataques.add(new Ataque("Giro Fuego", 35, 85, Tipo.FUEGO, CategoriaAtaque.ESPECIAL, 15, 0, false, null)); //
        ataques.add(new Ataque("Lanzallamas", 90, 100, Tipo.FUEGO, CategoriaAtaque.ESPECIAL, 15, 0, false, null)); //
        ataques.add(new Ataque("Llamarada", 110, 85, Tipo.FUEGO, CategoriaAtaque.ESPECIAL, 5, 0, false, null)); //
        ataques.add(new Ataque("Puño Fuego", 75, 100, Tipo.FUEGO, CategoriaAtaque.ESPECIAL, 15, 0, true, AtributoAtaque.PUNIO)); //

        ataques.add(new Ataque("Burbuja", 40, 100, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 30, 0, false, null)); //
        ataques.add(new Ataque("Cascada", 80, 100, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 15, 0, true, null)); //
        ataques.add(new Ataque("Hidrobomba", 110, 80, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 5, 0, false, null));
        ataques.add(new Ataque("Martillazo", 100, 95, Tipo.AGUA, CategoriaAtaque.FISICO, 10, 0, true, null)); //
        ataques.add(new Ataque("Pistola Agua", 40, 100, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 25, 0, false, null));
        ataques.add(new Ataque("Rayo Burbuja", 65, 100, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 20, 0, false, null));//
        ataques.add(new Ataque("Refugio", 0, 0, Tipo.AGUA, CategoriaAtaque.ESTADO, 40, 0, false, null));
        ataques.add(new Ataque("Surf", 90, 100, Tipo.AGUA, CategoriaAtaque.ESPECIAL, 15, 0, false, null)); //
        ataques.add(new Ataque("Tenaza", 35, 85, Tipo.AGUA, CategoriaAtaque.FISICO, 15, 0, true, null)); //

        ataques.add(new Ataque("Impactrueno", 40, 100, Tipo.ELECTRICO, CategoriaAtaque.ESPECIAL, 30, 0, false, null)); //
        ataques.add(new Ataque("Onda Trueno", 0, 90, Tipo.ELECTRICO, CategoriaAtaque.ESTADO, 20, 0, false, null)); //
        ataques.add(new Ataque("Puño Trueno", 75, 100, Tipo.ELECTRICO, CategoriaAtaque.FISICO, 15, 0, true, AtributoAtaque.PUNIO)); //
        ataques.add(new Ataque("Rayo", 90, 100, Tipo.ELECTRICO, CategoriaAtaque.ESPECIAL, 15, 0, false, null)); //
        ataques.add(new Ataque("Trueno", 110, 70, Tipo.ELECTRICO, CategoriaAtaque.ESPECIAL, 10, 0, false, null)); //

        ataques.add(new Ataque("Ataque Arena", 0, 100, Tipo.TIERRA, CategoriaAtaque.ESTADO, 15, 0, false, null));
        ataques.add(new Ataque("Excavar", 80, 100, Tipo.TIERRA, CategoriaAtaque.FISICO, 10, 0, true, null)); //
        ataques.add(new Ataque("Fisura", 1000, 30, Tipo.TIERRA, CategoriaAtaque.FISICO, 5, 0, false, null)); //
        ataques.add(new Ataque("Hueso Palo", 65, 85, Tipo.TIERRA, CategoriaAtaque.FISICO, 20, 0, false, null)); //
        ataques.add(new Ataque("Huesomerang", 50, 90, Tipo.TIERRA, CategoriaAtaque.FISICO, 10, 0, false, null)); //
        ataques.add(new Ataque("Terremoto", 100, 100, Tipo.TIERRA, CategoriaAtaque.FISICO, 10, 0, false, null)); //

        ataques.add(new Ataque("Avalancha", 75, 90, Tipo.ROCA, CategoriaAtaque.FISICO, 10, 0, false, null)); //
        ataques.add(new Ataque("Lanzarrocas", 50, 90, Tipo.ROCA, CategoriaAtaque.FISICO, 15, 0, false, null));

        ataques.add(new Ataque("Neblina", 0, 0, Tipo.HIELO, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Niebla", 0, 0, Tipo.HIELO, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Puño Hielo", 75, 100, Tipo.HIELO, CategoriaAtaque.FISICO, 15, 0, true, AtributoAtaque.PUNIO)); //
        ataques.add(new Ataque("Rayo Aurora", 65, 100, Tipo.HIELO, CategoriaAtaque.ESPECIAL, 20, 0, false, null)); //
        ataques.add(new Ataque("Rayo Hielo", 90, 100, Tipo.HIELO, CategoriaAtaque.ESPECIAL, 10, 0, false, null)); //
        ataques.add(new Ataque("Ventisca", 110, 70, Tipo.HIELO, CategoriaAtaque.ESPECIAL, 5, 0, false, AtributoAtaque.VIENTO)); //

        ataques.add(new Ataque("Ataque Aéreo", 140, 90, Tipo.VOLADOR, CategoriaAtaque.FISICO, 5, 0, false, null)); //
        ataques.add(new Ataque("Ataque Ala", 60, 100, Tipo.VOLADOR, CategoriaAtaque.FISICO, 35, 0, true, null));
        ataques.add(new Ataque("Espejo", 0, 0, Tipo.VOLADOR, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Pico Taladro", 80, 100, Tipo.VOLADOR, CategoriaAtaque.FISICO, 20, 0, true, null));
        ataques.add(new Ataque("Picotazo", 35, 100, Tipo.VOLADOR, CategoriaAtaque.FISICO, 35, 0, true, null));
        ataques.add(new Ataque("Tornado", 40, 100, Tipo.VOLADOR, CategoriaAtaque.ESPECIAL, 35, 0, false, AtributoAtaque.VIENTO)); //
        ataques.add(new Ataque("Vuelo", 90, 95, Tipo.VOLADOR, CategoriaAtaque.FISICO, 15, 0, true, null)); //

        ataques.add(new Ataque("Chupavidas", 80, 100, Tipo.BICHO, CategoriaAtaque.FISICO, 10, 0, true, AtributoAtaque.CURACION)); //
        ataques.add(new Ataque("Disparo Demora", 0, 95, Tipo.BICHO, CategoriaAtaque.ESTADO, 40, 0, false, null));
        ataques.add(new Ataque("Doble Ataque", 25, 100, Tipo.BICHO, CategoriaAtaque.FISICO, 20, 0, false, null)); //
        ataques.add(new Ataque("Pin Misil", 25, 95, Tipo.BICHO, CategoriaAtaque.FISICO, 20, 0, false, null)); //

        ataques.add(new Ataque("Contraataque", 60, 100, Tipo.LUCHA, CategoriaAtaque.FISICO, 20, -5, true, null)); //
        ataques.add(new Ataque("Doble Patada", 30, 100, Tipo.LUCHA, CategoriaAtaque.FISICO, 30, 0, true, null)); //
        ataques.add(new Ataque("Golpe Kárate", 50, 100, Tipo.LUCHA, CategoriaAtaque.FISICO, 25, 0, true, null)); //
        ataques.add(new Ataque("Patada Baja", 60, 100, Tipo.LUCHA, CategoriaAtaque.FISICO, 25, 0, true, null)); //
        ataques.add(new Ataque("Patada Giro", 60, 85, Tipo.LUCHA, CategoriaAtaque.FISICO, 15, 0, true, null)); //
        ataques.add(new Ataque("Patada Salto", 100, 95, Tipo.LUCHA, CategoriaAtaque.FISICO, 10, 0, true, null)); //
        ataques.add(new Ataque("Patada Salto Alta", 130, 90, Tipo.LUCHA, CategoriaAtaque.FISICO, 10, 0, true, null)); //
        ataques.add(new Ataque("Sísmico", 60, 100, Tipo.LUCHA, CategoriaAtaque.FISICO, 20, 0, true, null)); //
        ataques.add(new Ataque("Sumisión", 80, 80, Tipo.LUCHA, CategoriaAtaque.FISICO, 20, 0, true, null)); //

        ataques.add(new Ataque("Lengüetazo", 30, 100, Tipo.FANTASMA, CategoriaAtaque.FISICO, 30, 0, true, null)); //
        ataques.add(new Ataque("Rayo Confuso", 0, 100, Tipo.FANTASMA, CategoriaAtaque.ESTADO, 10, 0, false, null)); //
        ataques.add(new Ataque("Tinieblas", 60, 100, Tipo.FANTASMA, CategoriaAtaque.ESPECIAL, 15, 0, false, null)); //

        ataques.add(new Ataque("Agilidad", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Amnesia", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Barrera", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Comesueños", 100, 100, Tipo.PSIQUICO, CategoriaAtaque.ESPECIAL, 15, 0, false, AtributoAtaque.CURACION)); //
        ataques.add(new Ataque("Confusión", 50, 100, Tipo.PSIQUICO, CategoriaAtaque.ESPECIAL, 25, 0, false, null)); //
        ataques.add(new Ataque("Descanso", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 5, 0, false, AtributoAtaque.CURACION));
        ataques.add(new Ataque("Hipnosis", 0, 60, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Kinético", 0, 80, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 15, 0, false, null));
        ataques.add(new Ataque("Meditación", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 40, 0, false, null));
        ataques.add(new Ataque("Pantalla de Luz", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 30, 0, false, null));
        ataques.add(new Ataque("Psicoonda", 60, 100, Tipo.PSIQUICO, CategoriaAtaque.ESPECIAL, 15, 0, false, null)); //
        ataques.add(new Ataque("Psicorrayo", 65, 100, Tipo.PSIQUICO, CategoriaAtaque.ESPECIAL, 20, 0, false, null)); //
        ataques.add(new Ataque("Psíquico", 90, 100, Tipo.PSIQUICO, CategoriaAtaque.ESPECIAL, 10, 0, false, null)); //
        ataques.add(new Ataque("Reflejo", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Teletransporte", 0, 0, Tipo.PSIQUICO, CategoriaAtaque.ESTADO, 20, -6, false, null));

        ataques.add(new Ataque("Ácido", 40, 100, Tipo.VENENO, CategoriaAtaque.ESPECIAL, 30, 0, false, null)); //
        ataques.add(new Ataque("Armadura Ácida", 0, 0, Tipo.VENENO, CategoriaAtaque.ESTADO, 20, 0, false, null));
        ataques.add(new Ataque("Gas Venenoso", 0, 90, Tipo.VENENO, CategoriaAtaque.ESTADO, 40, 0, false, null));
        ataques.add(new Ataque("Picotazo Venenoso", 15, 100, Tipo.VENENO, CategoriaAtaque.FISICO, 35, 0, false, null)); //
        ataques.add(new Ataque("Polución", 30, 70, Tipo.VENENO, CategoriaAtaque.ESPECIAL, 20, 0, false, null)); //
        ataques.add(new Ataque("Polvo Veneno", 0, 75, Tipo.VENENO, CategoriaAtaque.ESTADO, 35, 0, false, AtributoAtaque.POLVO));
        ataques.add(new Ataque("Residuos", 65, 100, Tipo.VENENO, CategoriaAtaque.ESPECIAL, 20, 0, false, null)); //
        ataques.add(new Ataque("Tóxico", 0, 90, Tipo.VENENO, CategoriaAtaque.ESTADO, 10, 0, false, null));

        ataques.add(new Ataque("Mordisco", 60, 100, Tipo.SINIESTRO, CategoriaAtaque.FISICO, 25, 0, true, AtributoAtaque.MORDISCO)); //

        ataques.add(new Ataque("Furia Dragón", 60, 100, Tipo.DRAGON, CategoriaAtaque.ESPECIAL, 10, 0, false, null)); //



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
