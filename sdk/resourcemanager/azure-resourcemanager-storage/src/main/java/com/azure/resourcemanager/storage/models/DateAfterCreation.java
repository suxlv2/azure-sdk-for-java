// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Object to define the number of days after creation. */
@Fluent
public final class DateAfterCreation {
    /*
     * Value indicating the age in days after creation
     */
    @JsonProperty(value = "daysAfterCreationGreaterThan", required = true)
    private float daysAfterCreationGreaterThan;

    /**
     * Get the daysAfterCreationGreaterThan property: Value indicating the age in days after creation.
     *
     * @return the daysAfterCreationGreaterThan value.
     */
    public float daysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    /**
     * Set the daysAfterCreationGreaterThan property: Value indicating the age in days after creation.
     *
     * @param daysAfterCreationGreaterThan the daysAfterCreationGreaterThan value to set.
     * @return the DateAfterCreation object itself.
     */
    public DateAfterCreation withDaysAfterCreationGreaterThan(float daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = daysAfterCreationGreaterThan;
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
