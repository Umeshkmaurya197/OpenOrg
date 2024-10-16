package com.omi.openorg.service;

import com.omi.openorg.dto.APIResponseDto;
import com.omi.openorg.dto.UsersDto;
import com.omi.openorg.mapper.UsersMapper;
import com.omi.openorg.model.Users;
import com.omi.openorg.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;


    @Override
    public UsersDto addNewUser(String sessionId, UsersDto userDto) {
        log.info("Entered Inside Add New User "+ userDto);
        Users users = UsersMapper.mapToUsers(userDto);
        log.info("addNewUser =>  userDto : "+ userDto);

        Users savedUser = userRepository.save(users);
        log.info("addNewUser =>  savedUser : "+ savedUser);

        return UsersMapper.mapToUsersDto(savedUser);
    }

    //@CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
//    @Retry(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    @Override
    public APIResponseDto getUserById(Long userId) {
        log.info("inside getUserById ==> userId : "+userId);
        Users user  = userRepository.findById(userId).get();
        log.info("inside getUserById ==> user : "+user);

//        ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity("http://DEPARTMENT-SERVICE/api/departments/" + employee.getDepartmentCode(),
//                DepartmentDto.class);
//
//        DepartmentDto departmentDto = responseEntity.getBody();

//        DepartmentDto departmentDto = webClient.get()
//                .uri("http://localhost:8080/api/departments/" + employee.getDepartmentCode())
//                .retrieve()
//                .bodyToMono(DepartmentDto.class)
//                .block();

        //  DepartmentDto departmentDto = apiClient.getDepartment(employee.getDepartmentCode());

//        OrganizationDto organizationDto = webClient.get()
//                .uri("http://localhost:8083/api/organizations/" + employee.getOrganizationCode())
//                .retrieve()
//                .bodyToMono(OrganizationDto.class)
//                .block();

        UsersDto usersDto = UsersMapper.mapToUsersDto(user);

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setUsers(usersDto);
//        apiResponseDto.setDepartment(departmentDto);
//        apiResponseDto.setOrganization(organizationDto);
        return apiResponseDto;
    }

}


