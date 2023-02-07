package com.example.smallspringbootapp.model.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserResponse {
    private Long id;
    private String login;
    private String firstName;
    private String middleName;
    private String lastName;
}
