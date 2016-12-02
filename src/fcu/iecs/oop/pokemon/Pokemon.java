package fcu.iecs.oop.pokemon;

public class Pokemon {
	private String name;
	private int cp;
	private PokemonType type;
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public PokemonType getType() {
		return type;
	}
	public Pokemon(String name,PokemonType type,int cp)
	{
		this.name=name;
		this.cp=cp;
		this.type=type;
	}
}
