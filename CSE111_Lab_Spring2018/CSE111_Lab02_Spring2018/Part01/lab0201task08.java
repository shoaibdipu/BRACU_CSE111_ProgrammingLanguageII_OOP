/*
Task 8:
Write a java program that reads 10 numbers from the user, but does not allow the user to enter duplicates.
This means that if a number has been entered already, 
the program will not accept it as input again and instead ask the user to enter a different number. 
*/

import java.util.*;

public class lab0201task08{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int[10];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter A Number: ");
            a[i]=sc.nextInt();
            
            for(int j=0; j<=i; j++){
                if(a[j]==a[i]){
                    System.out.println("Duplicate! Enter A Different Number: ");
                    --i;
                }
            }
        }
    }
}

            