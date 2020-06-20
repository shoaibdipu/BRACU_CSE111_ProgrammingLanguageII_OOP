import java.util.*;

public class Student{
    String name;
    String id;
    int section;
    double mark;
    
    public static Comparator<Student> NAME_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(final Student o1, final Student o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    
    public String toString(){
        return "Naam: "+name+"\n" 
            +"ID: "+id+"\n" 
            +"Section: "+section+"\n" 
            +"Mark: "+mark+"\n";
    }
    
    
    
}