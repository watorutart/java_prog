package taco_rice;

public class ProfessionalCooking {
	public static void main(String[] args) {
		TacoRiceSpecialtyChef specialChef = new TacoRiceSpecialtyChef();
		TacoRice dinner = specialChef.cookTacorice();
		
		dinner.eat();
	}
}
