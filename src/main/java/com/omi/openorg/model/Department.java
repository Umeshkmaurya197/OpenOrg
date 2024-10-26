package com.omi.openorg.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "DEPARTMENTS_MB")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "departmentId", nullable = false)
    private Long departmentId;
    @Column(name = "departmentName")
    private String departmentName;
    @Column(name = "departmentDescription")
    private String departmentDescription;
    @Column(name = "departmentCode")
    private String departmentCode;

    public Department() {
    }

    public Department(Long departmentId, String departmentName, String departmentDescription, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
        this.departmentCode = departmentCode;
    }


}
