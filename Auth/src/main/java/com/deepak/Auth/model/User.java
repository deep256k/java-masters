package com.deepak.Auth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String userName;
    String password;
    String authToken;
    Boolean isLoggedIn;
}
