package hello;

public class Breakfast {

	private long id;
	private String name;
	private float price;
	private long numsOfCalories;
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public long getNumsOfCalories() {
		return numsOfCalories;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setNumsOfCalories(long numsOfCalories) {
		this.numsOfCalories = numsOfCalories;
	}
	
	Breakfast(long id, String name, float price, long numsOfCalories) {
		//super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.numsOfCalories = numsOfCalories;
	}
	
	Breakfast(){
		this.id = 0;
		this.name = "xoi";
		this.price = 10000;
		this.numsOfCalories = 1500;
		
	}
	
}
