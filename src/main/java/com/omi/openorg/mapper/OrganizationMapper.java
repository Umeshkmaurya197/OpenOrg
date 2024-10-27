package com.omi.openorg.mapper;


import com.omi.openorg.dto.OrganizationDto;
import com.omi.openorg.model.Organization;
import org.springframework.stereotype.Component;

@Component
public class OrganizationMapper  {

    public static OrganizationDto mapToOrganizationDto(Organization savedOrganization) {
        return  new OrganizationDto(savedOrganization.getOrganizationId(),savedOrganization.getOrganizationName(), savedOrganization.getOrganizationDescription(),savedOrganization.getOrganizationCode(),savedOrganization.getCreatedDate());
    }

    public Organization mapToOrganization(OrganizationDto organizationDto) {
        return new Organization(organizationDto.getOrganizationId(), organizationDto.getOrganizationName(), organizationDto.getOrganizationDescription(),organizationDto.getOrganizationCode(),organizationDto.getCreatedDate());
    }
}
