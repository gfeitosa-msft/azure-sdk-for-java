// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An abstract representation of a tool that can be used by the model to improve a chat completions response.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = ChatCompletionsToolDefinition.class,
    visible = true)
@JsonTypeName("ChatCompletionsToolDefinition")
@JsonSubTypes({ @JsonSubTypes.Type(name = "function", value = ChatCompletionsFunctionToolDefinition.class) })
@Immutable
public class ChatCompletionsToolDefinition {

    /**
     * Creates an instance of ChatCompletionsToolDefinition class.
     */
    @Generated
    public ChatCompletionsToolDefinition() {
        this.type = "ChatCompletionsToolDefinition";
    }

    /*
     * The object type.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }
}
