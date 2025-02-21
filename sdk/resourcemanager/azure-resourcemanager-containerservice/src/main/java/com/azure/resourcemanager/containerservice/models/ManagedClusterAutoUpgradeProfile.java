// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto upgrade profile for a managed cluster.
 */
@Fluent
public final class ManagedClusterAutoUpgradeProfile {
    /*
     * The upgrade channel for auto upgrade. The default is 'none'.
     *
     * For more information see [setting the AKS cluster auto-upgrade
     * channel](https://docs.microsoft.com/azure/aks/upgrade-cluster#set-auto-upgrade-channel).
     */
    @JsonProperty(value = "upgradeChannel")
    private UpgradeChannel upgradeChannel;

    /*
     * Node OS Upgrade Channel
     *
     * Manner in which the OS on your nodes is updated. The default is NodeImage.
     */
    @JsonProperty(value = "nodeOSUpgradeChannel")
    private NodeOSUpgradeChannel nodeOSUpgradeChannel;

    /**
     * Creates an instance of ManagedClusterAutoUpgradeProfile class.
     */
    public ManagedClusterAutoUpgradeProfile() {
    }

    /**
     * Get the upgradeChannel property: The upgrade channel for auto upgrade. The default is 'none'.
     *
     * For more information see [setting the AKS cluster auto-upgrade
     * channel](https://docs.microsoft.com/azure/aks/upgrade-cluster#set-auto-upgrade-channel).
     *
     * @return the upgradeChannel value.
     */
    public UpgradeChannel upgradeChannel() {
        return this.upgradeChannel;
    }

    /**
     * Set the upgradeChannel property: The upgrade channel for auto upgrade. The default is 'none'.
     *
     * For more information see [setting the AKS cluster auto-upgrade
     * channel](https://docs.microsoft.com/azure/aks/upgrade-cluster#set-auto-upgrade-channel).
     *
     * @param upgradeChannel the upgradeChannel value to set.
     * @return the ManagedClusterAutoUpgradeProfile object itself.
     */
    public ManagedClusterAutoUpgradeProfile withUpgradeChannel(UpgradeChannel upgradeChannel) {
        this.upgradeChannel = upgradeChannel;
        return this;
    }

    /**
     * Get the nodeOSUpgradeChannel property: Node OS Upgrade Channel
     *
     * Manner in which the OS on your nodes is updated. The default is NodeImage.
     *
     * @return the nodeOSUpgradeChannel value.
     */
    public NodeOSUpgradeChannel nodeOSUpgradeChannel() {
        return this.nodeOSUpgradeChannel;
    }

    /**
     * Set the nodeOSUpgradeChannel property: Node OS Upgrade Channel
     *
     * Manner in which the OS on your nodes is updated. The default is NodeImage.
     *
     * @param nodeOSUpgradeChannel the nodeOSUpgradeChannel value to set.
     * @return the ManagedClusterAutoUpgradeProfile object itself.
     */
    public ManagedClusterAutoUpgradeProfile withNodeOSUpgradeChannel(NodeOSUpgradeChannel nodeOSUpgradeChannel) {
        this.nodeOSUpgradeChannel = nodeOSUpgradeChannel;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
