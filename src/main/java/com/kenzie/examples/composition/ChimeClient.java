package com.kenzie.examples.composition;

import java.util.List;

/**
 * Chime client interface used to retrieve conversation history between users.
 * It can also be used to send a message from one user to another
 * (from sender to receiver).
 **/
public interface ChimeClient {
    /**
     * Returns a conversation history between two users.
     * @param firstUser first user in the conversation
     * @param secondUser second user in the conversation
     * @return all messages that were exchanged in the conversation between the two users
     **/
    List<ChimeMessage> getConversationHistory(ChimeUser firstUser, ChimeUser secondUser);

    /**
     * This method allows addition of one message to the conversation between two users.
     * The order of users is important here since we need to know who is the sender
     * and who is the receiver.
     * @param sender The user for which we are sending the message
     * @param receiver The user to receive the message
     * @param message The message content
     **/
    void addMessageToConversation(ChimeUser sender, ChimeUser receiver, String message);

}