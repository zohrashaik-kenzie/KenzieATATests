package com.kenzie.examples.composition;

import java.util.List;

public class GetLastMessageFromChimeClient {

    private ChimeClient client;

    public GetLastMessageFromChimeClient(ChimeClient client) {
        this.client = client;
    }

    public ChimeMessage getLastMessageFromConversationHistory(ChimeUser user1, ChimeUser user2){

        List<ChimeMessage> messageHistory = client.getConversationHistory(user1,user2);
        return messageHistory.get(messageHistory.size() -1);
    }
}
