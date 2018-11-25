import java.util.Scanner;

public class Insao {

	public Insao() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		/*
		int n = 5;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		Scanner scanner =new Scanner(System.in);
		int number = scanner.nextInt();
		int remainder;
		int sum = 0;
		while(number>0) {
			remainder = number % 10;
			sum += remainder;
			number = number /10;
		}
		System.out.println(sum);
	}

}
