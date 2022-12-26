public abstract class TangibleAsset{

	private String name;
	private int price;
	priavate String color;
  
	public TangibleAsset(String name, int price, String color) {
		 this.name = name;
		 this.price = price;
		 this.color = color;
	 }

	 public String getName() { return this.name;}
	 public int price() { return this.price;}
	 public String color() { return this.color;}



}
