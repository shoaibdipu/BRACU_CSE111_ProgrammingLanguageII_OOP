public class Student{
    String name;
    String address;
    String id;
    double cgpa;
    
    public Student(){
        name = "Ei name e kono student nai";
        id = "Student ei nai, abar id :P";
        address = "Naam nai .. thikana ashbe koi theke?";
        cgpa = -4.0;
    }
    
    public Student(String n, String i, String a, double c){
        name = n;
        id = i;
        address = a;
        cgpa = c;
    }
    
    public String nameDao(){
        return name;
    }
    public void nameBoshao(String n){
        name = n;
    }
    public String boloToAmiKe(){
        return id;
    }
    public void idBoshao(String i){
        id = i;
    }
    public String addressDao(){
        return address;
    }
    public void addressBoshao(String a){
        address = a;
    }
    public double cgpaDao(){
        return cgpa;
    }
    public void cgpaBoshao(double c){
        cgpa = c;
    }
    public void standUp(){
        System.out.println(name+" "+"is now standing up!!");
    }
    public String tellMeYourName(){
        return "Sir, my name is "+name;
    }
    public void call(String n){
        String name2 = n;
        System.out.println(name+": "+"Hey, "+name2+", Sir is calling you!!");
    }
    public int add2Numbers(int a, int b){
        int n1 = a;
        int n2 = b;
        int sum = n1+n2;
        return sum;
    }
}
