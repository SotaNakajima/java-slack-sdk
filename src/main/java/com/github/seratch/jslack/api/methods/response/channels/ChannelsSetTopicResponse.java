package com.github.seratch.jslack.api.methods.response.channels;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Data;

@Data
public class ChannelsSetTopicResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String topic;
}
