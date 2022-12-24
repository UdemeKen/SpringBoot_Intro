package com.tequiscode.Tequiscode.services;

import com.tequiscode.Tequiscode.pojos.ApiResponse;
import com.tequiscode.Tequiscode.pojos.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public ApiResponse<String> createUser(RegistrationRequest request){

//        Validate if email address is correct
//        Validate if user already exist
//        Save user in database if not exist
        return new ApiResponse<String>("Registration Successful", true, "Signup Successful");
    }
}
