package com.tequiscode.Tequiscode.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class RegistrationRequest {
    private String name;
    private String email;
    private String password;
}
