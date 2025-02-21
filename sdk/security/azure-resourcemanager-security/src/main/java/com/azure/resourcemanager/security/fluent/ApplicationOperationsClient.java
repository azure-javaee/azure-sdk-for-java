// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.ApplicationInner;

/** An instance of this class provides access to all the operations defined in ApplicationOperationsClient. */
public interface ApplicationOperationsClient {
    /**
     * Get a specific application for the requested scope by applicationId.
     *
     * @param applicationId The security Application key - unique key for the standard application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific application for the requested scope by applicationId along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> getWithResponse(String applicationId, Context context);

    /**
     * Get a specific application for the requested scope by applicationId.
     *
     * @param applicationId The security Application key - unique key for the standard application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific application for the requested scope by applicationId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner get(String applicationId);

    /**
     * Creates or update a security application on the given subscription.
     *
     * @param applicationId The security Application key - unique key for the standard application.
     * @param application Application over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Application over a given scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> createOrUpdateWithResponse(
        String applicationId, ApplicationInner application, Context context);

    /**
     * Creates or update a security application on the given subscription.
     *
     * @param applicationId The security Application key - unique key for the standard application.
     * @param application Application over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Application over a given scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner createOrUpdate(String applicationId, ApplicationInner application);

    /**
     * Delete an Application over a given scope.
     *
     * @param applicationId The security Application key - unique key for the standard application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String applicationId, Context context);

    /**
     * Delete an Application over a given scope.
     *
     * @param applicationId The security Application key - unique key for the standard application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String applicationId);
}
