/*9. Modify your solution of number 3. Ask user if the user wants to sort 
     a) only numbers at odd positions
     Or, b) only numbers at even positions
     Or, c) all numbers (means numbers at all positions)
     And then sort only the numbers that the user wanted to be sorted as if all other numbers do not exist.
     When printing, print all numbers.*/

import java.util.*;

public class lab0202task09{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int [10];
        
        // Taking Input Of Ten Numbers
        
        for(int i=0; i<a.length; i++){
            System.out.println();
            System.out.println("Enter A Number: ");
            a[i]=sc.nextInt();
        }
        
        // Asking For Preferences 
        
        System.out.println("Enter Your Sorting Preference :");
        System.out.println("1. Only Numbers At Odd Positions");
        System.out.println("2. Only Numbers At Even Positions");
        System.out.println("3. All Numbers");
        int pref = sc.nextInt();
        
        int j,k;
        
        if(pref==1){
            for(j=0; j<a.length; j+=2){
                int largestSoFar=a[j];
                int locationOfLargest=j;
                for(k=j+2; k<a.length; k+=2){
                    if(a[k]>largestSoFar){
                        largestSoFar=a[k];
                        locationOfLargest=k;
                    }
                }
                int temp = a[j];
                a[j]=largestSoFar;
                a[locationOfLargest]=temp;
            }
        }else if(pref==2){
            for(j=1; j<a.length; j+=2){
                int largestSoFar=a[j];
                int locationOfLargest=j;
                for(k=j+2; k<a.length; k+=2){
                    if(a[k]>largestSoFar){
                        largestSoFar=a[k];
                        locationOfLargest=k;
                    }
                }
                int temp = a[j];
                a[j]=largestSoFar;
                a[locationOfLargest]=temp;
            }
        }else if(pref==3){
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
        }
 
        for(int c=0;c<a.length;++c) {
            System.out.print(a[c]+ " ");
        }
    }
}