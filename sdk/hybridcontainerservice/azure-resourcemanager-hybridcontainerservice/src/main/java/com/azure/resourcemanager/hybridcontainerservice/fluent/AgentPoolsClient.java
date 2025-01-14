// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.AgentPoolInner;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.AgentPoolListResultInner;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolPatch;

/**
 * An instance of this class provides access to all the operations defined in AgentPoolsClient.
 */
public interface AgentPoolsClient {
    /**
     * Gets the agent pool in the provisioned cluster instance
     * 
     * Gets the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agent pool in the Hybrid AKS provisioned cluster instance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgentPoolInner> getWithResponse(String connectedClusterResourceUri, String agentPoolName, Context context);

    /**
     * Gets the agent pool in the provisioned cluster instance
     * 
     * Gets the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agent pool in the Hybrid AKS provisioned cluster instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner get(String connectedClusterResourceUri, String agentPoolName);

    /**
     * Creates the agent pool in the provisioned cluster instance
     * 
     * Creates the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool The agentPool resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginCreateOrUpdate(String connectedClusterResourceUri,
        String agentPoolName, AgentPoolInner agentPool);

    /**
     * Creates the agent pool in the provisioned cluster instance
     * 
     * Creates the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool The agentPool resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginCreateOrUpdate(String connectedClusterResourceUri,
        String agentPoolName, AgentPoolInner agentPool, Context context);

    /**
     * Creates the agent pool in the provisioned cluster instance
     * 
     * Creates the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool The agentPool resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner createOrUpdate(String connectedClusterResourceUri, String agentPoolName, AgentPoolInner agentPool);

    /**
     * Creates the agent pool in the provisioned cluster instance
     * 
     * Creates the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool The agentPool resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner createOrUpdate(String connectedClusterResourceUri, String agentPoolName, AgentPoolInner agentPool,
        Context context);

    /**
     * Deletes the agent pool in the provisioned cluster instance
     * 
     * Deletes the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String connectedClusterResourceUri, String agentPoolName);

    /**
     * Deletes the agent pool in the provisioned cluster instance
     * 
     * Deletes the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String connectedClusterResourceUri, String agentPoolName,
        Context context);

    /**
     * Deletes the agent pool in the provisioned cluster instance
     * 
     * Deletes the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String connectedClusterResourceUri, String agentPoolName);

    /**
     * Deletes the agent pool in the provisioned cluster instance
     * 
     * Deletes the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String connectedClusterResourceUri, String agentPoolName, Context context);

    /**
     * Updates the agent pool in the provisioned cluster instance
     * 
     * Updates the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool The agentPool resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginUpdate(String connectedClusterResourceUri,
        String agentPoolName, AgentPoolPatch agentPool);

    /**
     * Updates the agent pool in the provisioned cluster instance
     * 
     * Updates the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool The agentPool resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginUpdate(String connectedClusterResourceUri,
        String agentPoolName, AgentPoolPatch agentPool, Context context);

    /**
     * Updates the agent pool in the provisioned cluster instance
     * 
     * Updates the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool The agentPool resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner update(String connectedClusterResourceUri, String agentPoolName, AgentPoolPatch agentPool);

    /**
     * Updates the agent pool in the provisioned cluster instance
     * 
     * Updates the agent pool in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool The agentPool resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner update(String connectedClusterResourceUri, String agentPoolName, AgentPoolPatch agentPool,
        Context context);

    /**
     * Gets the agent pools in the provisioned cluster instance
     * 
     * Gets the agent pools in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agent pools in the Hybrid AKS provisioned cluster instance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgentPoolListResultInner> listByProvisionedClusterWithResponse(String connectedClusterResourceUri,
        Context context);

    /**
     * Gets the agent pools in the provisioned cluster instance
     * 
     * Gets the agent pools in the Hybrid AKS provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource manager identifier of the connected cluster
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agent pools in the Hybrid AKS provisioned cluster instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolListResultInner listByProvisionedCluster(String connectedClusterResourceUri);
}
