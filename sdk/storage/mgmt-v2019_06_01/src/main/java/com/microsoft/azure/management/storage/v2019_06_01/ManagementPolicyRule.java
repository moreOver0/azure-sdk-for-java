/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that wraps the Lifecycle rule. Each rule is uniquely defined by
 * name.
 */
public class ManagementPolicyRule {
    /**
     * Rule is enabled if set to true.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * A rule name can contain any combination of alpha numeric characters.
     * Rule name is case-sensitive. It must be unique within a policy.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The valid value is Lifecycle.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * An object that defines the Lifecycle rule.
     */
    @JsonProperty(value = "definition", required = true)
    private ManagementPolicyDefinition definition;

    /**
     * Creates an instance of ManagementPolicyRule class.
     * @param name a rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * @param definition an object that defines the Lifecycle rule.
     */
    public ManagementPolicyRule() {
        type = "Lifecycle";
    }

    /**
     * Get rule is enabled if set to true.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set rule is enabled if set to true.
     *
     * @param enabled the enabled value to set
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get a rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set a rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     *
     * @param name the name value to set
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the valid value is Lifecycle.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the valid value is Lifecycle.
     *
     * @param type the type value to set
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get an object that defines the Lifecycle rule.
     *
     * @return the definition value
     */
    public ManagementPolicyDefinition definition() {
        return this.definition;
    }

    /**
     * Set an object that defines the Lifecycle rule.
     *
     * @param definition the definition value to set
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withDefinition(ManagementPolicyDefinition definition) {
        this.definition = definition;
        return this;
    }

}