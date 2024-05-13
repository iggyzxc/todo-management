package com.iggyzxc.todomanagement.service;

import com.iggyzxc.todomanagement.dto.LoginDTO;
import com.iggyzxc.todomanagement.dto.RegisterDTO;

public interface AuthService {
    String register(RegisterDTO registerDTO);

    String login(LoginDTO loginDTO);
}
