import java.util.*;
import java.io.*;

public class JavaLoopsII {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int somatorio = 0;
			somatorio += a + 1 * b;

			for (int j = 1; j <= n; j++) {
				System.out.printf("%d ", somatorio);
				somatorio += Math.pow(2, j) * b;
			}

			System.out.println();
		}
		in.close();
	}
}