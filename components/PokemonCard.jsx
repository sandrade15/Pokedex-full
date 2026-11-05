function PokemonCard({ pokemon }) {

    const imagem = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${pokemon.id}.png`;

    const tipoPrincipal = pokemon.type1?.toLowerCase() || "normal";

    const tipoSecundario = pokemon.type2?.trim();

    return (
        <article className={`pokemon-card type-${tipoPrincipal}`}>

            <span className="pokemon-number">
                #{String(pokemon.id).padStart(3, "0")}
            </span>

            <span className="pokemon-name">
            <h2>{pokemon.name}</h2>
            </span>

            <div className="pokemon-image">
                <img
                    src={imagem}
                    alt={`Imagem de ${pokemon.name}`}
                    loading="lazy"
                />
            </div>

            <div className="pokemon-types">

                <span className={`type-badge type-${tipoPrincipal}`}>
                    {pokemon.type1}
                </span>

                {tipoSecundario && (
                    <span className={`type-badge type-${tipoSecundario.toLowerCase()}`}>
                        {tipoSecundario}
                    </span>
                )}

            </div>

            <div className="pokemon-stats">
                <p>HP: {pokemon.hp}</p>
                <p>Ataque: {pokemon.attack}</p>
                <p>Defesa: {pokemon.defense}</p>
            </div>

        </article>
    );
}

export default PokemonCard;