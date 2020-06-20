class Sphere extends Point{
    
    public Sphere(){
        super(1.0);
        System.out.println("Creating a Circle...done!");
    }
    public Sphere(double r){
        super(r);
        System.out.println("Creating a Circle...done!");
    }
        
    double space(){
        return (4/3.0)*Math.PI*getRadius()*getRadius()*getRadius();
    }
}
    
    
    