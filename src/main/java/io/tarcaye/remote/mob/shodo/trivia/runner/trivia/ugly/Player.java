package io.tarcaye.remote.mob.shodo.trivia.runner.trivia.ugly;

public class Player {
    private final String name;
    private final int position;

    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String name() {
        return name;
    }

    public int position() {
        return position;
    }
}
