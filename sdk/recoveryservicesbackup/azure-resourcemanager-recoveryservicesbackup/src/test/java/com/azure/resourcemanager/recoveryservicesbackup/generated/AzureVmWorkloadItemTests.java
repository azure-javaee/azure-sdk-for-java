// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureVmWorkloadItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureVmWorkloadItem model =
            BinaryData
                .fromString(
                    "{\"workloadItemType\":\"AzureVmWorkloadItem\",\"parentName\":\"rjb\",\"serverName\":\"pxdlv\",\"isAutoProtectable\":true,\"subinquireditemcount\":22052299,\"subWorkloadItemCount\":824374091,\"backupManagementType\":\"s\",\"workloadType\":\"wjksghudgzhxo\",\"friendlyName\":\"ggsvoujkxibdaf\",\"protectionState\":\"Protected\"}")
                .toObject(AzureVmWorkloadItem.class);
        Assertions.assertEquals("s", model.backupManagementType());
        Assertions.assertEquals("wjksghudgzhxo", model.workloadType());
        Assertions.assertEquals("ggsvoujkxibdaf", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
        Assertions.assertEquals("rjb", model.parentName());
        Assertions.assertEquals("pxdlv", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(22052299, model.subinquireditemcount());
        Assertions.assertEquals(824374091, model.subWorkloadItemCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureVmWorkloadItem model =
            new AzureVmWorkloadItem()
                .withBackupManagementType("s")
                .withWorkloadType("wjksghudgzhxo")
                .withFriendlyName("ggsvoujkxibdaf")
                .withProtectionState(ProtectionStatus.PROTECTED)
                .withParentName("rjb")
                .withServerName("pxdlv")
                .withIsAutoProtectable(true)
                .withSubinquireditemcount(22052299)
                .withSubWorkloadItemCount(824374091);
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadItem.class);
        Assertions.assertEquals("s", model.backupManagementType());
        Assertions.assertEquals("wjksghudgzhxo", model.workloadType());
        Assertions.assertEquals("ggsvoujkxibdaf", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
        Assertions.assertEquals("rjb", model.parentName());
        Assertions.assertEquals("pxdlv", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(22052299, model.subinquireditemcount());
        Assertions.assertEquals(824374091, model.subWorkloadItemCount());
    }
}
