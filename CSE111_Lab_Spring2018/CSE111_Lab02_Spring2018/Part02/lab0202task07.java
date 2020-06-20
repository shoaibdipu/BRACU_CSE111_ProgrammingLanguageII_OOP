/*
 7. Take 11 numbers such that any numbers can exist at maximum four times.
 That means any number can be entered multiple times but 
 when the user enters same numbers for 5th time, 
 it should reject and ask for any other number but that number.
 e.g. Imagine the user entered 3,2,5,7,2,3,2,0,9,2,3. 
 If the user tries to enter 2 again, 
 it must not allow it because 2 is already there, 4 times.
 */

import java.util.*;

public class lab0202task07{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int [] a = new int [11];
        
        int temp;
        
        
        for(int i=0; i<a.length; i++){
            int count=1;
            System.out.println();
            System.out.println("Enter A Numer: ");
            temp=sc.nextInt();
           
            for(int j=0; j<=i; j++){ 
                if(a[j]==temp){
                    count++;    
                }
            }
            
            if(count>4){
               System.out.println("Enter A Different Number");
               System.out.println();
               i--;
            } else {
                a[i] = temp;
            }
        }
    }
}

 
                    
                    
                    
                    
                    
                    
                    
                    
                    