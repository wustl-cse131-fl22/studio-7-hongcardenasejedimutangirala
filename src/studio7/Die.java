package studio7;

public class Die {
	
	int n = 0;
	
	public Die (int n) {
		this.n = n;
	}
	public int result() {
		return (int)(Math.random()*n);
	}

//	public static void main(String[] args) {
//		Die d = new Die (10);
//		for (int i = 0; i < 10; i++) {
//			System.out.println(d.result());
//		}

//	}

}