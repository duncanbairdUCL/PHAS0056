package module6;

public class PowerLawTheory implements Theory {

	private double n;

	public PowerLawTheory(double n) {
		this.n = n;
	}

	public double y(double x) {
		return Math.pow(x, n);
	}

	@Override
	public String toString() {
		return "x^" + n;
	}
}
