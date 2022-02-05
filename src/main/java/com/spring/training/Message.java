package com.spring.training;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @JsonProperty("from")
    String from;
    @JsonProperty("to")
    String to;
    @JsonProperty("content")
    String content;
}
