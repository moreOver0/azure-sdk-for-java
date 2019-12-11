/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.LogicalNetworkInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.RecoveryServicesManager;

/**
 * Type representing LogicalNetwork.
 */
public interface LogicalNetwork extends HasInner<LogicalNetworkInner>, Indexable, Refreshable<LogicalNetwork>, HasManager<RecoveryServicesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    LogicalNetworkProperties properties();

    /**
     * @return the type value.
     */
    String type();

}