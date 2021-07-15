// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Operator. */
public final class Operator extends ExpandableStringEnum<Operator> {
    /** Static value Equals for Operator. */
    public static final Operator EQUALS = fromString("Equals");

    /** Static value GreaterThan for Operator. */
    public static final Operator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqualTo for Operator. */
    public static final Operator GREATER_THAN_OR_EQUAL_TO = fromString("GreaterThanOrEqualTo");

    /** Static value LesserThan for Operator. */
    public static final Operator LESSER_THAN = fromString("LesserThan");

    /** Static value LesserThanOrEqualTo for Operator. */
    public static final Operator LESSER_THAN_OR_EQUAL_TO = fromString("LesserThanOrEqualTo");

    /** Static value NotEquals for Operator. */
    public static final Operator NOT_EQUALS = fromString("NotEquals");

    /** Static value Contains for Operator. */
    public static final Operator CONTAINS = fromString("Contains");

    /** Static value StartsWith for Operator. */
    public static final Operator STARTS_WITH = fromString("StartsWith");

    /** Static value EndsWith for Operator. */
    public static final Operator ENDS_WITH = fromString("EndsWith");

    /**
     * Creates or finds a Operator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Operator.
     */
    @JsonCreator
    public static Operator fromString(String name) {
        return fromString(name, Operator.class);
    }

    /** @return known Operator values. */
    public static Collection<Operator> values() {
        return values(Operator.class);
    }
}