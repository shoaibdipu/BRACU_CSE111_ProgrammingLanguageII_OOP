/* This is a tester method that is used to test the functionalities
 * of the MyString class.
 * 
 */

public class MyStringTester {
  
  public static void main(String args[]){
 
    String my_string = "Hello World";
    MyString s = new MyString(my_string);
    
    // Task 1:
    int len = s.length();
    System.out.println("Task1 " + ((my_string.length()==len) ? "[Pass]" : "[Fail]"));
    System.out.println("Length is: "+len); // This should print 11
    System.out.println();
    
    // Task 2:
    System.out.println("Task2 " + ((my_string.charAt(6)==s.charAt(6)) ? "[Pass]" : "[Fail]"));
    System.out.println("Char at index 6 is: "+s.charAt(6)); // This should print 'W'  
    System.out.println();
    
    // Task 3:
    boolean test1 = s.startsWith("He");
    boolean test2 = s.startsWith("ABC");
    System.out.println("Task3 " + ((my_string.startsWith("He")==test1 && my_string.startsWith("ABC")==test2) ? "[Pass]" : "[Fail]"));
    System.out.println("StartsWith 'He': " + test1);
    System.out.println("StartsWith 'ABC': " + test2);
    System.out.println();

    // Task 5:
    my_string.replaceFirst("o", "e");
    s.replaceFirst('o','e');
    System.out.println("Task5 " + ((my_string.equals(s.toString())) ? "[Pass]" : "[Fail]"));
    System.out.println("ReplaceFirst 'o' with 'e': " + s.toString());
    System.out.println();
    
    // Task 6:
    my_string = "Hello World";
    s= new MyString(my_string);
    my_string.replaceAll("o", "e");
    s.replaceAll('o','e');
    System.out.println("Task6 " + ((my_string.equals(s.toString())) ? "[Pass]" : "[Fail]"));
    System.out.println("ReplaceAll 'o' with 'e': " + s.toString());
    System.out.println();
    
    // Task 7:
    my_string = "Hello World";
    s= new MyString(my_string);
    String new_string = "Hello Werld";
    s.replaceLast('o','e');
    System.out.println("Task7 " + ((new_string.equals(s.toString())) ? "[Pass]" : "[Fail]"));
    System.out.println("ReplaceLast 'o' with 'e': " + s.toString());
    System.out.println();
    
    // Task 8:
    my_string = "Hello World";
    s= new MyString(my_string);
    my_string.toLowerCase();
    s.toLowerCase();
    System.out.println("Task8 " + ((my_string.equals(s.toString())) ? "[Pass]" : "[Fail]"));
    System.out.println("toLowerCase() : " + s.toString());
    System.out.println();
    
    // Task 9:
    my_string = "Hello World";
    s= new MyString(my_string);
    my_string.toUpperCase();
    s.toUpperCase();
    System.out.println("Task9 " + ((my_string.equals(s.toString())) ? "[Pass]" : "[Fail]"));
    System.out.println("toUpperCase() : " + s.toString());
    System.out.println();
    
    // Task 10:
    my_string = "Hello World";
    s= new MyString(my_string);
    test1 = s.equals("Hello World");
    test2 = s.equals("HELLO WORLD");
    System.out.println("Task10 " + ((my_string.equals("Hello World")==test1 && my_string.equals("HELLO WORLD")==test2) ? "[Pass]" : "[Fail]"));
    System.out.println("Equals 'Hello World': " + test1);
    System.out.println("Equals 'HELLO WORLD': " + test2);
    System.out.println();
    
    // Task 11:
    test1 = s.equalsIgnoreCase("Hello World");
    test2 = s.equalsIgnoreCase("HELLO WORLD");
    System.out.println("Task11 " + ((my_string.equalsIgnoreCase("Hello World")==test1 && my_string.equalsIgnoreCase("HELLO WORLD")==test2) ? "[Pass]" : "[Fail]"));
    System.out.println("EqualsIgnoreCase 'Hello World': " + test1);
    System.out.println("EqualsIgnoreCase 'HELLO WORLD': " + test2);
    System.out.println();
    
  
  }
}