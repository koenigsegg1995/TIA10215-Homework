package hw5.pen;

public class Pencil extends Pen{
	
	public Pencil() {
		super();
	}
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public double getPrice() {
		return super.getPrice() * 0.8;
	}

}
