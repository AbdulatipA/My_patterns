package org.example.my_patterns.proxy2;

public class Proxy2Main {
    public static void main(String[] args) {
        VideoService videoService = new VideoServiceProxy();
        videoService.playMusic();
    }
}
