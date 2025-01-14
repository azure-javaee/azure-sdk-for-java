// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudSink;
import com.azure.resourcemanager.datafactory.models.SalesforceSinkWriteBehavior;
import org.junit.jupiter.api.Assertions;

public final class SalesforceServiceCloudSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudSink model = BinaryData.fromString(
            "{\"type\":\"SalesforceServiceCloudSink\",\"writeBehavior\":\"Insert\",\"externalIdFieldName\":\"dataumuxnabi\",\"ignoreNullValues\":\"datamck\",\"writeBatchSize\":\"datamxzsmpoiutaa\",\"writeBatchTimeout\":\"datapbiojncgjogm\",\"sinkRetryCount\":\"dataykekmgpsea\",\"sinkRetryWait\":\"datadqpwhp\",\"maxConcurrentConnections\":\"datadosfgbvsozjf\",\"disableMetricsCollection\":\"datawxcjciotlbpuemqe\",\"\":{\"ylycrldwc\":\"datatuvhhedc\"}}")
            .toObject(SalesforceServiceCloudSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.INSERT, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudSink model = new SalesforceServiceCloudSink().withWriteBatchSize("datamxzsmpoiutaa")
            .withWriteBatchTimeout("datapbiojncgjogm").withSinkRetryCount("dataykekmgpsea")
            .withSinkRetryWait("datadqpwhp").withMaxConcurrentConnections("datadosfgbvsozjf")
            .withDisableMetricsCollection("datawxcjciotlbpuemqe").withWriteBehavior(SalesforceSinkWriteBehavior.INSERT)
            .withExternalIdFieldName("dataumuxnabi").withIgnoreNullValues("datamck");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.INSERT, model.writeBehavior());
    }
}
