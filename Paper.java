public class Paper extends TangibleAsset{
	private String date;
	public Paper(String name, int price, String color, String date){
		super(name,price,color);
		this.date = date;
	}
	public String getDate(){
		return this.date;
	}
}

