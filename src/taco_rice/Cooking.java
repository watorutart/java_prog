package taco_rice;

public class Cooking {

	public static void main(String[] args) {
		// 料理人と材料を用意
		Chef chef = new Chef();
		
		// 材料を切る
		// レタスを切る
		String lettuce = chef.cut(1000);
		// ミニトマトを切る
		String mini_tomato = chef.cut(4);
		
		// 調味料を作る
		String garlic = "小さじ1";		// ニンニク
		String ketchup = "大さじ1";		// ケチャップ
		String liquor = "大さじ1";		// 酒
		String soySauce = "大さじ1";		// 醤油
		String salt = "少々";			// 塩
		String pepper = "少々";			// コショウ
		
		String seasoning = chef.seasoning(garlic, ketchup, liquor, soySauce, salt, pepper);

		// 炒める
		String salad_oil = "大さじ1/2";
		String minced_meat = chef.stirFry(salad_oil, seasoning);

		// 盛り付ける
		TacoRice tacoRice = chef.dishUp(lettuce, mini_tomato, minced_meat);
		
		tacoRice.eat();
	}

}
