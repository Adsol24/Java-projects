public class rectangle1 {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();

		Rectangle rectangle2 = new Rectangle();

		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle1.width);
		System.out.println("Height:    " + rectangle1.height);
		System.out.println("Area:      " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());

		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle2.width);
		System.out.println("Height:    " + rectangle2.height);
		System.out.println("Area:      " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter());
		
	}
}