package com.omi.openorg.dto;


import lombok.RequiredArgsConstructor;
import lombok.ToString;


@ToString
@RequiredArgsConstructor
public class UsersDto {
    String userName;
    String userType;

    public UsersDto(String userName, String userType) {
        this.userName = userName;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
