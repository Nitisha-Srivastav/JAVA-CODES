import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();
        int n=Integer.parseInt(a);
        boolean flag=true;
        if(n==0||n==1)
            System.out.println("not prime");
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                flag=true;
            else
                 flag=false;
        }
        if(flag==true)
             System.out.println("not prime");
        else
             System.out.println("prime");

        scanner.close();
    }
}
