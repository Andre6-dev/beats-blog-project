package com.springboot.blog.payload;

import lombok.Data;

@Data
public class SignUpDto {
    public String name;
    public String username;
    public String email;
    public String password;
}
