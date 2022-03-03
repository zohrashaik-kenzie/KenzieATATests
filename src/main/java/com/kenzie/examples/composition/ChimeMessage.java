package com.kenzie.examples.composition;

import java.time.ZonedDateTime;

public interface ChimeMessage {
    long getMessageId();
    /**
     * Actual content (message) sent from sender to receiver.
     * @return string content of the message.
     */
    String getContent();
    ZonedDateTime getDateCreated();
    ChimeUser getSender();

    ChimeUser getReciever();
}
