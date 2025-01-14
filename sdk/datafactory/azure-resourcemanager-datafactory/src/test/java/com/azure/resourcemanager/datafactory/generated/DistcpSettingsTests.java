// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DistcpSettings;

public final class DistcpSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DistcpSettings model = BinaryData.fromString(
            "{\"resourceManagerEndpoint\":\"datawcaicd\",\"tempScriptPath\":\"datajttzfswohddliikk\",\"distcpOptions\":\"dataqpliegemtnbkev\"}")
            .toObject(DistcpSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DistcpSettings model = new DistcpSettings().withResourceManagerEndpoint("datawcaicd")
            .withTempScriptPath("datajttzfswohddliikk").withDistcpOptions("dataqpliegemtnbkev");
        model = BinaryData.fromObject(model).toObject(DistcpSettings.class);
    }
}
