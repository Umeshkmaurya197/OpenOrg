package com.omi.openorg.mapper;


import com.omi.openorg.dto.DepartmentDto;
import com.omi.openorg.model.Department;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class DepartmentMapper  {

    @Bean
    public static Department mapToDepartment(DepartmentDto departmentDto) {
        return new Department(departmentDto.getDepartmentId(), departmentDto.getDepartmentName(), departmentDto.getDepartmentDescription(), departmentDto.getDepartmentCode());
    }

    @Bean
    public static DepartmentDto mapToDepartmentDto(Department savedDepartment) {
        return new DepartmentDto(savedDepartment.getDepartmentId(), savedDepartment.getDepartmentName(), savedDepartment.getDepartmentDescription(), savedDepartment.getDepartmentCode());
    }
}
