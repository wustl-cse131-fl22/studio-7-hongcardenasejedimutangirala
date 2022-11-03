package studio7;

public class RectangleTester {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,5);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		System.out.println(r.isSquare());
		Rectangle r2 = new Rectangle(7,6);
		System.out.println(r.isSmaller(r2));

		Die d = new Die (10);
		for (int i = 0; i < 10; i++) {
			System.out.println(d.result());
		}
	}
}

