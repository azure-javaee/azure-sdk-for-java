// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for ApiPortals Get. */
public final class ApiPortalsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/ApiPortals_Get.json
     */
    /**
     * Sample code: ApiPortals_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void apiPortalsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getApiPortals()
            .getWithResponse("myResourceGroup", "myservice", "default", Context.NONE);
    }
}
