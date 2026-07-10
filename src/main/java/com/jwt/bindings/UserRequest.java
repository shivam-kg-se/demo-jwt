package com.jwt.bindings;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
 public class UserRequest {
    private String email;
    private String password;
}
