/*4. Write a Java program that would ask the user to enter five numbers. 
 * As the user enters the five numbers the program will make sure that 
 * all the numbers entered by the user are unique.
 * For example if the user enters 2, 3, 4, 6, and 
 * then tries to enter 3 again the program will display 
 * that 3 is already in among the entered numbers and would ask the user to enter a new number. 
 * You will have to keep taking numbers from the user until you receive five unique numbers. 
 * At the end, print those five unique numbers.
 */

import java.util.*;

public class lab0202task04{
    public static void main(String[]args){
        
        System.out.println("Enter A Number:");
        Scanner sc1=new Scanner(System.in);
        int j=sc1.nextInt();
        
        int[]a=new int[5];
        a[0]=j;
        
        boolean b=false;
        int counter=0;
        
        for(int n=1; n<=4; n++){
            System.out.println("Enter Another Number:");
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            
            for(int k=n; k>=1; k--){
                if(i==a[k-1]){
                    counter+=1;
                    
                    if (counter==5)b=true;
                    break;
                }else{
                    b=false;
                }
            }
            
            if(b==true){
                System.out.println("Duplicate!!!");
                n=n-1;
            }else{
                a[n]=i;
            }
        }
        for(int c=0; c<a.length; c++){
            System.out.print(a[c]+" ");
        }
    }
}
