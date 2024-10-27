package com.omi.openorg.service;

import com.omi.openorg.dto.OrganizationDto;
import com.omi.openorg.mapper.OrganizationMapper;
import com.omi.openorg.model.Organization;
import com.omi.openorg.repository.OrganizationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements IOrganizationService{

    private static final Logger log = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Autowired
    OrganizationMapper organizationMapper;

    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
       log.info("Entering into saveOrganization => organizationDto : "+organizationDto);
        Organization organization = organizationMapper.mapToOrganization(organizationDto);
        log.info("saveOrganization => organization : "+organization);
        Organization savedOrganization = organizationRepository.save(organization);
        log.info("saveOrganization => savedOrganization : "+savedOrganization);
        OrganizationDto  organizationdto=organizationMapper.mapToOrganizationDto(savedOrganization);
        log.info("saveOrganization => organizationdto : "+organizationdto);
        return organizationdto;
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        log.info("Entering into getOrganizationByCode => organizationCode : "+organizationCode);
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        log.info("saveOrganization => organization : "+organization);
        OrganizationDto organizationDto = organizationMapper.mapToOrganizationDto(organization);
        log.info("saveOrganization => organizationDto : "+organizationDto);
        return organizationDto;
    }
}
