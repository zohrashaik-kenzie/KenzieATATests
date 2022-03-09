package com.kenzie.examples.composition;

import java.util.List;

/**
 * Read only Chime client interface used to retrieve conversation history
 * between users.
 */
public class ReadOnlyChimeClient  {
    private final ChimeClient client;

    public ReadOnlyChimeClient(ChimeClient client) {
        this.client = client;
    }

    List<ChimeMessage> getConversationHistory(ChimeUser firstUser, ChimeUser secondUser) {
        return client.getConversationHistory(firstUser, secondUser);
    }


}