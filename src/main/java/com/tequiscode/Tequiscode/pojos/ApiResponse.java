package com.tequiscode.Tequiscode.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private String message;
    private Boolean success;
    private T data;
}
