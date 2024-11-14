package November2.Interface;

import java.sql.SQLOutput;

public class SmartPhone  implements MobilePhone, Calculator, Camera, MediaPlayer, VideoPlayer, WebBrowser{

    @Override
    public void calculate() {
        System.out.println(" Phone has Calculator");
    }

    @Override
    public void click() {
        System.out.println(" Click photo using Smartphone");

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void call() {

    }

    @Override
    public void text() {

    }

    @Override
    public void playVideo() {

    }

    @Override
    public void surfInternet() {

    }
}
