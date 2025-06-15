package org.example.my_patterns.proxy2;

public class RealMusicService implements VideoService{
    public RealMusicService() {
        System.out.println("Загрузка видео с сервера, подождите...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void playMusic() {
        System.out.println("Воспроизведение видео");
    }
}

