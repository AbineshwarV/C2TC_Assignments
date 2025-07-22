package entityclassassignment2;

public class ProductDetails {

	public static void main(String[] args) {

		Product p1 = new Product();
		p1.setPid(101);
		p1.setPname("Book");
		p1.setPprice(40);
		System.out.println(p1);
		System.out.println("-----------------------------------------------");

		Product p2 = new Product();
		p2.setPid(102);
		p2.setPname("Pen");
		p2.setPprice(10);
		System.out.println(p2);
		System.out.println("-----------------------------------------------");
		
		Product p3 = new Product();
		p3.setPid(103);
		p3.setPname("Paint Box");
		p3.setPprice(120);
		System.out.println(p3);
		System.out.println("-----------------------------------------------");

		Product p4 = new Product();
		p4.setPid(104);
		p4.setPname("Marker");
		p4.setPprice(60);
		System.out.println(p4);
		System.out.println("-----------------------------------------------");
	}



}
