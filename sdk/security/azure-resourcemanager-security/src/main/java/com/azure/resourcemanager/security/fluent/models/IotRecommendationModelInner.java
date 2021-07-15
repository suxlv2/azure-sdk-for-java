// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IoT recommendation. */
@JsonFlatten
@Fluent
public class IotRecommendationModelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotRecommendationModelInner.class);

    /*
     * Identifier of the device being reported on
     */
    @JsonProperty(value = "properties.deviceId", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceId;

    /*
     * The type name of the recommendation
     */
    @JsonProperty(value = "properties.recommendationType", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendationType;

    /*
     * The discovery time of the recommendation
     */
    @JsonProperty(value = "properties.discoveredTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private String discoveredTimeUtc;

    /*
     * A bag of fields which extends the recommendation information
     */
    @JsonProperty(value = "properties.recommendationAdditionalData")
    private Object recommendationAdditionalData;

    /**
     * Get the deviceId property: Identifier of the device being reported on.
     *
     * @return the deviceId value.
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Get the recommendationType property: The type name of the recommendation.
     *
     * @return the recommendationType value.
     */
    public String recommendationType() {
        return this.recommendationType;
    }

    /**
     * Get the discoveredTimeUtc property: The discovery time of the recommendation.
     *
     * @return the discoveredTimeUtc value.
     */
    public String discoveredTimeUtc() {
        return this.discoveredTimeUtc;
    }

    /**
     * Get the recommendationAdditionalData property: A bag of fields which extends the recommendation information.
     *
     * @return the recommendationAdditionalData value.
     */
    public Object recommendationAdditionalData() {
        return this.recommendationAdditionalData;
    }

    /**
     * Set the recommendationAdditionalData property: A bag of fields which extends the recommendation information.
     *
     * @param recommendationAdditionalData the recommendationAdditionalData value to set.
     * @return the IotRecommendationModelInner object itself.
     */
    public IotRecommendationModelInner withRecommendationAdditionalData(Object recommendationAdditionalData) {
        this.recommendationAdditionalData = recommendationAdditionalData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}