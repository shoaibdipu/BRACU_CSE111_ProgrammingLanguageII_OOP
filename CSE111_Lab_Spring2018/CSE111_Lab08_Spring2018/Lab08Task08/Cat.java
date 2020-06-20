public class Cat extends Animal{
    
    private String sound = "meow";
    
    //Default Constructor
    public Cat(){
    }
    
    //Overloaded Constructor
    public Cat(String _sound){
        this.sound = _sound;
    }
    
    //Return sound
    public String makeSound(){
        return sound;
    }
}
