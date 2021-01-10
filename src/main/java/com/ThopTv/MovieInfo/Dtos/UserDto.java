package com.ThopTv.MovieInfo.Dtos;

import org.springframework.stereotype.Component;

@Component
public class UserDto {
private String email;
private String password;

    public String getEmail() {
        return email;
    }

    public UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDto() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
