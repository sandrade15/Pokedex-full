import { useEffect, useState } from "react";
import { listarPokemons } from "./services/pokemonService";

function App() {
    const [pokemons, setPokemons] = useState([]);
    const [carregando, setCarregando] = useState(true);

    useEffect(() => {
        async function buscarPokemons() {
            try {
                const dados = await listarPokemons();
                setPokemons(dados);
            } catch (error) {
                console.error(error);
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
        <div>
            <h1>Pokédex</h1>

            {pokemons.map((pokemon) => (
                <div key={pokemon.id}>
                    <h2>{pokemon.name}</h2>
                    <p>Tipo: {pokemon.type_1}</p>
                    <p>HP: {pokemon.hp}</p>
                </div>
            ))}
        </div>
    );
}

export default App;