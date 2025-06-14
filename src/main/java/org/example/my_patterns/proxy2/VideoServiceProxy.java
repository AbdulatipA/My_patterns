package org.example.my_patterns.proxy2;

public class VideoServiceProxy implements VideoService {
    private RealMusicService realMusicService;


    @Override
    public void playMusic() {
        if(realMusicService == null) {
            realMusicService = new RealMusicService();
        }
        realMusicService.playMusic();
    }
}
