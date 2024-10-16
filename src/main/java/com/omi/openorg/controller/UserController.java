package com.omi.openorg.controller;

import com.omi.openorg.dto.APIResponseDto;
import com.omi.openorg.dto.UsersDto;
import com.omi.openorg.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/openOrg")
public class UserController {

    @Autowired
    private IUserService userService;

//  http://localhost:8080/openOrg/addUser
    @PostMapping("/addUser")
    public ResponseEntity<UsersDto> saveEmployee(@RequestHeader String sessionId, @RequestBody UsersDto usersDto) {
        UsersDto savedUser = userService.addNewUser(sessionId, usersDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

//  http://localhost:8080/openOrg/user/{id}
    @GetMapping("/user/{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long userId){
        APIResponseDto apiResponseDto = userService.getUserById(userId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
