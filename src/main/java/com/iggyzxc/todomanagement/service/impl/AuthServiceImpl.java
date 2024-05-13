package com.iggyzxc.todomanagement.service.impl;

import com.iggyzxc.todomanagement.entity.Role;
import com.iggyzxc.todomanagement.entity.User;
import com.iggyzxc.todomanagement.exception.TodoAPIException;
import lombok.AllArgsConstructor;
import com.iggyzxc.todomanagement.dto.RegisterDTO;
import com.iggyzxc.todomanagement.repository.RoleRepository;
import com.iggyzxc.todomanagement.repository.UserRepository;
import com.iggyzxc.todomanagement.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    @Override
    public String register(RegisterDTO registerDTO) {

        if (userRepository.existsByUsername(registerDTO.getUsername())) {
            throw new TodoAPIException(HttpStatus.BAD_REQUEST, "Username already exists.");
        }

        if (userRepository.existsByEmail(registerDTO.getEmail())) {
            throw new TodoAPIException(HttpStatus.BAD_REQUEST, "Email already exists.");
        }

        User user = new User();
        user.setName(registerDTO.getName());
        user.setUsername(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(passwordEncoder.encode(registerDTO.getPassword()));

        Set<Role> roles = new HashSet<>();
        Role userRole = roleRepository.findByName("ROLE_USER");

        roles.add(userRole);

        user.setRoles(roles);

        userRepository.save(user);

        return "User registered successfully";
    }
}
