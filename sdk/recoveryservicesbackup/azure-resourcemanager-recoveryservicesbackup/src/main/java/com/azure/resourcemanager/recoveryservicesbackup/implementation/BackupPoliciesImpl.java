// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupPoliciesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionPolicyResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupPolicies;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicyResource;

public final class BackupPoliciesImpl implements BackupPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(BackupPoliciesImpl.class);

    private final BackupPoliciesClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public BackupPoliciesImpl(
        BackupPoliciesClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProtectionPolicyResource> list(String vaultName, String resourceGroupName) {
        PagedIterable<ProtectionPolicyResourceInner> inner = this.serviceClient().list(vaultName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ProtectionPolicyResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectionPolicyResource> list(
        String vaultName, String resourceGroupName, String filter, Context context) {
        PagedIterable<ProtectionPolicyResourceInner> inner =
            this.serviceClient().list(vaultName, resourceGroupName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ProtectionPolicyResourceImpl(inner1, this.manager()));
    }

    private BackupPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
