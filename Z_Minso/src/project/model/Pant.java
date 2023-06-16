package project.model;

public class Pant extends Shopping {

	public Pant(String name) {
		super("하의", name);
	}
	
	public Pant(String name, int price) {
		super("하의" , name, price);
	}
}
