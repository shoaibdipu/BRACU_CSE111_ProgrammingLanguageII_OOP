/*
 Task 6:
 Write a java program that reads 15 numbers from the user, 
 all the numbers within the range 0-9. 
 Then print the number of times each number has been entered by the user.
 */

import java.util.*;

public class lab0201task06{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int [15];
        int c;
        for (c=0; c<a.length; ++c){
            System.out.println("Enter A Number Within The Range 0-9:");
            a[c] = sc.nextInt();
        }
        
        int zeroCount = 0; 
        int oneCount = 0; 
        int twoCount = 0; 
        int threeCount = 0; 
        int fourCount = 0; 
        int fiveCount = 0; 
        int sixCount = 0; 
        int sevenCount = 0; 
        int eightCount = 0; 
        int nineCount = 0; 
        
        for (int i=0; i<a.length; ++i){
            if(a[i]==0){
                zeroCount++;
            }else if(a[i]==1){
                oneCount++;
            }else if(a[i]==2){
                twoCount++;
            }else if(a[i]==3){
                threeCount++;
            }else if(a[i]==4){
                fourCount++;
            }else if(a[i]==5){
                fiveCount++;
            }else if(a[i]==6){
                sixCount++;
            }else if(a[i]==7){
                sevenCount++;
            }else if(a[i]==8){
                eightCount++;
            }else if(a[i]==9){
                nineCount++;
            }
        }
        
        System.out.println("zeroCount"+" "+zeroCount);
        System.out.println("oneCount"+" "+oneCount);
        System.out.println("twoCount"+" "+twoCount);
        System.out.println("threeCount"+" "+threeCount);
        System.out.println("fourCount"+" "+fourCount);
        System.out.println("fiveCount"+" "+fiveCount);
        System.out.println("sixCount"+" "+sixCount);
        System.out.println("sevenCount"+" "+sevenCount);
        System.out.println("eightCount"+" "+eightCount);
        System.out.println("nineCount"+" "+nineCount);
        
    }
}
