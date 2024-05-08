package hw5.pen;

public class InkBrush extends Pen{
	
	public InkBrush() {
		
	}
	
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public double getPrice() {
		return super.getPrice() * 0.9;
	}
	
}
