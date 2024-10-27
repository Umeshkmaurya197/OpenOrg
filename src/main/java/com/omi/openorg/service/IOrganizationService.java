package com.omi.openorg.service;

import com.omi.openorg.dto.OrganizationDto;

public interface IOrganizationService {

    public OrganizationDto saveOrganization(OrganizationDto organizationDto);

    public OrganizationDto getOrganizationByCode(String organizationCode);

}
