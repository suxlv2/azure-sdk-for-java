// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.ExternalSecuritySolutionInner;

/** An instance of this class provides access to all the operations defined in ExternalSecuritySolutionsClient. */
public interface ExternalSecuritySolutionsClient {
    /**
     * Gets a list of external security solutions for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external security solutions for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExternalSecuritySolutionInner> list();

    /**
     * Gets a list of external security solutions for the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external security solutions for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExternalSecuritySolutionInner> list(Context context);

    /**
     * Gets a list of external Security Solutions for the subscription and location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external Security Solutions for the subscription and location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExternalSecuritySolutionInner> listByHomeRegion(String ascLocation);

    /**
     * Gets a list of external Security Solutions for the subscription and location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external Security Solutions for the subscription and location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExternalSecuritySolutionInner> listByHomeRegion(String ascLocation, Context context);

    /**
     * Gets a specific external Security Solution.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param externalSecuritySolutionsName Name of an external security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific external Security Solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExternalSecuritySolutionInner get(
        String resourceGroupName, String ascLocation, String externalSecuritySolutionsName);

    /**
     * Gets a specific external Security Solution.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param externalSecuritySolutionsName Name of an external security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific external Security Solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExternalSecuritySolutionInner> getWithResponse(
        String resourceGroupName, String ascLocation, String externalSecuritySolutionsName, Context context);
}