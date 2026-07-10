package com.jwt.bindings;

import lombok.Builder;
import lombok.Data;

@Data
public class UserResponse {
    private String jwtToken;
    private String email;
}
