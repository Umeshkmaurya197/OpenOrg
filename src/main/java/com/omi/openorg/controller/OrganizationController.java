package com.omi.openorg.controller;

import com.omi.openorg.dto.OrganizationDto;
import com.omi.openorg.service.IOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/openOrg/organization")
public class OrganizationController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    IOrganizationService organizationService;

//  http://localhost:8080/openOrg/organization/add-org
    @PostMapping("add-org")
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        log.info("Entering into saveOrganization =>  organizationDto : "+organizationDto);
        OrganizationDto savedOrganization = organizationService.saveOrganization(organizationDto);
        log.info("Exiting from saveOrganization =>  savedOrganization : "+savedOrganization);
        return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
    }

//  http://localhost:8080/openOrg/organization/getDepartmentById/{department-code}
    @GetMapping("/getOrganizationById/{organizationCode}")
    public ResponseEntity<OrganizationDto> getOrganization(@PathVariable("organizationCode") String organizationCode){
        log.info("Entering into getOrganization =>  organizationCode : "+organizationCode);
        OrganizationDto organizationDto = organizationService.getOrganizationByCode(organizationCode);
        log.info("Exiting from getOrganization =>  organizationDto : "+organizationDto);
        return ResponseEntity.ok(organizationDto);
    }


}
