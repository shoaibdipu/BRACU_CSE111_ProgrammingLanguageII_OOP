/*8. Modify your solution of number 7. 
 * Take 10 numbers within 0 to 9.
 * When you print output, users will see only the numbers 
 * that appeared at least twice and less than 5 times.
 e.g. Imagine the user entered 4,3,2,5,2,3,2,0,2,3 then the output is 3, 2.
 */

import java.util.*;

public class lab0202task08{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int [10];

        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter A Number Between 0 To 9");
            int temp=sc.nextInt();
            if(temp>=0 && temp<=9){
                a[temp]++;
            }else{
                System.out.println("Enter Again");
                i--;
            }
        }
        
        for(int c=0; c<a.length; c++){
            if(a[c]>=2 && a[c]<5){
                System.out.print(c+" ");
            }
        }
    }
}

        
            
            
       
