package com.omi.openorg.controller;

import com.omi.openorg.dto.APIResponseDto;
import com.omi.openorg.dto.UsersDto;
import com.omi.openorg.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/openOrg/user")
public class UserController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

//  http://localhost:8080/openOrg/user/addUser
    @PostMapping("/addUser")
    public ResponseEntity<UsersDto> saveEmployee(@RequestHeader String sessionId, @RequestBody UsersDto usersDto) {
        log.info("Entered Into saveEmployee => userDto :  "+usersDto);
        UsersDto savedUser = userService.addNewUser(sessionId, usersDto);
        log.info("Exiting from  saveEmployee => savedUser : "+savedUser);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

//  http://localhost:8080/openOrg/user/userId/{id}
    @GetMapping("/userId/{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long userId){
        log.info("Entered Into getEmployee => userId :  "+userId);
        APIResponseDto apiResponseDto = userService.getUserById(userId);
        log.info("Exiting from getEmployee => apiResponseDto :  "+apiResponseDto);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }

}
