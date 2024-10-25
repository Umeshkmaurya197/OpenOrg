package com.omi.openorg.dto;


import lombok.RequiredArgsConstructor;
import lombok.ToString;


@ToString

public class DepartmentDto {

    private Long departmentId;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;

    public DepartmentDto() {
    }

    public DepartmentDto(Long departmentId, String departmentName, String departmentDescription, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
        this.departmentCode = departmentCode;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
