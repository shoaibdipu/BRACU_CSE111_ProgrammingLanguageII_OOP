public class Cat{ 
    public String color = "White"; 
    public String action = "sitting"; 
    
    // My Code Here 
    
    public Cat(){
    }
    public Cat(String c){
        color = c;
    }
    public Cat(String c, String a){
        color = c;
        action = a;
    }
    
    public void printCat(){
        System.out.println(color+" "+"cat"+" "+"is"+" "+action);
    }
    
    public void changeColor(String c){
        color = c;
    }
   
} 