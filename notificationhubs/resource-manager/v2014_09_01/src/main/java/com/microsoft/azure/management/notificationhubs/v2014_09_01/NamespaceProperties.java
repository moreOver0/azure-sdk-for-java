/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Namespace properties.
 */
public class NamespaceProperties {
    /**
     * The name of the namespace.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets provisioning state of the Namespace.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Specifies the targeted region in which the namespace should be created.
     * It can be any of the following values: Australia EastAustralia
     * SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central
     * USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth
     * EuropeWest Europe.
     */
    @JsonProperty(value = "region")
    private String region;

    /**
     * Status of the namespace. It can be any of these values:1 =
     * Created/Active2 = Creating3 = Suspended4 = Deleting.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The time the namespace was created.
     */
    @JsonProperty(value = "createdAt")
    private DateTime createdAt;

    /**
     * Endpoint you can use to perform NotificationHub operations.
     */
    @JsonProperty(value = "serviceBusEndpoint")
    private String serviceBusEndpoint;

    /**
     * The Id of the Azure subscription associated with the namespace.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * ScaleUnit where the namespace gets created.
     */
    @JsonProperty(value = "scaleUnit")
    private String scaleUnit;

    /**
     * Whether or not the namespace is currently enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Whether or not the namespace is set as Critical.
     */
    @JsonProperty(value = "critical")
    private Boolean critical;

    /**
     * Gets or sets the namespace type. Possible values include: 'Messaging',
     * 'NotificationHub'.
     */
    @JsonProperty(value = "namespaceType")
    private NamespaceType namespaceType;

    /**
     * Get the name of the namespace.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the namespace.
     *
     * @param name the name value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets provisioning state of the Namespace.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets or sets provisioning state of the Namespace.
     *
     * @param provisioningState the provisioningState value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia EastAustralia SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth EuropeWest Europe.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Set specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia EastAustralia SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth EuropeWest Europe.
     *
     * @param region the region value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting.
     *
     * @param status the status value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the time the namespace was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Set the time the namespace was created.
     *
     * @param createdAt the createdAt value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get endpoint you can use to perform NotificationHub operations.
     *
     * @return the serviceBusEndpoint value
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Set endpoint you can use to perform NotificationHub operations.
     *
     * @param serviceBusEndpoint the serviceBusEndpoint value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withServiceBusEndpoint(String serviceBusEndpoint) {
        this.serviceBusEndpoint = serviceBusEndpoint;
        return this;
    }

    /**
     * Get the Id of the Azure subscription associated with the namespace.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the Id of the Azure subscription associated with the namespace.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get scaleUnit where the namespace gets created.
     *
     * @return the scaleUnit value
     */
    public String scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Set scaleUnit where the namespace gets created.
     *
     * @param scaleUnit the scaleUnit value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withScaleUnit(String scaleUnit) {
        this.scaleUnit = scaleUnit;
        return this;
    }

    /**
     * Get whether or not the namespace is currently enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set whether or not the namespace is currently enabled.
     *
     * @param enabled the enabled value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get whether or not the namespace is set as Critical.
     *
     * @return the critical value
     */
    public Boolean critical() {
        return this.critical;
    }

    /**
     * Set whether or not the namespace is set as Critical.
     *
     * @param critical the critical value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withCritical(Boolean critical) {
        this.critical = critical;
        return this;
    }

    /**
     * Get gets or sets the namespace type. Possible values include: 'Messaging', 'NotificationHub'.
     *
     * @return the namespaceType value
     */
    public NamespaceType namespaceType() {
        return this.namespaceType;
    }

    /**
     * Set gets or sets the namespace type. Possible values include: 'Messaging', 'NotificationHub'.
     *
     * @param namespaceType the namespaceType value to set
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withNamespaceType(NamespaceType namespaceType) {
        this.namespaceType = namespaceType;
        return this;
    }

}