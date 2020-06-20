/*Task 5

Input a word into a String. 
Print the word.
Print the word again after adding “==THE END==” at the end of the word.
Then print the word again.
You are NOT allowed to use concat method. 
You ARE allowed use ‘+’ operator to concatenate (join?) words. 
*/

import java.util.*;

public class lab03task05{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        System.out.println(s);
        
        System.out.println(s+"==THE END==");
        
        System.out.println(s);
    }
}


