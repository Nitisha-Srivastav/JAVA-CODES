Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Solution-
  import java.util.Scanner;

public class Solution {
      public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++)
        {
            String sub=s.substring(i,i+k);
            if(smallest.compareTo(sub) > 0 /*|| smallest.isEmpty()*/)
            {
                smallest=sub;
            }
            if(largest.compareTo(sub) < 0 /*|| largest.isEmpty()*/)
            {
                largest=sub;
            }
        }
        
        return smallest + "\n" + largest;
    }
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
