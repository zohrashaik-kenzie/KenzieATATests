package com.kenzie.examples.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * This client exposes functionality that allows users to view the Chime message
 * history in their native language.
 */
public class TranslatedChimeClient {
    private final ChimeClient client;
    private final ChimeTranslator translator;

    public TranslatedChimeClient(ChimeClient client, ChimeTranslator translator) {
        this.client = client;
        this.translator = translator;
    }
    /**
     * Get conversation history translated to the first user's native language.
     * @param firstUser first user
     * @param secondUser second user
     * @return list of translated chime messages
     */
    public List<ChimeMessage> getConversationHistoryFirstUserView(ChimeUser firstUser, ChimeUser secondUser){
        return getTranslatedMessages(firstUser, client.getConversationHistory(firstUser, secondUser));
    }
    /**
     * Get conversation history translated to the second user's native language.
     * @param firstUser first user
     * @param secondUser second user
     * @return list of translated chime messages
     */
    public List<ChimeMessage> getConversationHistorySecondUserView(ChimeUser firstUser, ChimeUser secondUser){
        return getTranslatedMessages(secondUser, client.getConversationHistory(firstUser, secondUser));
    }
    /**
     * Translate a list of messages to the native language of the reader.
     * @param reader The user reading the translated messages.
     * @param messages Original messages before translation.
     * @return List of translated messages.
     */
    private List<ChimeMessage> getTranslatedMessages(ChimeUser reader, List<ChimeMessage> messages) {
        List<ChimeMessage> translatedMessages = new ArrayList<>();
        for(ChimeMessage message : messages) {
            ChimeMessage translatedMessage = translator.translateForUser(reader, message);
            translatedMessages.add(translatedMessage);
        }
        return translatedMessages;
    }
}