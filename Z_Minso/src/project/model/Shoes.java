package project.model;

public class Shoes extends Shopping {

	public Shoes(String name) {
		super("신발", name);
	}
	
	public Shoes(String name, int price) {
		super("신발", name, price);
	}

}
