// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IngestionSettings Delete. */
public final class IngestionSettingsDeleteSamples {
    /**
     * Sample code: Delete an ingestion setting for the subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void deleteAnIngestionSettingForTheSubscription(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.ingestionSettings().deleteWithResponse("default", Context.NONE);
    }
}