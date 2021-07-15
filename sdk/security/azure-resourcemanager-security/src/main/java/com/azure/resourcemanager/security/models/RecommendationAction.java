// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecommendationAction. */
public final class RecommendationAction extends ExpandableStringEnum<RecommendationAction> {
    /** Static value Recommended for RecommendationAction. */
    public static final RecommendationAction RECOMMENDED = fromString("Recommended");

    /** Static value Add for RecommendationAction. */
    public static final RecommendationAction ADD = fromString("Add");

    /** Static value Remove for RecommendationAction. */
    public static final RecommendationAction REMOVE = fromString("Remove");

    /**
     * Creates or finds a RecommendationAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecommendationAction.
     */
    @JsonCreator
    public static RecommendationAction fromString(String name) {
        return fromString(name, RecommendationAction.class);
    }

    /** @return known RecommendationAction values. */
    public static Collection<RecommendationAction> values() {
        return values(RecommendationAction.class);
    }
}