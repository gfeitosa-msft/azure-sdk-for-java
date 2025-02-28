// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The issue that caused the resource to by unhealthy.
 */
@Fluent
public final class Issue {
    /*
     * The unique issue key
     */
    @JsonProperty(value = "issueKey", required = true)
    private String issueKey;

    /*
     * The issue name
     */
    @JsonProperty(value = "issueName")
    private String issueName;

    /*
     * The affected security values that MDC offers that will be affected by the issue, for example: recommendations,
     * alerts, etc
     */
    @JsonProperty(value = "securityValues")
    private List<String> securityValues;

    /*
     * The issue description
     */
    @JsonProperty(value = "issueDescription")
    private String issueDescription;

    /*
     * Human readable description of what you should do to mitigate this health issue
     */
    @JsonProperty(value = "remediationSteps")
    private String remediationSteps;

    /*
     * The remediation script to solve this issue
     */
    @JsonProperty(value = "remediationScript")
    private String remediationScript;

    /*
     * Additional data for the given issue. The additional data depends on the issue type
     */
    @JsonProperty(value = "issueAdditionalData")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> issueAdditionalData;

    /**
     * Creates an instance of Issue class.
     */
    public Issue() {
    }

    /**
     * Get the issueKey property: The unique issue key.
     * 
     * @return the issueKey value.
     */
    public String issueKey() {
        return this.issueKey;
    }

    /**
     * Set the issueKey property: The unique issue key.
     * 
     * @param issueKey the issueKey value to set.
     * @return the Issue object itself.
     */
    public Issue withIssueKey(String issueKey) {
        this.issueKey = issueKey;
        return this;
    }

    /**
     * Get the issueName property: The issue name.
     * 
     * @return the issueName value.
     */
    public String issueName() {
        return this.issueName;
    }

    /**
     * Set the issueName property: The issue name.
     * 
     * @param issueName the issueName value to set.
     * @return the Issue object itself.
     */
    public Issue withIssueName(String issueName) {
        this.issueName = issueName;
        return this;
    }

    /**
     * Get the securityValues property: The affected security values that MDC offers that will be affected by the
     * issue, for example: recommendations, alerts, etc.
     * 
     * @return the securityValues value.
     */
    public List<String> securityValues() {
        return this.securityValues;
    }

    /**
     * Set the securityValues property: The affected security values that MDC offers that will be affected by the
     * issue, for example: recommendations, alerts, etc.
     * 
     * @param securityValues the securityValues value to set.
     * @return the Issue object itself.
     */
    public Issue withSecurityValues(List<String> securityValues) {
        this.securityValues = securityValues;
        return this;
    }

    /**
     * Get the issueDescription property: The issue description.
     * 
     * @return the issueDescription value.
     */
    public String issueDescription() {
        return this.issueDescription;
    }

    /**
     * Set the issueDescription property: The issue description.
     * 
     * @param issueDescription the issueDescription value to set.
     * @return the Issue object itself.
     */
    public Issue withIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
        return this;
    }

    /**
     * Get the remediationSteps property: Human readable description of what you should do to mitigate this health
     * issue.
     * 
     * @return the remediationSteps value.
     */
    public String remediationSteps() {
        return this.remediationSteps;
    }

    /**
     * Set the remediationSteps property: Human readable description of what you should do to mitigate this health
     * issue.
     * 
     * @param remediationSteps the remediationSteps value to set.
     * @return the Issue object itself.
     */
    public Issue withRemediationSteps(String remediationSteps) {
        this.remediationSteps = remediationSteps;
        return this;
    }

    /**
     * Get the remediationScript property: The remediation script to solve this issue.
     * 
     * @return the remediationScript value.
     */
    public String remediationScript() {
        return this.remediationScript;
    }

    /**
     * Set the remediationScript property: The remediation script to solve this issue.
     * 
     * @param remediationScript the remediationScript value to set.
     * @return the Issue object itself.
     */
    public Issue withRemediationScript(String remediationScript) {
        this.remediationScript = remediationScript;
        return this;
    }

    /**
     * Get the issueAdditionalData property: Additional data for the given issue. The additional data depends on the
     * issue type.
     * 
     * @return the issueAdditionalData value.
     */
    public Map<String, String> issueAdditionalData() {
        return this.issueAdditionalData;
    }

    /**
     * Set the issueAdditionalData property: Additional data for the given issue. The additional data depends on the
     * issue type.
     * 
     * @param issueAdditionalData the issueAdditionalData value to set.
     * @return the Issue object itself.
     */
    public Issue withIssueAdditionalData(Map<String, String> issueAdditionalData) {
        this.issueAdditionalData = issueAdditionalData;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (issueKey() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property issueKey in model Issue"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Issue.class);
}
