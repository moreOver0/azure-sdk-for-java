/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.management.compute.v2019_03_01.DiskSku;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2019_03_01.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2019_03_01.HyperVGeneration;
import com.microsoft.azure.management.compute.v2019_03_01.CreationData;
import com.microsoft.azure.management.compute.v2019_03_01.EncryptionSettingsCollection;
import com.microsoft.azure.management.compute.v2019_03_01.DiskState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Disk resource.
 */
@JsonFlatten
public class DiskInner extends Resource {
    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private DiskSku sku;

    /**
     * The Logical zone list for Disk.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * The time when the disk was created.
     */
    @JsonProperty(value = "properties.timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timeCreated;

    /**
     * The Operating System type. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only. Possible values include: 'V1', 'V2'.
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /**
     * Disk source information. CreationData information cannot be changed
     * after the disk has been created.
     */
    @JsonProperty(value = "properties.creationData", required = true)
    private CreationData creationData;

    /**
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /**
     * The size of the disk in bytes. This field is read only.
     */
    @JsonProperty(value = "properties.diskSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskSizeBytes;

    /**
     * Unique Guid identifying the resource.
     */
    @JsonProperty(value = "properties.uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /**
     * Encryption settings collection used for Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /**
     * The disk provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The number of IOPS allowed for this disk; only settable for UltraSSD
     * disks. One operation can transfer between 4k and 256k bytes.
     */
    @JsonProperty(value = "properties.diskIOPSReadWrite")
    private Long diskIOPSReadWrite;

    /**
     * The bandwidth allowed for this disk; only settable for UltraSSD disks.
     * MBps means millions of bytes per second - MB here uses the ISO notation,
     * of powers of 10.
     */
    @JsonProperty(value = "properties.diskMBpsReadWrite")
    private Integer diskMBpsReadWrite;

    /**
     * The state of the disk. Possible values include: 'Unattached',
     * 'Attached', 'Reserved', 'ActiveSAS', 'ReadyToUpload', 'ActiveUpload'.
     */
    @JsonProperty(value = "properties.diskState", access = JsonProperty.Access.WRITE_ONLY)
    private DiskState diskState;

    /**
     * Get a relative URI containing the ID of the VM that has the disk attached.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public DiskSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withSku(DiskSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the Logical zone list for Disk.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the Logical zone list for Disk.
     *
     * @param zones the zones value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the time when the disk was created.
     *
     * @return the timeCreated value
     */
    public DateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'.
     *
     * @return the hyperVGeneration value
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'.
     *
     * @param hyperVGeneration the hyperVGeneration value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get disk source information. CreationData information cannot be changed after the disk has been created.
     *
     * @return the creationData value
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set disk source information. CreationData information cannot be changed after the disk has been created.
     *
     * @param creationData the creationData value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get if creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set if creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value
     */
    public Long diskSizeBytes() {
        return this.diskSizeBytes;
    }

    /**
     * Get unique Guid identifying the resource.
     *
     * @return the uniqueId value
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the disk provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIOPSReadWrite value
     */
    public Long diskIOPSReadWrite() {
        return this.diskIOPSReadWrite;
    }

    /**
     * Set the number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIOPSReadWrite the diskIOPSReadWrite value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskIOPSReadWrite(Long diskIOPSReadWrite) {
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        return this;
    }

    /**
     * Get the bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @return the diskMBpsReadWrite value
     */
    public Integer diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskMBpsReadWrite(Integer diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Get the state of the disk. Possible values include: 'Unattached', 'Attached', 'Reserved', 'ActiveSAS', 'ReadyToUpload', 'ActiveUpload'.
     *
     * @return the diskState value
     */
    public DiskState diskState() {
        return this.diskState;
    }

}