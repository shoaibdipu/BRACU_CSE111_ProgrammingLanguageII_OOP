public class test09{
    public static void main(String[]args){
        
    Guitar g = new Guitar();
    g.play();
    g.adjust();
    g.compose();
    
    System.out.println();
    
    Keyboard k = new Keyboard();
    k.play();
    k.adjust();
    k.compose();
    
    System.out.println();
    
    Violin v = new Violin();
    v.play();
    v.adjust();
    v.compose();    
    }
}
