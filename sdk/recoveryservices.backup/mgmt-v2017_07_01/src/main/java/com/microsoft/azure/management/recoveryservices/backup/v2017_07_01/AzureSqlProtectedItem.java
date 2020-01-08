/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.ProtectedItemInner;

/**
 * Azure SQL workload-specific backup item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("Microsoft.Sql/servers/databases")
public class AzureSqlProtectedItem extends ProtectedItemInner {
    /**
     * Internal ID of a backup item. Used by Azure SQL Backup engine to contact
     * Recovery Services.
     */
    @JsonProperty(value = "protectedItemDataId")
    private String protectedItemDataId;

    /**
     * Backup state of the backed up item. Possible values include: 'Invalid',
     * 'IRPending', 'Protected', 'ProtectionError', 'ProtectionStopped',
     * 'ProtectionPaused'.
     */
    @JsonProperty(value = "protectionState")
    private ProtectedItemState protectionState;

    /**
     * Additional information for this backup item.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureSqlProtectedItemExtendedInfo extendedInfo;

    /**
     * Get internal ID of a backup item. Used by Azure SQL Backup engine to contact Recovery Services.
     *
     * @return the protectedItemDataId value
     */
    public String protectedItemDataId() {
        return this.protectedItemDataId;
    }

    /**
     * Set internal ID of a backup item. Used by Azure SQL Backup engine to contact Recovery Services.
     *
     * @param protectedItemDataId the protectedItemDataId value to set
     * @return the AzureSqlProtectedItem object itself.
     */
    public AzureSqlProtectedItem withProtectedItemDataId(String protectedItemDataId) {
        this.protectedItemDataId = protectedItemDataId;
        return this;
    }

    /**
     * Get backup state of the backed up item. Possible values include: 'Invalid', 'IRPending', 'Protected', 'ProtectionError', 'ProtectionStopped', 'ProtectionPaused'.
     *
     * @return the protectionState value
     */
    public ProtectedItemState protectionState() {
        return this.protectionState;
    }

    /**
     * Set backup state of the backed up item. Possible values include: 'Invalid', 'IRPending', 'Protected', 'ProtectionError', 'ProtectionStopped', 'ProtectionPaused'.
     *
     * @param protectionState the protectionState value to set
     * @return the AzureSqlProtectedItem object itself.
     */
    public AzureSqlProtectedItem withProtectionState(ProtectedItemState protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get additional information for this backup item.
     *
     * @return the extendedInfo value
     */
    public AzureSqlProtectedItemExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information for this backup item.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the AzureSqlProtectedItem object itself.
     */
    public AzureSqlProtectedItem withExtendedInfo(AzureSqlProtectedItemExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}