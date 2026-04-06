package com.example.validate.Service;

import com.example.validate.dto.UserDTO;
import com.example.validate.entity.User;
import com.example.validate.repository.IUserRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IServiceUser {

    @Autowired
    IUserRepository userRepository;

    @Override
    public void save(UserDTO userDTO) {
        User user = new User();

        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setAge(userDTO.getAge());
        user.setEmail(userDTO.getEmail());

        userRepository.save(user);
    }
}
