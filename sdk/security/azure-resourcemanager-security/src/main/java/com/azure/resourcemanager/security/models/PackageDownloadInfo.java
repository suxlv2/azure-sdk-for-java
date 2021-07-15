// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information on a specific package download. */
@Immutable
public class PackageDownloadInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PackageDownloadInfo.class);

    /*
     * Version number
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Download link
     */
    @JsonProperty(value = "link", access = JsonProperty.Access.WRITE_ONLY)
    private String link;

    /*
     * Kind of the version
     */
    @JsonProperty(value = "versionKind", access = JsonProperty.Access.WRITE_ONLY)
    private VersionKind versionKind;

    /**
     * Get the version property: Version number.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the link property: Download link.
     *
     * @return the link value.
     */
    public String link() {
        return this.link;
    }

    /**
     * Get the versionKind property: Kind of the version.
     *
     * @return the versionKind value.
     */
    public VersionKind versionKind() {
        return this.versionKind;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}