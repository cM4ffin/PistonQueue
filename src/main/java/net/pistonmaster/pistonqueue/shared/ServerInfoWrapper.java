package net.pistonmaster.pistonqueue.shared;

import java.util.List;

public interface ServerInfoWrapper {
    List<PlayerWrapper> getConnectedPlayers();

    boolean isOnline();
}
