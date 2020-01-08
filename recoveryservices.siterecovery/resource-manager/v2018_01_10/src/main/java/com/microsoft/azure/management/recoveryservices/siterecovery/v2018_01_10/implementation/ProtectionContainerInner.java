/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ProtectionContainerProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Protection container details.
 */
public class ProtectionContainerInner extends ProxyResource {
    /**
     * The custom data.
     */
    @JsonProperty(value = "properties")
    private ProtectionContainerProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the custom data.
     *
     * @return the properties value
     */
    public ProtectionContainerProperties properties() {
        return this.properties;
    }

    /**
     * Set the custom data.
     *
     * @param properties the properties value to set
     * @return the ProtectionContainerInner object itself.
     */
    public ProtectionContainerInner withProperties(ProtectionContainerProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get resource Location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource Location.
     *
     * @param location the location value to set
     * @return the ProtectionContainerInner object itself.
     */
    public ProtectionContainerInner withLocation(String location) {
        this.location = location;
        return this;
    }

}