package com.example.validate.Service;

import com.example.validate.dto.UserDTO;
import com.example.validate.entity.User;

public interface IServiceUser {
    void save(UserDTO userDTO);
}
