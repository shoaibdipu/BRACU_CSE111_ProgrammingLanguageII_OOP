/*Task 6

Input a word into a String. 
Print the word.
Print the word again after adding “==THE END==” at the end of the word.
Then print the word again. 
Your whole program may contain the word “String” at most two times.
You HAVE TO to use concat method. 
You are NOT allowed use ‘+’ operator to concatenate (join?) words. 
*/

import java.util.*;

public class lab03task06{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        System.out.println(s);
        System.out.println(s.concat("==THE END=="));
        System.out.println(s);
        
    }
}
