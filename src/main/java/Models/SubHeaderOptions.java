package Models;

public enum SubHeaderOptions {

	
	ERECTILE_DYSFUNCTION("Understanding Erectile Dysfunction"),
	MENS_FERTILITY("Understanding Men's Fertility"),
	PENIS_AND_TESTICLE_HEALTH("Understanding Your Penis and Testicles"),
	PROSTATE_HEALTH("Understanding Your Prostate"),	
	BREAST_HEALTH ("Understanding Your Breasts"),
	VAGINAL_HEALTH("Understanding Your Vagina"),
	WOMENS_FERTILITY("Understanding Women's Fertility"),
	WOMENS_REPRODUCTIVE_HEALTH("Understanding Reproductive Health"),
	GROOMING_AND_HYGIENE("Women's Grooming and Hygiene"),
	DATING_AND_RELATIONSHIPS("Communication in Relationships"),
	SEX("Sex 101"),
	STDS_STIS ("Understanding STDs/STIs"),
	LIFESTYLE_AND_HEALTH ("Understanding Your Physical Health"),
	MENTAL_HEALTH("Understanding Your Mental Health"),
	CULTURE_AND_IDENTITY ("Identity and Sexuality");


	private final String subMenu ;
	
	
	
	/*constructor*/
	SubHeaderOptions(String subMenuOption){
		this.subMenu = subMenuOption;
	}
	
	
	//Metodo getter 
	
	public String getSubMenuOption()
	{
		return subMenu;
	}
	
	
}
