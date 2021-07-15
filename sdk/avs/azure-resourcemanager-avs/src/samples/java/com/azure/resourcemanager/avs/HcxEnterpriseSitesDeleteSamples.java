// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for HcxEnterpriseSites Delete. */
public final class HcxEnterpriseSitesDeleteSamples {
    /**
     * Sample code: HcxEnterpriseSites_Delete.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void hcxEnterpriseSitesDelete(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.hcxEnterpriseSites().deleteWithResponse("group1", "cloud1", "site1", Context.NONE);
    }
}