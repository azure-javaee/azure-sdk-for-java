// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddVCenterRequestProperties;
import org.junit.jupiter.api.Assertions;

public final class AddVCenterRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AddVCenterRequestProperties model =
            BinaryData
                .fromString(
                    "{\"friendlyName\":\"dhzmmesckdlp\",\"ipAddress\":\"zrcxfailcfxwmdbo\",\"processServerId\":\"fgsftufqob\",\"port\":\"lnacgcc\",\"runAsAccountId\":\"nhxk\"}")
                .toObject(AddVCenterRequestProperties.class);
        Assertions.assertEquals("dhzmmesckdlp", model.friendlyName());
        Assertions.assertEquals("zrcxfailcfxwmdbo", model.ipAddress());
        Assertions.assertEquals("fgsftufqob", model.processServerId());
        Assertions.assertEquals("lnacgcc", model.port());
        Assertions.assertEquals("nhxk", model.runAsAccountId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AddVCenterRequestProperties model =
            new AddVCenterRequestProperties()
                .withFriendlyName("dhzmmesckdlp")
                .withIpAddress("zrcxfailcfxwmdbo")
                .withProcessServerId("fgsftufqob")
                .withPort("lnacgcc")
                .withRunAsAccountId("nhxk");
        model = BinaryData.fromObject(model).toObject(AddVCenterRequestProperties.class);
        Assertions.assertEquals("dhzmmesckdlp", model.friendlyName());
        Assertions.assertEquals("zrcxfailcfxwmdbo", model.ipAddress());
        Assertions.assertEquals("fgsftufqob", model.processServerId());
        Assertions.assertEquals("lnacgcc", model.port());
        Assertions.assertEquals("nhxk", model.runAsAccountId());
    }
}
