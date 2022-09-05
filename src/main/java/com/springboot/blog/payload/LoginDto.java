package com.springboot.blog.payload;

import lombok.Data;

@Data
public class LoginDto {
    public String usernameOrEmail;
    public String password;
}
