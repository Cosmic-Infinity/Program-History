/*
5. Create a polymorphic game system where a superclass `Game` has a method `play()`.
Subclasses `ArcadeGame` and `RPGGame` add specific attributes and methods.
Downcast a `Game` reference to the appropriate subclass to access subclass-specific features, 
like special effects or character customization.
 */

class Mains5{
    public static void main(String[] args){
        Game game1 = new ArcadeGame();
        Game game2 = new RPGGame();
        if(game1 instanceof ArcadeGame){
            game1.play();
            ArcadeGame game11 = (ArcadeGame)game1;
            game11.specialeffets();
        }
        else{
            game1.play();
            RPGGame game12 = (RPGGame)game1;
            game12.customise();
        }
        if(game2 instanceof ArcadeGame){
            game2.play();
            ArcadeGame game11 = (ArcadeGame)game2;
            game11.specialeffets();
        }
        else{
            game2.play();
            RPGGame game12 = (RPGGame)game2;
            game12.customise();
        }
    }
}
class Game{
    void play(){
        System.out.println("Playing game...");
    }
}
class ArcadeGame extends Game{
    void specialeffets(){
        System.out.println("Showing special effects!");
    }
}
class RPGGame extends Game{
    void customise(){
        System.out.println("Customising you RPG avatar!");
    }
}
 