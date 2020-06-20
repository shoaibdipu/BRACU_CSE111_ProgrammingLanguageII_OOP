public class Dog extends Animal{
    
    private String sound = "bark";
    
    
    //Default Constructor
    public Dog(){
    }
    
    //Overloaded Constructor
    public Dog(String _sound){
        this.sound = _sound;
    }
    
    //Return sound
    public String makeSound(){
        return sound;
    }
}
