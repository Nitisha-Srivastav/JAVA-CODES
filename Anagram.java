Sample Input 0

anagram
margana
Sample Output 0

Anagrams

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Solution-
import java.util.Scanner;

public class Solution {


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
