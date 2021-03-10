import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	a = a.toLowerCase();
    	int countA = 0;
    	
    	b = b.toLowerCase();
    	int countB = 0;
    	
    	if(a.length() != b.length()) return false;
    	
    	for(int i = 0; i < a.length(); i++) {
    		char aux = a.charAt(i);
    		
    		for(int j = 0; j < b.length(); j++) {
    			if(aux == a.charAt(j)) countA++;
    			if(aux == b.charAt(j)) countB++;
    		}
    		
    		if(countA != countB) return false;
    	}
    	
    	return true;
    }
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
