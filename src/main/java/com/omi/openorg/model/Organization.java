package com.omi.openorg.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@Entity(name = "ORGANIZATION_MB")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "organizationId", nullable = false)
    private Long organizationId;
    private String organizationName;
    private String organizationDescription;
    @Column(nullable = false, unique = true)
    private String organizationCode;
    @CreationTimestamp(source = SourceType.DB)
    private LocalDateTime createdDate;

    public Organization() {
    }

    public Organization(Long organizationId, String organizationName, String organizationDescription, String organizationCode, LocalDateTime createdDate) {
        this.organizationName = organizationName;
        this.organizationDescription = organizationDescription;
        this.organizationCode = organizationCode;
        this.createdDate = createdDate;
    }
}
