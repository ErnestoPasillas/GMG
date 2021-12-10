package Models;

public enum HeaderMenuEnum {
	
	
	MENS_HEALTH("Men's Health"),
	WOMENS_HEALTH("Women's Health"),
	SEXUAL_HEALTH("Sexual Health"),
	CULTURE_LIFESTYLE_HEEALT("Culture, Lifestyle & Health"),
	BABRE_BY_GIDDY("BARE by Giddy");

	
	private final String menu ;


	/*constructor*/
	HeaderMenuEnum(String menuOption){
		this.menu = menuOption;

	}

	//Metodo getter
	public String getMenuOption()
	{
		return menu;
	}











}
