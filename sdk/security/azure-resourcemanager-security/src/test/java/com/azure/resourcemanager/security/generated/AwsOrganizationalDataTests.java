// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AwsOrganizationalData;

public final class AwsOrganizationalDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AwsOrganizationalData model =
            BinaryData
                .fromString("{\"organizationMembershipType\":\"AwsOrganizationalData\"}")
                .toObject(AwsOrganizationalData.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AwsOrganizationalData model = new AwsOrganizationalData();
        model = BinaryData.fromObject(model).toObject(AwsOrganizationalData.class);
    }
}
