package com.company;

public class Main {
    public static void main(String[] args) {
        AppFactory Application = new Application();
        AppInterface SocialMedia = Application.createSocialMedia();
        AppInterface Health = Application.createHealth();
        AppInterface Games = Application.createGames();

        SocialMedia.start();
        Health.start();
        Games.start();
    }
}
