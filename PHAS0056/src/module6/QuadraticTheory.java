package module6;

public class QuadraticTheory implements Theory {

	private double a;
	private double b;
	private double c;

	public QuadraticTheory(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// quadratic function
	public double y(double x) {
		return (a * Math.pow(x, 2) + b * x + c);
	}

	// to string for quadratic object
	@Override
	public String toString() {
		return a + "x^2 + " + b + "x + " + c;
	}
}
