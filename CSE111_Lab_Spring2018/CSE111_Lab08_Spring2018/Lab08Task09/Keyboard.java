public class Keyboard extends Instrument{
    String name = "Keyboard";
    
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
