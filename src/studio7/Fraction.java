package studio7;

public class Fraction {
	
	int numerator;
	int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public Fraction fractionSum(Fraction f) {
		int d = this.denominator * f.getDenominator();
		int n = this.numerator*f.getDenominator()+this.denominator*f.getNumerator();
		
		return new Fraction(n, d);
	}
	public String toString (int n, int d) {
		return n+"/"+d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
