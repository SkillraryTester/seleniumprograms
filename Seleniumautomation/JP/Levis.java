package demo1;

public interface Levis {
	public void jeans();

}

interface Puma extends Levis
{
	public void shoes();
}

class Shop implements Puma
{

	public void jeans() {
		System.out.println("90% off");
		
	}

	
	public void shoes() {
		System.out.println("20% off in the shoes");
		
	}
	
	public static void main(String[] args) {
		Shop s=new Shop();
		s.jeans();
		s.shoes();
	}
	
}
