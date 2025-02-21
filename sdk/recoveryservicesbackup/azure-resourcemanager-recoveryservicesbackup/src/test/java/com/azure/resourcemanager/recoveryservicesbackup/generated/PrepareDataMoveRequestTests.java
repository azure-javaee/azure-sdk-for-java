// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DataMoveLevel;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrepareDataMoveRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrepareDataMoveRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrepareDataMoveRequest model =
            BinaryData
                .fromString(
                    "{\"targetResourceId\":\"ujjugwdkcglh\",\"targetRegion\":\"lazjdyggdtjixhbk\",\"dataMoveLevel\":\"Container\",\"sourceContainerArmIds\":[\"wey\",\"hmenevfyexfwhybc\",\"bvyvdcsity\"],\"ignoreMoved\":false}")
                .toObject(PrepareDataMoveRequest.class);
        Assertions.assertEquals("ujjugwdkcglh", model.targetResourceId());
        Assertions.assertEquals("lazjdyggdtjixhbk", model.targetRegion());
        Assertions.assertEquals(DataMoveLevel.CONTAINER, model.dataMoveLevel());
        Assertions.assertEquals("wey", model.sourceContainerArmIds().get(0));
        Assertions.assertEquals(false, model.ignoreMoved());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrepareDataMoveRequest model =
            new PrepareDataMoveRequest()
                .withTargetResourceId("ujjugwdkcglh")
                .withTargetRegion("lazjdyggdtjixhbk")
                .withDataMoveLevel(DataMoveLevel.CONTAINER)
                .withSourceContainerArmIds(Arrays.asList("wey", "hmenevfyexfwhybc", "bvyvdcsity"))
                .withIgnoreMoved(false);
        model = BinaryData.fromObject(model).toObject(PrepareDataMoveRequest.class);
        Assertions.assertEquals("ujjugwdkcglh", model.targetResourceId());
        Assertions.assertEquals("lazjdyggdtjixhbk", model.targetRegion());
        Assertions.assertEquals(DataMoveLevel.CONTAINER, model.dataMoveLevel());
        Assertions.assertEquals("wey", model.sourceContainerArmIds().get(0));
        Assertions.assertEquals(false, model.ignoreMoved());
    }
}
