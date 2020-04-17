package taco_rice;

public class Chef {
	// 材料
	private int lettuce;		// レタス
	private int mini_tomato;	// ミニトマト
	private int rice;			// ごはん
	private int minced_meat;	// ひき肉
	private int cheese;			// チーズ
	
	// 調味料
	private String garlic = "小さじ1";		// ニンニク
	private String ketchup = "大さじ1";		// ケチャップ
	private String liquor = "大さじ1";		// 酒
	private String soySauce = "大さじ1";		// 醤油
	private String salt = "少々";			// 塩
	private String pepper = "少々";			// コショウ

	// その他
	private String salad_oil = "大さじ1/2";	// サラダ油
	
	// 準備する
	Chef() {
		lettuce = 2;//枚
		mini_tomato = 6;//個
		rice = 2;//膳
		minced_meat = 150;//g
		cheese = 20;//g
	}
	
	// 切る
	String cut(int num) {
		if(num == 1000) {
			this.lettuce = lettuce / num;
			return "shredded_lettuce";
		}
		else if(num == 4) {
			this.mini_tomato = mini_tomato / num;
			return "quarter_mini_tomato";
		}
		else {
			return "That's wrong";
		}
	}
	
	// 調味料をまぜる
	String seasoning(String garlic, String ketchup, String liquor, String soySauce, String salt, String pepper) {
		String[] all_seasoning = {garlic, ketchup, liquor, soySauce, salt, pepper};
		String[] correct_amount = {this.garlic, this.ketchup, this.liquor, this.soySauce, this.salt, this.pepper};
		
		for(int i=0;i<all_seasoning.length;i++) {
			if(all_seasoning[i].equals(correct_amount[i])) {
				if(i == all_seasoning.length-1) {
					return "correct_seasoning";
				}
			}
			else break;
		}
		
		return "That's wrong";
	}
	
	// 炒める
	String stirFry(String salad_oil, String seasoning) {
		if(this.salad_oil.equals(salad_oil)) {
			// フライパンにサラダ油をひく
			Object[] frying_pan = new Object[3];
			frying_pan[0] = salad_oil;
			// ひき肉を炒める
			frying_pan[1] = this.minced_meat;
			// 火が通ったら
			while(true) {
				if(frying_pan[1].equals("cooked_meat")) {
					break;
				}
				frying_pan[1] = "cooked_meat";
			}
			// 調味料を加える
			if(seasoning.equals("correct_seasoning")) {
				frying_pan[2] = seasoning;
			} 
			else return "That's wrong";
			// 汁気がなくなったら
			while(true) {
				if(frying_pan[2].equals("no water")) {
					break;
				}
				frying_pan[2] = "no water";
			}
			return "seasoned_minced_meat";
		}
		else return "That's wrong";
	}
	
	// 盛り付ける
	TacoRice dishUp(String lettuce, String mini_tomato, String minced_meat) {
		String rice = "rice";
		String cheese = "cheese";
		return new TacoRice(lettuce, mini_tomato, rice, minced_meat, cheese);
	}
}
