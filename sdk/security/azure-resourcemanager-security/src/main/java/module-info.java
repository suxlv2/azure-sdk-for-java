// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.security {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.security;
    exports com.azure.resourcemanager.security.fluent;
    exports com.azure.resourcemanager.security.fluent.models;
    exports com.azure.resourcemanager.security.models;

    opens com.azure.resourcemanager.security.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.security.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}