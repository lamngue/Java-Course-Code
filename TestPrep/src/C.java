
public class C {

	public C() {
		// TODO Auto-generated constructor stub
	}
	public static double binomial(int n, int k) {
		double binom = 1;
		double numer = n - k;
		double denom = 0;
		for(int i = 0 ; i< k; i++) {
			numer++;
			denom++;
			binom = binom* numer;
			binom = binom / denom;
		}
		return binom;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		System.out.println(binomial(n,k));

	}

}
