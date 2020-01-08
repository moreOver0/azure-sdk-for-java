/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import rx.Completable;
import com.microsoft.azure.management.mediaservices.v2015_10_01.implementation.MediaServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing MediaServices.
 */
public interface MediaServices extends SupportsCreating<MediaService.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<MediaService>, SupportsListingByResourceGroup<MediaService>, HasInner<MediaServicesInner> {
    /**
     * Regenerates a primary or secondary key for a Media Service.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param mediaServiceName Name of the Media Service.
     * @param keyType The keyType indicating which key you want to regenerate, Primary or Secondary. Possible values include: 'Primary', 'Secondary'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegenerateKeyOutput> regenerateKeyAsync(String resourceGroupName, String mediaServiceName, KeyType keyType);

    /**
     * Lists the keys for a Media Service.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param mediaServiceName Name of the Media Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceKeys> listKeysAsync(String resourceGroupName, String mediaServiceName);

    /**
     * Synchronizes storage account keys for a storage account associated with the Media Service account.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param mediaServiceName Name of the Media Service.
     * @param id The id of the storage account resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable syncStorageKeysAsync(String resourceGroupName, String mediaServiceName, String id);

    /**
     * Checks whether the Media Service resource name is available. The name must be globally unique.
     *
     * @param name The name of the resource. A name must be globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameAvailabilityOutput> checkNameAvailabilityAsync(String name);

}