// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for Microsoft Fabric LakeHouse Table.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("LakeHouseTableSource")
@Fluent
public final class LakeHouseTableSource extends CopySource {
    /*
     * Query an older snapshot by timestamp. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "timestampAsOf")
    private Object timestampAsOf;

    /*
     * Query an older snapshot by version. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "versionAsOf")
    private Object versionAsOf;

    /*
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or
     * Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private Object additionalColumns;

    /**
     * Creates an instance of LakeHouseTableSource class.
     */
    public LakeHouseTableSource() {
    }

    /**
     * Get the timestampAsOf property: Query an older snapshot by timestamp. Type: string (or Expression with
     * resultType string).
     * 
     * @return the timestampAsOf value.
     */
    public Object timestampAsOf() {
        return this.timestampAsOf;
    }

    /**
     * Set the timestampAsOf property: Query an older snapshot by timestamp. Type: string (or Expression with
     * resultType string).
     * 
     * @param timestampAsOf the timestampAsOf value to set.
     * @return the LakeHouseTableSource object itself.
     */
    public LakeHouseTableSource withTimestampAsOf(Object timestampAsOf) {
        this.timestampAsOf = timestampAsOf;
        return this;
    }

    /**
     * Get the versionAsOf property: Query an older snapshot by version. Type: integer (or Expression with resultType
     * integer).
     * 
     * @return the versionAsOf value.
     */
    public Object versionAsOf() {
        return this.versionAsOf;
    }

    /**
     * Set the versionAsOf property: Query an older snapshot by version. Type: integer (or Expression with resultType
     * integer).
     * 
     * @param versionAsOf the versionAsOf value to set.
     * @return the LakeHouseTableSource object itself.
     */
    public LakeHouseTableSource withVersionAsOf(Object versionAsOf) {
        this.versionAsOf = versionAsOf;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @return the additionalColumns value.
     */
    public Object additionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @param additionalColumns the additionalColumns value to set.
     * @return the LakeHouseTableSource object itself.
     */
    public LakeHouseTableSource withAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
