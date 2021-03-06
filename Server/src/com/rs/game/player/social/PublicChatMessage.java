package com.rs.game.player.social;

public class PublicChatMessage {

    private final String message;
    private final int effects;

    public PublicChatMessage(String message, int effects) {
        this.message = message;
        this.effects = effects;
    }

    public String getMessage() {
        return message;
    }

    public int getEffects() {
        return effects;
    }

}
