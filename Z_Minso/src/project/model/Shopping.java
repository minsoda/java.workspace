package project.model;

import java.util.Objects;

public class Shopping {

	private String kind;
	private String name;
	private int price;
	
	public Shopping() {}
	
	public Shopping(String kind, String name, int price) {
		this.kind = kind;
		this.name = name;
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Shopping [kind=" + kind + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kind, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shopping other = (Shopping) obj;
		return Objects.equals(kind, other.kind) && Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
}
