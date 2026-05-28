    import java.util.ArrayList;
    import java.util.List;

    public class ListaPokemon {
        private static final List<Pokemon> pokemons = new ArrayList<>();

        static {
            pokemons.add(new Pokemon(1,"Bulbasaur", 100, Tipo.PLANTA,
                    45, 49, 49, 65, 65, 45,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(1)
                    ))));
            pokemons.add(new Pokemon(2,"Ivysaur", 100, Tipo.PLANTA,
                    60, 62, 63, 80, 80, 60,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(2)
                    ))));
            pokemons.add(new Pokemon(3,"Venusaur", 100, Tipo.PLANTA,
                    80, 82, 83, 100, 100, 80,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(3)
                    ))));

            pokemons.add(new Pokemon(4, "Charmander", 100, Tipo.FUEGO,
                    39, 52, 43, 60, 50, 65,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(4)
                    ))));
            pokemons.add(new Pokemon(5, "Charmeleon", 100, Tipo.FUEGO,
                    58, 64, 58, 80, 65, 80,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(5)
                    ))));
            pokemons.add(new Pokemon(6, "Charizard", 100, Tipo.FUEGO,
                    78, 84, 78, 109, 85, 100,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(6)
                    ))));

            pokemons.add(new Pokemon(7, "Squirtle", 100, Tipo.AGUA,
                    44, 48, 65, 50, 64, 43,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(7)
                    ))));
            pokemons.add(new Pokemon(8, "Wartortle", 100, Tipo.AGUA,
                    59, 63, 80, 65, 80, 58,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(8)
                    ))));
            pokemons.add(new Pokemon(9, "Blastoise", 100, Tipo.AGUA,
                    79, 83, 100, 85, 105, 78,
                    new ArrayList<>(List.of(
                            ListaAtaque.getListaAtaques().get(0),
                            ListaAtaque.getListaAtaques().get(9)
                    ))));
        }

        public static List<Pokemon> getListaPokemons (){
            return pokemons;
        }
    }
