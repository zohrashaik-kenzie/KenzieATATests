package com.kenzie.examples.composition;

import java.util.List;

/**
 * This class encapsulates ChimeClient class and provides method that transforms the
 * conversation history from a list of message objects to a string representation of the
 * conversation.
 */
public class TransformedChimeClient {
    private final ChimeClient client;
    public TransformedChimeClient(ChimeClient client) {
        this.client = client;
    }
    public void addMessageToConversation(ChimeUser sender, ChimeUser receiver, String message) {
        client.addMessageToConversation(sender, receiver, message);
    }
    /**
     * Returns a string representation of conversation history where each message is separated
     * by a newline.
     * @param firstUser first user in the conversation
     * @param secondUser second user in the conversation
     * @return string representation of all messages that were exchanged in the conversation between the two users
     */
    public String getConversationHistory(ChimeUser firstUser, ChimeUser secondUser){
        List<ChimeMessage> conversationHistory = client.getConversationHistory(firstUser, secondUser);
        StringBuilder builder = new StringBuilder();
        for (ChimeMessage chimeMessage : conversationHistory) {
            builder.append(chimeMessage.toString()).append(System.lineSeparator());
        }
        return builder.toString();
    }
}