class Circle extends Point{
  
    
    public Circle(){
        super(1.0);
        System.out.println("Creating a Circle...done!");
    }
    public Circle(double r){
        super(r);
        System.out.println("Creating a Circle...done!");
    }
        
    double space(){
        return Math.PI*getRadius()*getRadius();
    }
}
    
    
    