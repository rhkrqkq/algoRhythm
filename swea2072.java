import java.util.Scanner;

public class swea2072 {

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i=0; i<T; i++) {
			int sum=0;

			for (int j=0; j<10; j++) {
				int num = sc.nextInt();
				if (num%2!=0) {
					sum = sum + num;
				}

			}
			System.out.println("#" + (i+1) +" " +  sum);
			sum=0;
		}
	}
}
