// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents a list of people detected in an image and their location.
 */
@Immutable
public final class PeopleResult {

    /*
     * A list of people detected in an image and their location.
     */
    @Generated
    @JsonProperty(value = "values")
    private List<DetectedPerson> values;

    /**
     * Creates an instance of PeopleResult class.
     * 
     * @param values the values value to set.
     */
    @Generated
    @JsonCreator
    private PeopleResult(@JsonProperty(value = "values") List<DetectedPerson> values) {
        this.values = values;
    }

    /**
     * Get the values property: A list of people detected in an image and their location.
     * 
     * @return the values value.
     */
    @Generated
    public List<DetectedPerson> getValues() {
        return this.values;
    }
}
