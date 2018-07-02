class Bartender{
	public static void main(String[] args){
		int leeftijd = 17;

		if(leeftijd < 16) {
			System.out.println("Je bent te jong om te drinken");
		}else if (leeftijd < 18) {
			System.out.println("Je mag wel bier, maar geen sterke drank drinken.");
		}else 
			System.out.println("Geniet maar drink met mate");
	}
}