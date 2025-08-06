/*
3. Design a simulation where a superclass `Media` has methods `play()` and `pause()`.
Subclass `Music` adds the method `shuffle()`, and subclass `Video` adds the method `fastForward()`. 
Demonstrate upcasting of `Music` and `Video` objects to a `Media` reference,
and call only `play()` and `pause()` methods to showcase polymorphism.
 */

class Mains3{
    public static void main(String[] args){
        Media music = new Music();
        Media video = new Video();
        music.play();
        music.pause();
        video.play();
        video.pause();
    }
}

class Media{
    void play(){
        System.out.println("Playing...");
    }
    void pause(){
        System.out.println("Paused");
    }
}
class Music extends Media{
    void play(){
        System.out.println("Music playing...");
    }

    void pause(){
        System.out.println("Music Paused");
    }

    void shuffle(){
        System.out.println("Shuffling...");
    }
}
class Video extends Media{
    void play(){
        System.out.println("Video playing...");
    }

    void pause(){
        System.out.println("Video Paused");
    }

    void fastForward(){
        System.out.println("Fast forwarding...");
    }
}