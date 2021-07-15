// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkSegmentInner;
import com.azure.resourcemanager.avs.models.SegmentStatusEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegment;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentPortVif;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentProvisioningState;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentSubnet;
import java.util.Collections;
import java.util.List;

public final class WorkloadNetworkSegmentImpl
    implements WorkloadNetworkSegment, WorkloadNetworkSegment.Definition, WorkloadNetworkSegment.Update {
    private WorkloadNetworkSegmentInner innerObject;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String connectedGateway() {
        return this.innerModel().connectedGateway();
    }

    public WorkloadNetworkSegmentSubnet subnet() {
        return this.innerModel().subnet();
    }

    public List<WorkloadNetworkSegmentPortVif> portVif() {
        List<WorkloadNetworkSegmentPortVif> inner = this.innerModel().portVif();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SegmentStatusEnum status() {
        return this.innerModel().status();
    }

    public WorkloadNetworkSegmentProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Long revision() {
        return this.innerModel().revision();
    }

    public WorkloadNetworkSegmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String privateCloudName;

    private String segmentId;

    public WorkloadNetworkSegmentImpl withExistingPrivateCloud(String resourceGroupName, String privateCloudName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        return this;
    }

    public WorkloadNetworkSegment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .createSegments(resourceGroupName, privateCloudName, segmentId, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadNetworkSegment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .createSegments(resourceGroupName, privateCloudName, segmentId, this.innerModel(), context);
        return this;
    }

    WorkloadNetworkSegmentImpl(String name, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = new WorkloadNetworkSegmentInner();
        this.serviceManager = serviceManager;
        this.segmentId = name;
    }

    public WorkloadNetworkSegmentImpl update() {
        return this;
    }

    public WorkloadNetworkSegment apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .updateSegments(resourceGroupName, privateCloudName, segmentId, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadNetworkSegment apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .updateSegments(resourceGroupName, privateCloudName, segmentId, this.innerModel(), context);
        return this;
    }

    WorkloadNetworkSegmentImpl(
        WorkloadNetworkSegmentInner innerObject, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.privateCloudName = Utils.getValueFromIdByName(innerObject.id(), "privateClouds");
        this.segmentId = Utils.getValueFromIdByName(innerObject.id(), "segments");
    }

    public WorkloadNetworkSegment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .getSegmentWithResponse(resourceGroupName, privateCloudName, segmentId, Context.NONE)
                .getValue();
        return this;
    }

    public WorkloadNetworkSegment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .getSegmentWithResponse(resourceGroupName, privateCloudName, segmentId, context)
                .getValue();
        return this;
    }

    public WorkloadNetworkSegmentImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public WorkloadNetworkSegmentImpl withConnectedGateway(String connectedGateway) {
        this.innerModel().withConnectedGateway(connectedGateway);
        return this;
    }

    public WorkloadNetworkSegmentImpl withSubnet(WorkloadNetworkSegmentSubnet subnet) {
        this.innerModel().withSubnet(subnet);
        return this;
    }

    public WorkloadNetworkSegmentImpl withRevision(Long revision) {
        this.innerModel().withRevision(revision);
        return this;
    }
}