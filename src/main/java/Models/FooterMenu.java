package Models;

public enum FooterMenu {
	
	
	ABOUT_US("About Us"),

	MEDICAL_REVIEW("Medical Review"),

	TERNMS_GLOSSARY("Terms Glossary"),

	OUR_AUTHORS("Our Authors"),
	
	TERMS_AND_CONDITIONS("Terms & Conditions"),
	
	PRIVACY_POLICY("Privacy Policy"),
	
	COOKIE_POLICY("Cookie Policy");	
	
	private final String footer;
	
	
	
	/*constructor*/
	FooterMenu(String footerOption){
		this.footer = footerOption;
	}
	
	
	//Metodo getter 
	
	public String getFooterOption()
	{
		return footer;
	}

}
