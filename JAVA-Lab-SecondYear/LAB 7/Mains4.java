/*
4. **Polymorphism with Interface Reference:**
Define an interface `Playable` with methods `play()` and `pause()`.
Create two classes `AudioPlayer` and `VideoPlayer` implementing `Playable`.
 Write a method `playMedia(Playable p)` that accepts a `Playable` interface type
 and calls the `play()` method for either class.
*/

class Mains4{
    public static void main(String[] args){
        Playable p1 = new AudioPlayer();
        Playable p2 = new VideoPlayer();
        Mains4 m = new Mains4();
        m.playMedia(p1);
        m.playMedia(p2);
    }
    void playMedia(Playable p){
        p.play();
    }
}
interface Playable{
    public abstract void play();
    public abstract void pause();
}
class AudioPlayer implements Playable{
    public void play(){
        System.out.println("Audio is Playing");
    }
    public void pause(){
        System.out.println("Audio is Paused");
    }
}
class VideoPlayer implements Playable{
    public void play(){
        System.out.println("Video is Playing");
    }
    public void pause(){
        System.out.println("Video is Paused");
    }
}