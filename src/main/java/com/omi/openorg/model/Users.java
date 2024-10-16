package com.omi.openorg.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity(name = "USERS_MB")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "userId", nullable = false)
    private Long userId;

    private String userName;
    private String userType;

    public Users() {
    }

    public Users(String userName, String userType) {
        this.userName = userName;
        this.userType = userType;
    }


}
