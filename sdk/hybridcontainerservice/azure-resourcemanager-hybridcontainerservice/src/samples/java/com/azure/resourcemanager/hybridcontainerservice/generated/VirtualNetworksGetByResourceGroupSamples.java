// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

/**
 * Samples for VirtualNetworks GetByResourceGroup.
 */
public final class VirtualNetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2023-11-15-preview/examples/
     * GetVirtualNetwork.json
     */
    /**
     * Sample code: GetVirtualNetwork.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void
        getVirtualNetwork(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.virtualNetworks().getByResourceGroupWithResponse("test-arcappliance-resgrp", "test-vnet-static",
            com.azure.core.util.Context.NONE);
    }
}
