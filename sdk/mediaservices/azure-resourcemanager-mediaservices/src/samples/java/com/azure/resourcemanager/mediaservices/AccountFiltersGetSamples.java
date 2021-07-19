// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for AccountFilters Get. */
public final class AccountFiltersGetSamples {
    /**
     * Sample code: Get an Account Filter by name.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void getAnAccountFilterByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .accountFilters()
            .getWithResponse("contoso", "contosomedia", "accountFilterWithTrack", Context.NONE);
    }
}