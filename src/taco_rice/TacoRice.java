package taco_rice;

public class TacoRice {
	private String lettuce = "shredded_lettuce";	// 千切りレタス
	private String mini_tomato = "quarter_mini_tomato";	// 1/4カットミニトマト
	private String rice;	// ごはん
	private String minced_meat = "seasoned_minced_meat";	// 味付けしたひき肉
	private String cheese;
	
	private String taste;
	
	TacoRice(String lettuce, String mini_tomato, String rice, String minced_meat, String cheese) {
		this.lettuce = lettuce;
		this.mini_tomato = mini_tomato;
		this.rice = rice;
		this.minced_meat = minced_meat;
		this.cheese = cheese;
		
		taste = this.judgeTaste();
	}
	
	void eat() {
		System.out.println(taste);
	}
	
	private String judgeTaste() {
		String t1 = "";
		String t2 = "";
		String t3 = "";
		if(!this.lettuce.equals("That's wrong")) {
			t1 = "del";
		} else t1 = "f";
		if(!this.mini_tomato.equals("That's wrong")) {
			t2 = "ici";
		} else t2 = "uc";
		if(!this.minced_meat.equals("That's wrong")) {
			t3 = "ous";
		} else t3 = "k";
		
		return t1 + t2 + t3 + "!";
	}
}
