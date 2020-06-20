/*Task 7
 Show examples of the following methods of the String class.*/

import java.util.*;

public class lab03task07{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        
        String s1 = "CSE 111 : MSA";
        String s2 = "CSE 111 : MMD";
        String s3 = "ECO 101 : MAZ";
        String s4 = "CSE 111 : MMD";
        String s5 = "cse 260 : mrn";
        String s6 = "   Spring 2018   ";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println();
        
        // (a) Examples Of 'compareTo' Method
        
        int resulta;
        
        resulta = s1.compareTo(s2);
        System.out.println("Examples Of compareTo With s1,s2 : "+resulta);
        
        resulta = s2.compareTo(s3);
        System.out.println("Examples Of compareTo With s2,s3 : "+resulta);
        System.out.println();
        
        // (b) Examples Of 'compareToIgnoreCase' Method
        
        int resultb;
        
        resultb = s1.compareToIgnoreCase(s2);
        System.out.println("Examples Of compareToIgnoreCase With s1,s2 : "+resultb);
        
        resultb = s2.compareToIgnoreCase(s3);
        System.out.println("Examples Of compareToIgnoreCase With s2,s3 : "+resultb);
        
        resultb = s3.compareToIgnoreCase(s1);
        System.out.println("Examples Of compareToIgnoreCase With s3,s1 : "+resultb);
        System.out.println();
        
        // (c) Examples Of 'startsWith' Method

        System.out.println("Examples Of 'startsWith' Method With s1 : "+s1.startsWith("CSE")); 
        System.out.println("Examples Of 'startsWith' Method With s2 : "+s2.startsWith("MAZ"));
        System.out.println();
        
        // (d) Examples Of 'endsWith' Method
        
        System.out.println("Examples Of 'endsWith' Method With s1 : "+s1.endsWith("MSA")); 
        System.out.println("Examples Of 'endsWith' Method With s2 : "+s2.endsWith("MAZ"));
        System.out.println();
        
        // (e) Examples Of 'equals' Method
        
        System.out.println("Examples Of 'equals' Method With s2,s4 : "+s2.equals(s4)); 
        System.out.println("Examples Of 'equals' Method With s1,s3 : "+s1.equals(s3));
        System.out.println();
        
        // (f) Examples Of 'equalsIgnoreCase' Method
        
        System.out.println("Examples Of 'equalsIgnoreCase' Method With s2,s4 : "+s2.equalsIgnoreCase(s4)); 
        System.out.println("Examples Of 'equalsIgnoreCase' Method With s1,s3 : "+s1.equalsIgnoreCase(s3));
        System.out.println();
        
        // (g) Examples Of 'indexOf' Method
        
        System.out.println("Examples Of 'indexOf' Method With s1 : "+s1.indexOf('S'));
        System.out.println("Examples Of 'indexOf' Method With s3 : "+s3.indexOf('S'));
        System.out.println();
        
        // (h) Examples Of 'lastIndexOf' Method
        
        System.out.println("Examples Of 'lastIndexOf' Method With s1 : "+s1.lastIndexOf('S'));
        System.out.println("Examples Of 'lastIndexOf' Method With s3 : "+s3.lastIndexOf('S'));
        System.out.println();
        
        // (i) Examples Of 'length' Method
        
        System.out.println("Examples Of 'length' Method With s4 : "+s4.length());
        System.out.println();
        
        // (j) Examples Of 'replace(char oldChar, char newChar)' Method
        
        System.out.println("Examples Of 'replace(char oldChar, char newChar) Method With s4 : "+s4.replace('M', 'm'));
        System.out.println();
        
        // (k) Examples Of 'substring' Method    
        
        System.out.println("Examples Of 'substring' Method With s4 : "+s4.substring(4));
        System.out.println("Examples Of 'substring' Method With s4 : "+s4.substring(4,13));
        System.out.println();
        
        // (l) Examples Of 'toCharArray' Method 
        
        System.out.print("Examples Of 'toCharArray' Method With s2 : ");
        System.out.println(s2.toCharArray());
        System.out.print("Examples Of 'toCharArray' Method With s3 : ");
        System.out.println(s3.toCharArray());
        System.out.println();
        
        // (m) Examples Of 'toLowerCase' Method 
        
        System.out.print("Examples Of 'toLowerCase' Method With s2 : ");
        System.out.println(s2.toLowerCase());
        System.out.print("Examples Of 'toLowerCase' Method With s3 : ");
        System.out.println(s3.toLowerCase());
        System.out.println();
        
        // (n) Examples Of 'toUpperCase' Method
        
        System.out.print("Examples Of 'toUpperCase' Method With s5 : ");
        System.out.println(s5.toUpperCase());
        System.out.println();
        
        // (o) Examples Of 'trim' Method
        
        System.out.print("Examples Of 'trim' Method With s6 : ");
        System.out.println(s6.trim());
        System.out.println();
        
        // (p) Examples Of 'valueOf' Method
        
        char [] s7 = {'B', 'R', 'A', 'C', 'U'};
        String s8 = "";
        s8 = s8.copyValueOf(s7);
        System.out.println("Examples Of 'valueOf' Method With s7,s8 : "+s8);
    }
}


                       