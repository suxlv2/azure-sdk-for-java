// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KindValue. */
public final class KindValue extends ExpandableStringEnum<KindValue> {
    /** Static value Bundles for KindValue. */
    public static final KindValue BUNDLES = fromString("Bundles");

    /**
     * Creates or finds a KindValue from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KindValue.
     */
    @JsonCreator
    public static KindValue fromString(String name) {
        return fromString(name, KindValue.class);
    }

    /** @return known KindValue values. */
    public static Collection<KindValue> values() {
        return values(KindValue.class);
    }
}