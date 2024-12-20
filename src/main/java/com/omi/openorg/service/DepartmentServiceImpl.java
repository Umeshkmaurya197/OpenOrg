package com.omi.openorg.service;

import com.omi.openorg.dto.DepartmentDto;
import com.omi.openorg.mapper.DepartmentMapper;
import com.omi.openorg.model.Department;
import com.omi.openorg.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements IDepartmentService{

    private static final Logger log = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        log.info("Entered into saveDepartment => departmentDto : " + departmentDto);
        Department department = departmentMapper.mapToDepartment(departmentDto);
        log.info("saveDepartment => department : " + department);
        Department savedDepartment = departmentRepository.save(department);
        log.info("saveDepartment => savedDepartment : " + savedDepartment);
        DepartmentDto savedDepartmentDto = departmentMapper.mapToDepartmentDto(savedDepartment);
        log.info("Exiting from saveDepartment => savedDepartmentDto : " + savedDepartmentDto);
        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        log.info("Entered into getDepartmentByCode => departmentCode : " + departmentCode);
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        log.info("Entered into getDepartmentByCode => department : " + department);
        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);
        log.info("Entered into getDepartmentByCode => departmentDto : " + departmentDto);
        return departmentDto;
    }

}




