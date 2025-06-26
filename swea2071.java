import java.util.Scanner;

public class swea2071 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i=0; i<T; i++) {
			float sum=0;
			for (int j=0; j<10; j++) {
				int num = sc.nextInt();
				sum = num + sum;
			}
			System.out.println("#" + (i+1) + " " + Math.round(sum/10));
		}
	}
}
