package week10;

public class InterfaceClass{
    public static void main(String[] args){
        Spotify spotify= new Spotify();
        spotify.download();
        spotify.next();
        spotify.pause();
        spotify.play();
        spotify.previous();
        System.out.println(spotify.remaining(882));
        System.out.println(spotify.size());
        AppleMusic appleMusic= new AppleMusic();
        appleMusic.download();
        appleMusic.next();
        appleMusic.pause();
        appleMusic.play();
        appleMusic.previous();
        System.out.println(appleMusic.remaining(22)); 
        System.out.println(appleMusic.size());
    }
}
// make interface similar to class with "interface" keyword
// interface is automatically abstract
interface DomesticInterFace{
    public void pet();
}
interface AnimalInterface{
    // function inside the interface is automatically absract
    // function hidden or no body

    public void eat();
    public void sleep();
}
// interface can extend interface 
interface MammalInterface extends AnimalInterface{
    public int legs();
}
//can nest on mutli level
interface DogInterface extends MammalInterface{
    public String barks();
}
class Husky implements DogInterface, DomesticInterFace{
// if the interface is built/extended on top of another interface
    //all the function on top of the interface shoould be overriden
    
    @Override
    public int legs() {
        return 4;
    }

    @Override
    public void eat() {
        System.out.println("Husky eats fish");
    }

    @Override
    public void sleep() {
       System.out.println("Husky sleeps at dusk");
    }

    @Override
    public String barks() {
       return "woof woof!!";
    }

    @Override
    public void pet() {
       System.out.println("Husky likes pet"); 
    }
    
}
// to use interface use "implements" keyword

class Bulldog implements AnimalInterface{

    @Override
    public void eat() {
        System.out.println("BUlldog eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Bulldog sleeps at night");
    }
    
}

class Cow implements AnimalInterface{
    @Override
    public void eat() {
        System.out.println("cow eats grass");
    }

    @Override
    public void sleep() {
        System.out.println("cow sleeps at night");
    } 
}
/* * Task 
*Make an interface Media 
* make the following functions
 * void play() * void pause() 
 * * void next()
 *  * void previous()
 *  * String nowPlaying()
 *  * *
 *  Make an interface DigitalMedia extending Media 
 * * make the following functions * 
 * double size()
 *  * double remaining(double current)
 *  * * Make an interface OnlineAsset 
 * * make the following functions 
 *  void  download() *
 * Make a class Spotify and implement DigitalMedia and OnlineAsset 
 * * Make a class AppleMusic and implement DigitalMedia and OnlineAsset 
 * Make one object of Spotify and one object of AppleMusic */

 interface Media{
    public void play();
    public void pause();
    public void next();
    public void previous();
    public String nowPlaying();
 }

 interface DigitalMedia extends Media{
    double size();
    double remaining(double current);
 }
 interface OnlineAsset{
    void download();
 }
class Spotify implements DigitalMedia,OnlineAsset{

    @Override
    public void play() {
       System.out.println("Music is playing");
    }

    @Override
    public void pause() {
       System.out.println("Music is Paused");
    }

    @Override
    public void next() {
       System.out.println("playing next musicc");
    }

    @Override
    public void previous() {
      System.out.println("playing previous music");
    }

    @Override
    public String nowPlaying() {
       return "Song";
    }

    @Override
    public void download() {
    System.out.println("Donwloading song");
    }

    @Override
    public double size() {
        return 250;
    }

    @Override
    public double remaining(double current) {
        return 250;
    }

}
class AppleMusic implements DigitalMedia,OnlineAsset{
    @Override
    public void play() {
       System.out.println("appleMusic is playing");
    }

    @Override
    public void pause() {
       System.out.println("appleMusic is Paused");
    }

    @Override
    public void next() {
       System.out.println("playing next musicc");
    }

    @Override
    public void previous() {
      System.out.println("playing previous music");
    }

    @Override
    public String nowPlaying() {
       return "Song";
    }

    @Override
    public void download() {
    System.out.println("Donwloading song");
    }

    @Override
    public double size() {
        return 100;
    }

    @Override
    public double remaining(double current) {
        return 23;
    }
}