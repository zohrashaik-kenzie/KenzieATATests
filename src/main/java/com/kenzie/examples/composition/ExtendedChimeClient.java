package com.kenzie.examples.composition;

import java.util.List;

/**
 * This class contains a ChimeClient class and provides additional functionalities
 * that allow getting the last message from the conversation history and sending
 * the same message to all of the users contacts.
 */
public class ExtendedChimeClient {
    private final ChimeClient client;

    public ExtendedChimeClient(ChimeClient client) {
        this.client = client;
    }

    public List<ChimeMessage> getConversationHistory(ChimeUser firstUser, ChimeUser secondUser) {
        return client.getConversationHistory(firstUser, secondUser);
    }

    public void addMessageToConversation(ChimeUser sender, ChimeUser receiver, String message) {
        client.addMessageToConversation(sender, receiver, message);
    }


    /**
     * Get only the last message exchanged in the conversation between the two users.
     *
     * @param firstUser  first user in the conversation
     * @param secondUser second user in the conversation
     * @return last message exchanged in the conversation between the two users
     */
    public ChimeMessage getLastMessageFromConversationHistory(ChimeUser firstUser, ChimeUser secondUser) {
        List<ChimeMessage> conversationHistory = client.getConversationHistory(firstUser, secondUser);
        return conversationHistory.get(conversationHistory.size() - 1);
    }

    /**
     * This method allows addition of one message to all conversations between the given user
     * and other contacts.
     * *
     *
     * @param sender  The user for which we are sending the message
     * @param message The message content
     */
    public void addMessageToAllConversations(ChimeUser sender, List<ChimeUser> receivers, String message) {
        for (ChimeUser receiver : receivers) {
            client.addMessageToConversation(sender, receiver, message);
        }
    }
}
