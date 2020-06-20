/*
6. Write a Java program that will calculate the value of y if the expression 
of y is as follows (n is the input):
*/

import java.util.*;

public class lab0202task06{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of N: ");
        int n = sc.nextInt();
        
        int [] a = new int [n];
        int sum=0, calc, sign;
        
        for(int i=1; i<=a.length; i++){
            if(i%2==0){
                sign=-1;
            }else{
                sign=1;
            }

            calc=i*i*sign;
            
            sum=sum+calc;
        }
        System.out.println("Sum : "+sum);
    }
}

            
                
            