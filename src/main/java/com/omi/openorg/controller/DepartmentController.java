package com.omi.openorg.controller;

import com.omi.openorg.dto.DepartmentDto;
import com.omi.openorg.service.IDepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/openOrg/departments")
public class DepartmentController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private IDepartmentService departmentService;

    @PostMapping("/addDepartment")
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        log.info("Entered Into saveDepartment => departmentDto :  " + departmentDto);
        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
        log.info("Exiting  from saveDepartment => savedDepartment :  " + savedDepartment);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }


}
