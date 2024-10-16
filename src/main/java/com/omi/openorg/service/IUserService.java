package com.omi.openorg.service;


import com.omi.openorg.dto.APIResponseDto;
import com.omi.openorg.dto.UsersDto;

public interface IUserService{

    public UsersDto addNewUser(String sessionId, UsersDto userDto);

    APIResponseDto getUserById(Long userId);
}
