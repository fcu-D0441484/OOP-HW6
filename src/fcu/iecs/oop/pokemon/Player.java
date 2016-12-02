package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName;
	private Pokemon pokemons[]=new Pokemon[10];
	private int level;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Player(String player)
	{
		level=1;
		this.playerName=player;
	}

}
