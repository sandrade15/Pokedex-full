const API_URL = "http://localhost:8080/pokemon";

export async function listarPokemons() {
    const response = await fetch(API_URL);

    if (!response.ok) {
        throw new Error("erro ao buscar Pokémon");
    }

    return await response.json();
}