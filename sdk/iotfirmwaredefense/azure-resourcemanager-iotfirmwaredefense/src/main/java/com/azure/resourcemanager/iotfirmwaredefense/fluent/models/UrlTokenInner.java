// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Url data for creating or accessing a blob file. */
@Immutable
public final class UrlTokenInner {
    /*
     * SAS URL for creating or accessing a blob file.
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * SAS URL for file uploading. Kept for backwards compatibility
     */
    @JsonProperty(value = "uploadUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String uploadUrl;

    /** Creates an instance of UrlTokenInner class. */
    public UrlTokenInner() {
    }

    /**
     * Get the url property: SAS URL for creating or accessing a blob file.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the uploadUrl property: SAS URL for file uploading. Kept for backwards compatibility.
     *
     * @return the uploadUrl value.
     */
    public String uploadUrl() {
        return this.uploadUrl;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
