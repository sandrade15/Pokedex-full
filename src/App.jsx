import { useEffect, useState } from "react";
import { listarPokemons } from "./services/pokemonService";
import PokemonCard from "../components/PokemonCard";
import "./App.css";

function App() {

    const [pokemons, setPokemons] = useState([]);
    const [carregando, setCarregando] = useState(true);

    useEffect(() => {

        async function buscarPokemons() {
            try {
                const dados = await listarPokemons();
                setPokemons(dados);

            } catch (error) {
                console.error("Erro ao buscar Pokémon:", error);

            } finally {
                setCarregando(false);
            }
        }

        buscarPokemons();

    }, []);

    if (carregando) {
        return <p>Carregando Pokémon...</p>;
    }

    return (
        <main className="pokedex-container">

            <h1>Pokédex</h1>

            <div className="pokemon-grid">

                {pokemons.map((pokemon) => (
                    <PokemonCard
                        key={pokemon.id}
                        pokemon={pokemon}
                    />
                ))}

            </div>

        </main>
    );
}

export default App;