package com.omi.openorg.dto;

import java.time.LocalDateTime;

public class OrganizationDto {

    private Long organizationId;
    private String organizationName;
    private String organizationDescription;
    private String organizationCode;
//  @CreationTimestamp
    private LocalDateTime createdDate;

    public OrganizationDto() {
    }

    public OrganizationDto(Long organizationId, String organizationName, String organizationDescription, String organizationCode, LocalDateTime createdDate) {
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.organizationDescription = organizationDescription;
        this.organizationCode = organizationCode;
        this.createdDate = createdDate;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationDescription() {
        return organizationDescription;
    }

    public void setOrganizationDescription(String organizationDescription) {
        this.organizationDescription = organizationDescription;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
