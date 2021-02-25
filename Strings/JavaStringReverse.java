import java.io.*;
import java.util.*;

public class JavaStringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		char aux;
		boolean yes = false;

		for (int i = 0; i < A.length(); i++) {

			aux = A.charAt(A.length() - 1 - i);

			if (A.charAt(i) == aux) {
				yes = true;
			} else {
				break;
			}
		}

		if (yes) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
