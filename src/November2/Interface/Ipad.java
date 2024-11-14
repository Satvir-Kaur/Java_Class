package November2.Interface;

public class Ipad implements AudioMediaPlayer, VideoPlayer, WebBrowser, Calculator, Camera {

    @Override
    public void playMusic() {
        System.out.println("You can  play music");

    }

    @Override
    public void playVideo() {
     System.out.println("You can  play video");
    }

    @Override
    public void play() {
     System.out.println("play");
    }

    @Override
    public void pause() {
    System.out.println("pause");
    }

    @Override
    public void stop() {
     System.out.println("stop");
    }

    @Override
    public void calculate() {
        System.out.println("Ipad can calculate");
    }

    @Override
    public void click() {
        System.out.println("Ipad can click pictures");
    }

    @Override
    public void surfInternet() {

    }
}
