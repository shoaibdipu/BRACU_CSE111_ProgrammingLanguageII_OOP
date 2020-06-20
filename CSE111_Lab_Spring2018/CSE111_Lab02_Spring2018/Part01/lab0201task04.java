/* Task 4:
 Write a java program that reads 20 numbers from the user, 
 and then prints only the even numbers in reverse order. */

import java.util.*;

public class lab0201task04{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int [] a = new int[20];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter A Number: ");
            a[i]=sc.nextInt();
        }
        
        for(int c=a.length-1; c>0; c--){
            if(a[c]%2==0){
                System.out.print(a[c]+" ");
            }  
        }
    }
}

