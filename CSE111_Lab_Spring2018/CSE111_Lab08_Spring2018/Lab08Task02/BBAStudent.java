public class BBAStudent extends Student{
    
    public String dpt;
    public String name;
    
    public BBAStudent(){
        setDepartment("BBA");
        setName("Default BBA Student");
    }
    
    public BBAStudent(String n){
        setDepartment("BBA");
        setName(n);
    }
    
    
}

