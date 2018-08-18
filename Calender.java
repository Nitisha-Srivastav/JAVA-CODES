Sample Input

08 05 2015
Sample Output

WEDNESDAY
Solution-
import java.util.Scanner;
import java.time.LocalDate;
public class Solution{
    public static String getDay(String day,String month,String year)
    {
        LocalDate l= LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return l.getDayOfWeek().toString();
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
