package com.omi.openorg.mapper;

import com.omi.openorg.dto.UsersDto;
import com.omi.openorg.model.Users;

public class UsersMapper  {

    public static UsersDto mapToUsersDto(Users users){
        return new UsersDto(users.getUserId(), users.getUserName(),users.getUserType());
    }

    public static Users mapToUsers(UsersDto usersDto){
        return new Users(usersDto.getUserName(),usersDto.getUserType());
    }




}
