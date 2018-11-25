import java.util.Scanner;
public class namNhuan {

	public namNhuan() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input a year:");
		int year = scanner.nextInt();
		if((year %4 ==0) && (year %100 !=0)) {
			System.out.print("Nam nhuan");
		}
		else if((year % 400 == 0)) {
			System.out.print("Nam nhuan");
		}
		else {
			System.out.print("Nam nhuan clmm");
		}
	}
	
	
}
