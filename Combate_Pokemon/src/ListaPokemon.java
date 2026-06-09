    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public class ListaPokemon {
        private static final List<Pokemon> pokemons = new ArrayList<>();
        private static final Map<String, Pokemon> mapaPokemons = new HashMap<>();

        static {
            pokemons.add(new Pokemon(3,"Venusaur", 100, new ArrayList<>(List.of(Tipo.PLANTA, Tipo.VENENO)),
                    80, 82, 83, 100, 100, 80,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Rayo Solar"),
                            ListaAtaque.getAtaque("Somnífero"),
                            ListaAtaque.getAtaque("Drenadoras"),
                            ListaAtaque.getAtaque("Tóxico")
                    ))));

            pokemons.add(new Pokemon(6, "Charizard", 100, new ArrayList<>(List.of(Tipo.FUEGO, Tipo.VOLADOR)),
                    78, 84, 78, 109, 85, 100,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Lanzallamas"),
                            ListaAtaque.getAtaque("Furia Dragón"),
                            ListaAtaque.getAtaque("Ataque Aéreo"),
                            ListaAtaque.getAtaque("Giro Fuego")
                            ))));

            pokemons.add(new Pokemon(9, "Blastoise", 100, new ArrayList<>(List.of(Tipo.AGUA)),
                    79, 83, 100, 85, 105, 78,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Hidrobomba"),
                            ListaAtaque.getAtaque("Surf"),
                            ListaAtaque.getAtaque("Rayo Hielo"),
                            ListaAtaque.getAtaque("Refugio")
                    ))));

            pokemons.add(new Pokemon(12, "Butterfree", 100, new ArrayList<>(List.of(Tipo.BICHO, Tipo.VOLADOR)),
                    60, 45, 50, 90, 80, 70,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Pin Misil"),
                            ListaAtaque.getAtaque("Ataque Ala"),
                            ListaAtaque.getAtaque("Espora"),
                            ListaAtaque.getAtaque("Fortaleza")
                    ))));

            pokemons.add(new Pokemon(15, "Beedrill", 100, new ArrayList<>(List.of(Tipo.BICHO, Tipo.VENENO)),
                    65, 90, 40, 45, 80, 75,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Picotazo Venenoso"),
                            ListaAtaque.getAtaque("Golpes Furia"),
                            ListaAtaque.getAtaque("Pin Misil"),
                            ListaAtaque.getAtaque("Tóxico")
                    ))));

            pokemons.add(new Pokemon(18, "Pidgeot", 100, new ArrayList<>(List.of(Tipo.NORMAL, Tipo.VOLADOR)),
                    83, 80, 75, 70, 70, 101,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Ataque Rápido"),
                            ListaAtaque.getAtaque("Vuelo"),
                            ListaAtaque.getAtaque("Tornado"),
                            ListaAtaque.getAtaque("Látigo")
                    ))));

            pokemons.add(new Pokemon(20, "Raticate", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    55, 81, 60, 50, 70, 97,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Superdiente"),
                            ListaAtaque.getAtaque("Hipercolmillo"),
                            ListaAtaque.getAtaque("Ataque Rápido"),
                            ListaAtaque.getAtaque("Mordisco")
                    ))));

            pokemons.add(new Pokemon(22, "Ferow", 100, new ArrayList<>(List.of(Tipo.NORMAL, Tipo.VOLADOR)),
                    65, 90, 65, 61, 61, 100,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Ataque Aéreo"),
                            ListaAtaque.getAtaque("Pico Taladro"),
                            ListaAtaque.getAtaque("Doble Equipo"),
                            ListaAtaque.getAtaque("Foco Energía")
                    ))));

            pokemons.add(new Pokemon(24, "Arbok", 100, new ArrayList<>(List.of(Tipo.VENENO)),
                    60, 95, 69, 65, 79, 80,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Residuos"),
                            ListaAtaque.getAtaque("Tóxico"),
                            ListaAtaque.getAtaque("Mordisco"),
                            ListaAtaque.getAtaque("Excavar")
                    ))));

            pokemons.add(new Pokemon(26, "Raichu", 100, new ArrayList<>(List.of(Tipo.ELECTRICO)),
                    60, 90, 55, 90, 80, 110,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque("Ataque Rápido"),
                            ListaAtaque.getAtaque("Doble Equipo"),
                            ListaAtaque.getAtaque("Rayo"),
                            ListaAtaque.getAtaque("Trueno")
                    ))));

            pokemons.add(new Pokemon(28, "Sandslash", 100, new ArrayList<>(List.of(Tipo.TIERRA)),
                    75, 100, 110, 45, 55, 65,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(31, "Nidoqueen", 100, new ArrayList<>(List.of(Tipo.VENENO, Tipo.TIERRA)),
                    90, 92, 87, 75, 85, 76,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(34, "Nidoking", 100, new ArrayList<>(List.of(Tipo.VENENO, Tipo.TIERRA)),
                    81, 102, 77, 85, 75, 85,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(36, "Clefable", 100, new ArrayList<>(List.of(Tipo.HADA)),
                    95, 70, 73, 95, 90, 60,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(38, "Ninetales", 100, new ArrayList<>(List.of(Tipo.FUEGO)),
                    73, 76, 75, 81, 100, 100,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(40, "Wigglytuff", 100, new ArrayList<>(List.of(Tipo.NORMAL, Tipo.HADA)),
                    140, 70, 45, 85, 50, 45,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(42, "Golbat", 100, new ArrayList<>(List.of(Tipo.VENENO, Tipo.VOLADOR)),
                    75, 80, 70, 65, 75, 90,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(45, "Vileplume", 100, new ArrayList<>(List.of(Tipo.PLANTA, Tipo.VENENO)),
                    75, 80, 85, 110, 90, 50,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(47, "Parasect", 100, new ArrayList<>(List.of(Tipo.BICHO, Tipo.PLANTA)),
                    60, 95, 80, 60, 80, 30,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(49, "Venomoth", 100, new ArrayList<>(List.of(Tipo.BICHO, Tipo.VENENO)),
                    70, 65, 60, 90, 75, 90,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(51, "Dugtrio", 100, new ArrayList<>(List.of(Tipo.TIERRA)),
                    35, 100, 50, 50, 70, 120,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(53, "Persian", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    65, 70, 60, 65, 65, 115,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(55, "Golduck", 100, new ArrayList<>(List.of(Tipo.AGUA)),
                    80, 82, 78, 95, 80, 85,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(57, "Primeape", 100, new ArrayList<>(List.of(Tipo.LUCHA)),
                    65, 105, 60, 60, 70, 95,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(59, "Arcanine", 100, new ArrayList<>(List.of(Tipo.FUEGO)),
                    90, 110, 80, 100, 80, 95,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(62, "Poliwrath", 100, new ArrayList<>(List.of(Tipo.AGUA, Tipo.LUCHA)),
                    90, 95, 95, 70, 90, 70,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(65, "Alakazam", 100, new ArrayList<>(List.of(Tipo.PSIQUICO)),
                    55, 50, 45, 135, 95, 120,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(68, "Machamp", 100, new ArrayList<>(List.of(Tipo.LUCHA)),
                    90, 130, 80, 65, 85, 55,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(71, "Victreebel", 100, new ArrayList<>(List.of(Tipo.PLANTA, Tipo.VENENO)),
                    80, 105, 65, 100, 70, 70,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(73, "Tentacruel", 100, new ArrayList<>(List.of(Tipo.AGUA, Tipo.VENENO)),
                    80, 70, 65, 80, 120, 100,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(76, "Golem", 100, new ArrayList<>(List.of(Tipo.ROCA, Tipo.TIERRA)),
                    80, 120, 130, 55, 65, 45,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(78, "Rapidash", 100, new ArrayList<>(List.of(Tipo.FUEGO)),
                    65, 100, 70, 80, 80, 105,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(80, "Slowbro", 100, new ArrayList<>(List.of(Tipo.AGUA, Tipo.PSIQUICO)),
                    95, 75, 110, 100, 80, 30,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(82, "Magneton", 100, new ArrayList<>(List.of(Tipo.ELECTRICO, Tipo.ACERO)),
                    50, 60, 95, 120, 70, 70,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(83, "Farfetch'd", 100, new ArrayList<>(List.of(Tipo.NORMAL, Tipo.VOLADOR)),
                    52, 90, 55, 58, 62, 60,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(85, "Dodrio", 100, new ArrayList<>(List.of(Tipo.NORMAL, Tipo.VOLADOR)),
                    60, 110, 70, 60, 60, 110,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(87, "Dewgong", 100, new ArrayList<>(List.of(Tipo.AGUA, Tipo.HIELO)),
                    90, 70, 80, 70, 95, 70,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(89, "Muk", 100, new ArrayList<>(List.of(Tipo.VENENO)),
                    105, 105, 75, 65, 100, 50,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(91, "Cloyster", 100, new ArrayList<>(List.of(Tipo.AGUA, Tipo.HIELO)),
                    50, 95, 180, 85, 45, 70,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(94, "Gengar", 100, new ArrayList<>(List.of(Tipo.FANTASMA, Tipo.VENENO)),
                    60, 65, 60, 130, 75, 110,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(95, "Onix", 100, new ArrayList<>(List.of(Tipo.ROCA, Tipo.TIERRA)),
                    35, 45, 160, 30, 45, 70,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(97, "Hypno", 100, new ArrayList<>(List.of(Tipo.PSIQUICO)),
                    85, 73, 70, 73, 115, 67,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(99, "Kingler", 100, new ArrayList<>(List.of(Tipo.AGUA)),
                    55, 130, 115, 50, 50, 75,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(101, "Electrode", 100, new ArrayList<>(List.of(Tipo.ELECTRICO)),
                    60, 50, 70, 80, 80, 150,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(103, "Exeggutor", 100, new ArrayList<>(List.of(Tipo.PLANTA, Tipo.PSIQUICO)),
                    95, 95, 85, 125, 75, 55,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(105, "Marowak", 100, new ArrayList<>(List.of(Tipo.TIERRA)),
                    60, 80, 110, 50, 80, 45,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(106, "Hitmonlee", 100, new ArrayList<>(List.of(Tipo.LUCHA)),
                    50, 120, 53, 35, 110, 87,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(107, "Hitmonchan", 100, new ArrayList<>(List.of(Tipo.LUCHA)),
                    50, 105, 79, 35, 110, 76,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(108, "Lickitung", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    90, 55, 75, 60, 75, 30,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(110, "Weezing", 100, new ArrayList<>(List.of(Tipo.VENENO)),
                    65, 90, 120, 85, 70, 60,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(112, "Rhydon", 100, new ArrayList<>(List.of(Tipo.TIERRA, Tipo.ROCA)),
                    105, 130, 120, 45, 45, 40,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(113, "Chansey", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    250, 5, 5, 35, 105, 50,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(114, "Tangela", 100, new ArrayList<>(List.of(Tipo.PLANTA)),
                    65, 55, 115, 100, 40, 60,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(115, "Kangaskhan", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    105, 95, 80, 40, 80, 90,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(117, "Seadra", 100, new ArrayList<>(List.of(Tipo.AGUA)),
                    55, 65, 95, 95, 45, 85,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(119, "Seaking", 100, new ArrayList<>(List.of(Tipo.AGUA)),
                    80, 92, 65, 65, 80, 68,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(121, "Starmie", 100, new ArrayList<>(List.of(Tipo.AGUA, Tipo.PSIQUICO)),
                    60, 75, 85, 100, 85, 115,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(122, "Mr. Mime", 100, new ArrayList<>(List.of(Tipo.PSIQUICO, Tipo.HADA)),
                    40, 45, 65, 100, 120, 90,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(123, "Scyther", 100, new ArrayList<>(List.of(Tipo.BICHO, Tipo.VOLADOR)),
                    70, 110, 80, 55, 80, 105,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(124, "Jynx", 100, new ArrayList<>(List.of(Tipo.HIELO, Tipo.PSIQUICO)),
                    65, 50, 35, 115, 95, 95,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(125, "Electabuzz", 100, new ArrayList<>(List.of(Tipo.ELECTRICO)),
                    65, 83, 57, 95, 85, 105,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(126, "Magmar", 100, new ArrayList<>(List.of(Tipo.FUEGO)),
                    65, 95, 57, 100, 85, 93,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(127, "Pinsir", 100, new ArrayList<>(List.of(Tipo.BICHO)),
                    65, 125, 100, 55, 70, 85,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(128, "Tauros", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    75, 100, 95, 40, 70, 110,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(130, "Gyarados", 100, new ArrayList<>(List.of(Tipo.AGUA, Tipo.VOLADOR)),
                    95, 125, 79, 60, 100, 81,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(131, "Lapras", 100, new ArrayList<>(List.of(Tipo.AGUA, Tipo.HIELO)),
                    130, 85, 80, 85, 95, 60,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(132, "Ditto", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    48, 48, 48, 48, 48, 48,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(134, "Vaporeon", 100, new ArrayList<>(List.of(Tipo.AGUA)),
                    130, 65, 60, 110, 95, 65,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(135, "Jolteon", 100, new ArrayList<>(List.of(Tipo.ELECTRICO)),
                    65, 65, 60, 110, 95, 130,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(136, "Flareon", 100, new ArrayList<>(List.of(Tipo.FUEGO)),
                    65, 130, 60, 95, 110, 65,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(137, "Porygon", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    65, 60, 70, 85, 75, 40,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(139, "Omastar", 100, new ArrayList<>(List.of(Tipo.ROCA, Tipo.AGUA)),
                    70, 60, 125, 115, 70, 55,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(141, "Kabutops", 100, new ArrayList<>(List.of(Tipo.ROCA, Tipo.AGUA)),
                    60, 115, 105, 65, 70, 80,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(142, "Aerodactyl", 100, new ArrayList<>(List.of(Tipo.ROCA, Tipo.VOLADOR)),
                    80, 105, 65, 60, 75, 130,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(143, "Snorlax", 100, new ArrayList<>(List.of(Tipo.NORMAL)),
                    160, 110, 65, 65, 110, 30,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(144, "Articuno", 100, new ArrayList<>(List.of(Tipo.HIELO, Tipo.VOLADOR)),
                    90, 85, 100, 95, 125, 85,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(145, "Zapdos", 100, new ArrayList<>(List.of(Tipo.ELECTRICO, Tipo.VOLADOR)),
                    90, 90, 85, 125, 90, 100,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(146, "Moltres", 100, new ArrayList<>(List.of(Tipo.FUEGO, Tipo.VOLADOR)),
                    90, 100, 90, 125, 85, 90,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(149, "Dragonite", 100, new ArrayList<>(List.of(Tipo.DRAGON, Tipo.VOLADOR)),
                    91, 134, 95, 100, 100, 80,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(150, "Mewtwo", 100, new ArrayList<>(List.of(Tipo.PSIQUICO)),
                    106, 110, 90, 154, 90, 130,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            pokemons.add(new Pokemon(151, "Mew", 100, new ArrayList<>(List.of(Tipo.PSIQUICO)),
                    100, 100, 100, 100, 100, 100,
                    new ArrayList<>(List.of(
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque(""),
                            ListaAtaque.getAtaque("")
                    ))));

            for (Pokemon pokemon : pokemons) {
                mapaPokemons.put(pokemon.getNombre(), pokemon);
            }
        }

        public static List<Pokemon> getListaPokemons (){
            return pokemons;
        }

        public static Pokemon getPokemon(String nombre) {
            return mapaPokemons.get(nombre);
        }
    }
