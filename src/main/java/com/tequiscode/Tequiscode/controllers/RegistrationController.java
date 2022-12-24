package com.tequiscode.Tequiscode.controllers;

import com.tequiscode.Tequiscode.pojos.ApiResponse;
import com.tequiscode.Tequiscode.pojos.RegistrationRequest;
import com.tequiscode.Tequiscode.services.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping("/api/v1/register")
    public ApiResponse<String> registerUser(@RequestBody RegistrationRequest request){
        return registrationService.createUser(request);
    }
}
