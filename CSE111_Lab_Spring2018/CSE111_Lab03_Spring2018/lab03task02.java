/*Input a word into a String. Print each character on a line by itself.  Use charAt method. */

import java.util.*;

public class lab03task02{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        for(int i = 0; i<s.length(); i++){
            
            System.out.println(s.charAt(i));
        }
    }
}

            