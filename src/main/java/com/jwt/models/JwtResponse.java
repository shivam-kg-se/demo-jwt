package com.jwt.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    // use lower-case field names so Lombok generates builder methods
    // that match how the controller constructs the response
    private String jwtToken;
    private String username;

}
