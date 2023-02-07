package com.example.smallspringbootapp.service;

import com.example.smallspringbootapp.model.request.CreateUserRequest;
import com.example.smallspringbootapp.model.response.UserResponse;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface UserService {

    @NotNull
    List<UserResponse> findAll();

    @NotNull
    UserResponse findById(@NotNull Long userId);

    @NotNull
    UserResponse createUser(@NotNull CreateUserRequest request);

    @NotNull
    UserResponse update(@NotNull Long userId,@NotNull CreateUserRequest request);

    @NotNull
    void delete(@NotNull Long userId);
}
