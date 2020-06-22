package io.tarcaye.remote.mob.shodo.trivia.runner.trivia.ugly;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private final List<Player> value;

    private Players(List<Player> value) {
        this.value = value;
    }

    public static Players createPlayers(List<String> playerNames) {

        List<Player> list = new ArrayList<>();
        for (int i = 0, playerNamesSize = playerNames.size(); i < playerNamesSize; i++) {
            Player player = new Player(playerNames.get(i), i);
            list.add(player);
            System.out.println(player.name() + " was added");
            System.out.println("They are player number " + printPosition(player.position()));
        }
        return new Players(list);
    }

    private static int printPosition(int position) {
        return position +1;
    }

    public List<Player> asList() {
        return value;
    }

    public String nameFor(int position) {
        return value.get(position).name();
    }

    public int size() {
        return value.size();
    }
}
