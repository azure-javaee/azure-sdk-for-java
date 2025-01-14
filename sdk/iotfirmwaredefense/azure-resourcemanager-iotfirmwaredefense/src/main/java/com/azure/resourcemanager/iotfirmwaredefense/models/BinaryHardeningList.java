// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.BinaryHardeningInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List result for binary hardening. */
@Fluent
public final class BinaryHardeningList {
    /*
     * The list of binary hardening results.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<BinaryHardeningInner> value;

    /*
     * The uri to fetch the next page of asset.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of BinaryHardeningList class. */
    public BinaryHardeningList() {
    }

    /**
     * Get the value property: The list of binary hardening results.
     *
     * @return the value value.
     */
    public List<BinaryHardeningInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of asset.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of asset.
     *
     * @param nextLink the nextLink value to set.
     * @return the BinaryHardeningList object itself.
     */
    public BinaryHardeningList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
