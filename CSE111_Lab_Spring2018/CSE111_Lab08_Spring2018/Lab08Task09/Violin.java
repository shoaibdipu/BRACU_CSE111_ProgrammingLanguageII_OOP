public class Violin extends Instrument{
    String name = "Violin";
    
    public void play(){
        System.out.println("In the playing method of "+name);
    }
    public void adjust(){
        System.out.println("In the adjust method of "+name);
    }
    public void compose(){
        System.out.println("In the compose method of "+name);
    }
}
