package com.company;

public class Application implements AppFactory {

    @Override
    public SocialMedia createSocialMedia() {
        return new SocialMedia();
    }

    @Override
    public Health createHealth() {
        return new Health();
    }

    @Override
    public Games createGames() {
        return new Games();
    }
}
