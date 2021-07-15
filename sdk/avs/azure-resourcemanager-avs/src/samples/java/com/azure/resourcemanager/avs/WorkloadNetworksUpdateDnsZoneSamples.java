// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsZone;
import java.util.Arrays;

/** Samples for WorkloadNetworks UpdateDnsZone. */
public final class WorkloadNetworksUpdateDnsZoneSamples {
    /**
     * Sample code: WorkloadNetworks_UpdateDnsZone.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksUpdateDnsZone(com.azure.resourcemanager.avs.AvsManager avsManager) {
        WorkloadNetworkDnsZone resource =
            avsManager
                .workloadNetworks()
                .getDnsZoneWithResponse("group1", "cloud1", "dnsZone1", Context.NONE)
                .getValue();
        resource
            .update()
            .withDisplayName("dnsZone1")
            .withDomain(Arrays.asList())
            .withDnsServerIps(Arrays.asList("1.1.1.1"))
            .withSourceIp("8.8.8.8")
            .withRevision(1L)
            .apply();
    }
}