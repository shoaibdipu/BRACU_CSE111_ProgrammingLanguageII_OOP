
import java.util.*;

public class lab03task04{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int [] charCount = new int [91];
        
        for(int i = 0; i<s.length(); i++){
            int codeForCh = s.codePointAt(i);
            charCount[codeForCh]++;
        }
        
        for(int j=65; j<charCount.length; j++){
            char ch = (char)j;
            System.out.println(ch+" which is "+j+" was found "+charCount[j]+" times");
        }
    }
}
