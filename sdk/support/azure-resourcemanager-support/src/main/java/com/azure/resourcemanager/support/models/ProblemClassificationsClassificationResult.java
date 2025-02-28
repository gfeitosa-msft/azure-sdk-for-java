// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.support.fluent.models.ClassificationService;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ProblemClassification Classification result object.
 */
@Fluent
public final class ProblemClassificationsClassificationResult {
    /*
     * Identifier that may be used for solution discovery or some other purposes.
     */
    @JsonProperty(value = "problemId", access = JsonProperty.Access.WRITE_ONLY)
    private String problemId;

    /*
     * Title of the problem classification result.
     */
    @JsonProperty(value = "title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /*
     * Description of the problem classification result.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Identifier of the service associated with this problem classification result.
     */
    @JsonProperty(value = "serviceId", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceId;

    /*
     * Identifier that may be used for support ticket creation.
     */
    @JsonProperty(value = "problemClassificationId", access = JsonProperty.Access.WRITE_ONLY)
    private String problemClassificationId;

    /*
     * Related service.
     */
    @JsonProperty(value = "relatedService")
    private ClassificationService innerRelatedService;

    /**
     * Creates an instance of ProblemClassificationsClassificationResult class.
     */
    public ProblemClassificationsClassificationResult() {
    }

    /**
     * Get the problemId property: Identifier that may be used for solution discovery or some other purposes.
     * 
     * @return the problemId value.
     */
    public String problemId() {
        return this.problemId;
    }

    /**
     * Get the title property: Title of the problem classification result.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Get the description property: Description of the problem classification result.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the serviceId property: Identifier of the service associated with this problem classification result.
     * 
     * @return the serviceId value.
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Get the problemClassificationId property: Identifier that may be used for support ticket creation.
     * 
     * @return the problemClassificationId value.
     */
    public String problemClassificationId() {
        return this.problemClassificationId;
    }

    /**
     * Get the innerRelatedService property: Related service.
     * 
     * @return the innerRelatedService value.
     */
    private ClassificationService innerRelatedService() {
        return this.innerRelatedService;
    }

    /**
     * Get the serviceId property: Azure resource Id of the service.
     * 
     * @return the serviceId value.
     */
    public String serviceIdRelatedServiceServiceId() {
        return this.innerRelatedService() == null ? null : this.innerRelatedService().serviceId();
    }

    /**
     * Get the displayName property: Localized name of the azure service.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerRelatedService() == null ? null : this.innerRelatedService().displayName();
    }

    /**
     * Get the resourceTypes property: List of applicable ARM resource types for this service.
     * 
     * @return the resourceTypes value.
     */
    public List<String> resourceTypes() {
        return this.innerRelatedService() == null ? null : this.innerRelatedService().resourceTypes();
    }

    /**
     * Set the resourceTypes property: List of applicable ARM resource types for this service.
     * 
     * @param resourceTypes the resourceTypes value to set.
     * @return the ProblemClassificationsClassificationResult object itself.
     */
    public ProblemClassificationsClassificationResult withResourceTypes(List<String> resourceTypes) {
        if (this.innerRelatedService() == null) {
            this.innerRelatedService = new ClassificationService();
        }
        this.innerRelatedService().withResourceTypes(resourceTypes);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerRelatedService() != null) {
            innerRelatedService().validate();
        }
    }
}
