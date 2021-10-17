package ru.grem.spring5course;

public class MusicPlayer {
    Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("PLaying " + music.getSong());
    }
}
