package com.omi.openorg.dto;


import lombok.ToString;


@ToString
public class UsersDto {

    Long userId;
    String userName;
    String userType;

    public UsersDto() {
    }

    public UsersDto(Long userId, String userName, String userType) {
        this.userId = userId;
        this.userName = userName;
        this.userType = userType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
