package fcu.iecs.oop.pokemon;

public class GYM {
	public static Player fight(Player a,Player b)
	{
		int win1=0;
		int win2=0;
		PokemonType type1,type2;
		int i;
		for(i=0;i<=2;i++)
		{
			type1=a.getPokemons()[i].getType();
			type2=b.getPokemons()[i].getType();
			if(type1==PokemonType.FIRE&&type2==PokemonType.WATER)
			{
				win2++;
			}
			else if(type1==PokemonType.FIRE&&type2==PokemonType.GRASS)
			{
				win1++;
			}
			else if(type1==PokemonType.WATER&&type2==PokemonType.FIRE)
			{
				win1++;
			}
			else if(type1==PokemonType.WATER&&type2==PokemonType.GRASS)
			{
				win2++;
			}
			else if(type1==PokemonType.GRASS&&type2==PokemonType.FIRE)
			{
				win2++;
			}
			else if(type1==PokemonType.GRASS&&type2==PokemonType.WATER)
			{
				win1++;
			}
			else
			{
				if(a.getPokemons()[i].getCp()>b.getPokemons()[i].getCp())
				{
					win1++;
				}
				else if(a.getPokemons()[i].getCp()<b.getPokemons()[i].getCp())
				{
					win2++;
				}
				else
				{
					int number;
					number=(int)(Math.random()*10);
					if(number%2==0)
					{
						win1++;
					}
					else
					{
						win2++;
					}
				}
			}
		}
		if(win1>win2)
		{
			a.setLevel(a.getLevel()+1);
			System.out.println("Winner is "+a.getPlayerName()+", and his/her level becomes "+a.getLevel()+".");
			return a;
		}
		else
		{
			b.setLevel(b.getLevel()+1);
			System.out.println("Winner is "+b.getPlayerName()+", and his/her level becomes "+b.getLevel()+".");
			return b;
		}
	}

}
