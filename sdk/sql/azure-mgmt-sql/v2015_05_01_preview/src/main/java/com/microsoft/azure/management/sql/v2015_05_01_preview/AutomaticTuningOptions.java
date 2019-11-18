/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Automatic tuning properties for individual advisors.
 */
public class AutomaticTuningOptions {
    /**
     * Automatic tuning option desired state. Possible values include: 'Off',
     * 'On', 'Default'.
     */
    @JsonProperty(value = "desiredState")
    private AutomaticTuningOptionModeDesired desiredState;

    /**
     * Automatic tuning option actual state. Possible values include: 'Off',
     * 'On'.
     */
    @JsonProperty(value = "actualState", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningOptionModeActual actualState;

    /**
     * Reason code if desired and actual state are different.
     */
    @JsonProperty(value = "reasonCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer reasonCode;

    /**
     * Reason description if desired and actual state are different. Possible
     * values include: 'Default', 'Disabled', 'AutoConfigured',
     * 'InheritedFromServer', 'QueryStoreOff', 'QueryStoreReadOnly',
     * 'NotSupported'.
     */
    @JsonProperty(value = "reasonDesc", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningDisabledReason reasonDesc;

    /**
     * Get automatic tuning option desired state. Possible values include: 'Off', 'On', 'Default'.
     *
     * @return the desiredState value
     */
    public AutomaticTuningOptionModeDesired desiredState() {
        return this.desiredState;
    }

    /**
     * Set automatic tuning option desired state. Possible values include: 'Off', 'On', 'Default'.
     *
     * @param desiredState the desiredState value to set
     * @return the AutomaticTuningOptions object itself.
     */
    public AutomaticTuningOptions withDesiredState(AutomaticTuningOptionModeDesired desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * Get automatic tuning option actual state. Possible values include: 'Off', 'On'.
     *
     * @return the actualState value
     */
    public AutomaticTuningOptionModeActual actualState() {
        return this.actualState;
    }

    /**
     * Get reason code if desired and actual state are different.
     *
     * @return the reasonCode value
     */
    public Integer reasonCode() {
        return this.reasonCode;
    }

    /**
     * Get reason description if desired and actual state are different. Possible values include: 'Default', 'Disabled', 'AutoConfigured', 'InheritedFromServer', 'QueryStoreOff', 'QueryStoreReadOnly', 'NotSupported'.
     *
     * @return the reasonDesc value
     */
    public AutomaticTuningDisabledReason reasonDesc() {
        return this.reasonDesc;
    }

}