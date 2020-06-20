/* Task 5:
Write a java program that reads 10 numbers from the user. Then read another number from the user, 
and print “yes” if this number exists among the first 10. Print “no” otherwise. */

import java.util.*;

public class lab0201task05{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter A Number: ");
            a[i]=sc.nextInt();
        }
        
        
        
        System.out.println("Enter Another Number: ");
        int c=sc.nextInt();
        
        int x=0;
        
        for(int j=0; j<a.length; j++){
            if(a[j]==c){
                x+=1;
            }
        }
        
        if(x==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
    }
}

        
        
        