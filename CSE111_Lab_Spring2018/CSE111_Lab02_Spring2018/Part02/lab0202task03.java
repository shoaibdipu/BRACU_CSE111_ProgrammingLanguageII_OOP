/*
3. Write a Java program that would input ten numbers from the user and 
print the ten numbers sorted in descending order.
*/

import java.util.*;

public class lab0202task03{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int [10];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter A Number: ");
            a[i]=sc.nextInt();
        }
        
        int j,k;
        
        for(j=0; j<a.length-1; j++){
            int largestSoFar=a[j];
            int locationOfLargest=j;
            for(k=j+1; k<a.length; k++){
                if(a[k]>largestSoFar){
                    largestSoFar=a[k];
                    locationOfLargest=k;
                }
            }
            int temp = a[j];
            a[j]=largestSoFar;
            a[locationOfLargest]=temp;
        }
        for(int c=0;c<a.length;++c) {
            System.out.print(a[c]+ " ");
        }
    }
}
            
                
                
                
                
                