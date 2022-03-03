package com.kenzie.examples.composition;

/**
 * This interface defines method for translating the message to the language spoken
 * by the message consumer.
 */
public interface ChimeTranslator {
    /**
     * Translate the message to the language spoken by the message consumer
     * @param messageConsumer the user that will read the message
     * @param message the actual message
     * @return message containing translated text
     */
    public ChimeMessage translateForUser(ChimeUser messageConsumer, ChimeMessage message);
}