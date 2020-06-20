/*Task 7:
Write a java program that reads 10 numbers from the user. 
After reading each number, print all the numbers that have been entered so far.
*/

import java.util.*;

public class lab0201task07{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int [] a = new int [10];
        
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
            System.out.println("The Entered Numbers Are: ");
            
            for(int j=0; j<=i; j++){
                System.out.print(a[j]+" ");
            }
        }
    }
}

            