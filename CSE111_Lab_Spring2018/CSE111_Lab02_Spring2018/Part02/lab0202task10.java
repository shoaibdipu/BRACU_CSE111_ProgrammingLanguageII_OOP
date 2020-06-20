/*
 10. Modify your solution of number 8. Take as many numbers within 0 to 9 
 as needed so that you can print 2 such number that appeared at least twice and less than 5 times.
 e.g. Imagine the user entered 4,3,2,5,2,3,2,0,2,3 then the output is 3, 2.
 */

import java.util.*;

public class lab0202task10{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] countA = new int [10];
        
        int numC=0;
        
        while(numC!=2){
            int i = sc.nextInt();
            
            countA[i]++;
            
            if(countA[i]==2){
                numC++;
            }
            
            if(countA[i]==5){
                numC--;
            }
        }
        
        for(int c=0; c<countA.length; c++){
            if(countA[c]>=2 && countA[c]<5){
                System.out.println(c);
            }
        }
    }
}





