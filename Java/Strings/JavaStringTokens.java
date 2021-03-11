import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        StringTokenizer token = new StringTokenizer(s.replaceAll("[,?@'.!_]", " "));
        
        System.out.println(token.countTokens());
        
        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
        scan.close();
    }
}
